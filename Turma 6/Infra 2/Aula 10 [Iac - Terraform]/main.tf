
# Nós criamos nossoVPC

resource "aws_vpc" "Main" { # usamos o bloco "resource", o "provider element" e um "rótulo"
cidr_block = var.main_vpc_cidr # Passamos o bloco CIDR que desejo usar como variável
instance_tenancy = "default"
tags = {
Name = "My_VPC"
}
}


# ============================================== ============================
# Criamos um Internet Gateway "E" o associamos ao PC que acaba de ser criado

# Criamos um Gateway de Internet "Y" e o associamos ao VPC que acaba de ser criado
resource "aws_internet_gateway" "IGW" { # Internet Gateway
vpc_id = aws_vpc.Main.id # saberemos o vpc_id apenas quando o VPC for criado
tags = {
Name = "IGW"
}
}

# Nós criamos a sub-rede pública
resource "aws_subnet" "public_subnets" { # criamos as subnets públicas
vpc_id = aws_vpc.Main.id
cidr_block = var.public_subnets # CIDR block para minhas public subnets
tags = {
Name = "Public Subnet"
}
}

# ========================================== = ============================
# Nós criamos a sub-rede privada # Nós criamos nossa sub-redes privada
resource "aws_subnet" "private_subnets" {
vpc_id = aws_vpc.Main.id
cidr_block = var.private_subnets # CIDR block para minhas subnets privadas
tags = {
Name = "Private Subnet"
}
}

# ======================================================================== roteamento
# Tabela depara sub-rede pública

resource "aws_route_table" "Public_RT" { # Criamos nossa Tabela de Rotas para a sub-rede pública
vpc_id = aws_vpc.Main.id
route {
cidr_block = "0.0.0.0/0" # Declaramos que o tráfego da sub-rede pública chega à Internet a partir do gateway da Internet
gateway_id = aws_internet_gateway.IGW.id
}
tags = {
Name = "Tabela de rotas Pública"
}
}
# ====================================================================== roteamento
# Tabela depara sub-rede privada
resource "aws_route_table" "Private_RT" { # Criação de RT para sub-rede privada
vpc_id = aws_vpc.Main.id
route {
cidr_block = "0.0.0.0/0" # Tráfego proveniente da sub-rede privada que chega à Internet via Gateway NAT
nat_gateway_id = aws_nat_gateway.NAT_GW.id
}
tags = {
    Name = "Tabela de Rotas Privada"
}
}


# ======================================== == =============================rota
# Associação de tabela de sub-rede pública
resource "aws_route_table_association" "Public_RT_Association" {
subnet_id = aws_subnet.public_subnets.id
route_table_id = aws_route_table.Public_RT.id
}

# ================================================ = ==================
# Associação de tabela de roteamento com sub-rede privada
resource "aws_route_table_association" "Private_RT_Association" {
subnet_id = aws_subnet.private_subnets.id
route_table_id = aws_route_table.Private_RT.id
}
resource "aws_eip" "NAT_EIP" {
vpc = true
tags = {
Name = "NAT com elastic IP"
}
}
# ======================================= == =========================

# Criação do NAT gateway usando subnet_id e allocation_id
resource "aws_nat_gateway" "NAT_GW" {
allocation_id = aws_eip.NAT_EIP.id
subnet_id = aws_subnet.public_subnets.id
tags = {
Name = "NAT Gateway alocada na subnet pública"
}
}