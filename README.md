# 📦 Spring Boot SOLID Order System

Projeto desenvolvido para demonstrar a aplicação dos princípios SOLID e conceitos de Clean Architecture utilizando Java + Spring Boot.

---

# 🚀 Tecnologias

- Java 17
- Spring Boot
- Spring Web
- JPA/Hibernate
- H2 Database
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

- Clean Architecture
- Separation of Concerns
- DTO Pattern
- Strategy Pattern
- Dependency Injection
- Use Case Pattern
- Domain Layer Separation

---

# 📂 Estrutura do Projeto

```bash
src/main/java/dev/alita/solid

├── application
│   ├── dto
│   ├── service
│   └── usecase
│
├── domain
│   ├── entity
│   ├── enums
│   ├── service
│   └── strategy
│
├── infrastructure
│   ├── notification
│   └── repository
│
├── interfaces
│   └── controller
│
└── SolidApplication.java
```

---

# 🔥 Funcionalidades

- ✅ Cadastro de pedidos
- ✅ Aplicação de desconto baseada em estratégia
- ✅ Clientes REGULAR, VIP e PREMIUM
- ✅ Validação de clientes
- ✅ Envio de notificações por e-mail
- ✅ Separação de responsabilidades
- ✅ Arquitetura desacoplada
- ✅ Uso de DTOs para entrada e saída
- ✅ Inversão de dependência com interfaces

---

# 🧠 Objetivo do Projeto

Este projeto foi criado com foco em:

- boas práticas de desenvolvimento
- clean code
- arquitetura escalável
- aprendizado de SOLID
- aplicação prática de Clean Architecture
- preparação para projetos enterprise
- estudos avançados de Spring Boot

---
# 🧩 Padrões Utilizados
## Strategy Pattern

O cálculo de desconto foi implementado utilizando Strategy Pattern, permitindo extensão de novas regras sem modificar código existente.

Exemplo:

- VipDiscountStrategy
- PremiumDiscountStrategy
- RegularDiscountStrategy
# 🔄 Fluxo da Aplicação
```
Controller
   ↓
UseCase
   ↓
Domain Services / Strategies
   ↓
Repository
   ↓
Notification Service
```

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

# 🗄️ Banco H2

O projeto utiliza H2 Database para desenvolvimento e testes.

Acessar console do H2
```
http://localhost:8080/h2-console
```

# 📌 Endpoint

## Criar pedido

POST `/orders`

### Body

```json
{
  "customerId": 1,
  "total": 1000
}
```

---

# 👩‍💻 Autor

Desenvolvido por Alita Kallyne
