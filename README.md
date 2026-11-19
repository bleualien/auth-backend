
# Auth Backend

A secure authentication backend built with Spring Boot 3.5, Spring Security, JWT, PostgreSQL, and OAuth2 (Google & GitHub).

## 🚀 Tech Stack

- Java 17+
- Spring Boot 3.5
- Spring Security
- Spring Data JPA
- JWT Authentication
- OAuth2 (Google & GitHub)
- PostgreSQL
- Maven

## ✨ Features

- User registration and login
- JWT access and refresh tokens
- Google OAuth2 authentication
- GitHub OAuth2 authentication
- Secure REST APIs
- Access token refresh
- Logout and token invalidation
- PostgreSQL database integration

## 📋 Prerequisites

- Java 17+
- Maven 3.9+
- PostgreSQL
- Git

## ⚙️ Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/bleualien/auth-backend.git
cd auth-backend
```

### 2. Create PostgreSQL Database

```sql
CREATE DATABASE auth_app;
```

### 3. Configure Environment Variables

Configure the following environment variables:

```env
DB_PASSWORD=your-database-password
JWT_SECRET=your-random-long-secret
GOOGLE_CLIENT_ID=your-google-client-id
GOOGLE_CLIENT_SECRET=your-google-client-secret
GITHUB_CLIENT_ID=your-github-client-id
GITHUB_CLIENT_SECRET=your-github-client-secret
```

### 4. Configure application.yml

Update your database and OAuth2 configuration in `src/main/resources/application.yml`.

Make sure the configuration uses your actual PostgreSQL credentials and environment variables.

### 5. Run the Application

```bash
mvn spring-boot:run
```

Backend runs at:

`http://localhost:8081`

## 🔑 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | User login |
| GET | `/api/auth/me` | Get current user |
| POST | `/api/auth/refresh` | Refresh access token |
| POST | `/api/auth/logout` | Logout |
| GET | `/oauth2/authorization/google` | Google OAuth2 login |
| GET | `/oauth2/authorization/github` | GitHub OAuth2 login |

## 🔐 OAuth2 Configuration

Configure your OAuth2 applications using:

- [Google Cloud Console](https://console.cloud.google.com/)
- [GitHub Developer Settings](https://github.com/settings/developers)

### Redirect URIs

```text
http://localhost:8081/login/oauth2/code/google
http://localhost:8081/login/oauth2/code/github
```

## 📦 Build

Package the application:

```bash
mvn clean package
```

Run the generated JAR:

```bash
java -jar target/*.jar
```

## 🛡️ Security Notes

- Never commit passwords, API keys, or OAuth2 secrets.
- Use a strong JWT secret.
- Enable HTTPS in production.
- Use secure cookies in production.
- Keep OAuth2 client secrets private.
- Store sensitive configuration in environment variables.


## 📄 License

This project is licensed under the MIT License.

