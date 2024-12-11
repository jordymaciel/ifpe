variable "region" {
  description = "Região AWS"
  default     = "us-east-1" # Substitua pela sua região preferida
}

variable "instance_type" {
  description = "Tipo da instância EC2"
  default     = "t2.micro"
}

variable "ami_id" {
  description = "AMI para a instância"
}
