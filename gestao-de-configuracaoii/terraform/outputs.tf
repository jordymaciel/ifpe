output "instance_id" {
  description = "ID da instância criada"
  value       = aws_instance.example.id
}

output "public_ip" {
  description = "IP público da instância"
  value       = aws_instance.example.public_ip
}
