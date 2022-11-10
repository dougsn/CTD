variable "aws_region_id" {
description = "the region"
type = string
default = "us-east-1"
}
variable "main_vpc_cidr" {
description = "Nosso Security Group"
type = string
default = "10.0.0.0/24"
}
variable "public_subnets" {
description = "subnet com acesso a internet"
type = string
default = "10.0.0.128/26"
}
variable "private_subnets" {
description = "subnet sem acesso a internet"
type = string
default = "10.0.0.192/26"
}