# Mini IAM

Mini IAM is a simple backend application for user management built with Java and Spring Boot.

The project is currently under development. Its goal is to gradually implement basic Identity and Access Management (IAM) functionality.

## Current Features

At the moment, the application supports:

- Creating users
- Getting a list of users
- Storing users in PostgreSQL
- Basic health check endpoint

Authentication and authorization will be added later.

## Tech Stack

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- PostgreSQL
- Lombok
- Maven

## Project Structure

```text
src/main/java/com/elaleksap/mini_iam
├── config
│   └── SecurityConfig.java
├── controller
│   ├── HealthController.java
│   └── UserController.java
├── entity
│   └── User.java
├── repository
│   └── UserRepository.java
├── service
│   └── UserService.java
└── MiniIamApplication.java
```

### Layers

- **Controller** — receives HTTP requests
- **Service** — contains application logic
- **Repository** — communicates with the database
- **Entity** — represents data stored in the database
- **Config** — contains application configuration

## Database

The application uses PostgreSQL.

Create a database:

```sql
CREATE DATABASE mini_iam;
```

Database configuration is located in:

```text
src/main/resources/application.properties
```

The database password is provided through the `DB_PASSWORD` environment variable.

Example:

```text
DB_PASSWORD=your_postgresql_password
```

Do not store database passwords directly in `application.properties`.

## Running the Application

Make sure PostgreSQL is running and the `mini_iam` database exists.

Set the `DB_PASSWORD` environment variable and run:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The application runs on:

```text
http://localhost:8081
```

## API

### Health Check

```http
GET /api/health
```

Example:

```text
GET http://localhost:8081/api/health
```

### Create User

```http
POST /api/users
Content-Type: application/json
```

Example request body:

```json
{
  "username": "lera",
  "email": "lera@example.com",
  "firstName": "Lera",
  "lastName": "Smith"
}
```

### Get Users

```http
GET /api/users
```

Example:

```text
GET http://localhost:8081/api/users
```

## Planned Features

The project is still in development. Planned improvements include:

- Request and response DTOs
- Input validation
- Better error handling
- Password hashing
- User registration
- User authentication
- JWT authentication
- Roles and permissions
- Protected API endpoints

## Purpose

This project is being developed as a learning project to understand how backend applications, databases, authentication, and authorization work with Spring Boot.
