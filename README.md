# 📦 Spring Boot SOLID Order System

Projeto desenvolvido para demonstrar a aplicação dos princípios SOLID utilizando Java + Spring Boot.

---

# 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- JPA/Hibernate
- Maven

---

# 📚 Conceitos aplicados

## SOLID

- Single Responsibility Principle
- Open/Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle

---

# 🏗️ Arquitetura

O projeto foi organizado utilizando:

- Controller Layer
- Service Layer
- Repository Layer
- DTO Pattern
- Strategy Pattern
- Dependency Injection

---

# 📂 Estrutura do Projeto

```bash
src/main/java/com/example/ordersystem

controller/
service/
repository/
strategy/
dto/
entity/
```

---

# 🔥 Funcionalidades

✅ Cadastro de pedidos  
✅ Aplicação de desconto para clientes VIP  
✅ Estratégia de descontos  
✅ Envio de notificações  
✅ Separação de responsabilidades  

---

# 🧠 Objetivo do Projeto

Este projeto foi criado com foco em:

- boas práticas
- clean code
- arquitetura escalável
- preparação para projetos enterprise
- estudos avançados de Spring Boot

---

# ▶️ Como executar

## Clone o projeto

```bash
git clone https://github.com/alitakallyne/springboot-solid-order-system.git
```

## Entre na pasta

```bash
cd springboot-solid-order-system
```

## Execute

```bash
./mvnw spring-boot:run
```

---

# 📌 Endpoint

## Criar pedido

POST `/orders`

### Body

```json
{
  "customerName": "Alita",
  "total": 1000,
  "vip": true
}
```

---

# 👩‍💻 Autor

Desenvolvido por Alita Kallyne