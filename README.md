## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- Hibernate
- Lombok
- Maven

## 🧱 Arquitetura

O projeto segue o padrão de arquitetura em camadas:

- **Controller**: responsável pelas requisições HTTP
- **Service**: regras de negócio
- **Repository**: acesso a dados
- **DTOs**: entrada e saída de dados
- **Mapper**: conversão entre Entity e DTO

## ▶️ Como executar o projeto

### Pré-requisitos
- Java 21+
- Maven

### Executando a aplicação
```bash
mvn spring-boot:run
