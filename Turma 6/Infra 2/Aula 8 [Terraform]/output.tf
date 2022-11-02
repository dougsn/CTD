#output é tipo sysout.print.ln ou 
#console.log ele vai mostrar algo no terminal

#Dados do SG Privado
output "private_security_group_arn" {
  #descrição sabermos o que vai ser impresso no terminal
  description = "O ARN do security group"
  #o que vai ser impresso, estou pedindo o identificador ARN do security gourp recem croado
  value       = aws_security_group.allow_ssh_priv.arn
}

output "private_security_group_id" {
  description = "The ID of the security group"
  value       = aws_security_group.allow_ssh_priv.id
}

output "private_security_group_name" {
  description = "The name of the security group"
  value       = aws_security_group.allow_ssh_priv.name
}


#Dados do SG Público
output "public_security_group_arn" {
  #descrição sabermos o que vai ser impresso no terminal
  description = "O ARN do security group"
  #o que vai ser impresso, estou pedindo o identificador ARN do security gourp recem croado
  value       = aws_security_group.allow_ssh_pub.arn
}

output "public_security_group_id" {
  description = "The ID of the security group"
  value       = aws_security_group.allow_ssh_pub.id
}

output "public_security_group_name" {
  description = "The name of the security group"
  value       = aws_security_group.allow_ssh_pub.name
}