# Declaramos o provedor de nuvem com o qual queremos trabalhar com o

terraform {
# Dizemos que queremos:
# a. a versão do binário terraform maior ou igual a 0,12
required_version = ">=0.12"
required_providers {
aws = {
# Especificamos de onde queremos fazer o download do binário:
source = "hashicorp/aws"
# b. a versão binária do provedor 3.20.0 (com algumas restrições)
version = "~> 3.20.0"
}
}
}

# Declaramos a região onde queremos subir nossa infra
provider "aws" {
region = var.aws_region_id
}
