# Workshop Spring Boot com MongoDB

Este projeto é um **workshop prático** de desenvolvimento com **Spring Boot**, utilizando o **MongoDB** como banco de dados.

## 📌 Funcionalidades

A API oferece os seguintes endpoints para gerenciamento de usuários:

- **Listar todos os usuários:** `GET /users`
- **Buscar usuário por ID:** `GET /users/{id}`
- **Inserir novo usuário:** `POST /users`
- **Deletar usuário:** `DELETE /users/{id}`
- **Atualizar usuário:** `PUT /users/{id}`

## 📂 Estrutura do Projeto

src/
├── config/ # Classes de configuração (ex: Instantiation.java para popular o banco)
├── domain/ # Entidades de domínio (ex: User.java, Post.java)
├── dto/ # Data Transfer Objects (ex: UserDTO.java)
├── repository/ # Interfaces de repositório (ex: UserRepository.java, PostRepository.java)
├── resources/ # Controladores REST (ex: UserResource.java)
├── services/ # Lógica de negócio (ex: UserService.java)
└── exception/ # Exceções personalizadas (ex: ObjectNotFoundException.java)


## 🛠 Tecnologias Utilizadas

- **Spring Boot** – Framework para criação de aplicações Java
- **Spring Data MongoDB** – Integração com o MongoDB
- **MongoDB** – Banco de dados NoSQL orientado a documentos

---

💡 *Projeto desenvolvido como parte de um workshop prático para estudo de integração entre Spring Boot e MongoDB.*
