Requirements
  Java 8 or above
  Maven 3.5 or higher
  IDE (e.g., IntelliJ, Eclipse) or a text editor
  Optional: Postman or curl for testing the API

Access the API:
  http://localhost:8080/courses


Project Structure:

Projext structure
├── src
│   └── main
│     ├── java
│     │   └── com.example.project
│     │       ├── controller
|     |        └──MyController
│     │       |
│     │       ├── service
|     |                 └── CourseServiceImpl
|     |                 └── CourseService
│     │       ├── Entity 
|     |       |          └──Course  
│     │       └── RestProjectApplication
│     └── resources
│          └── application.properties
│   
├── pom.xml
└── README.md

# Application port
server.port=8080

# CORS configuration
cors.allowedOrigins=http://localhost:3000
cors.allowedMethods=GET, POST, PUT, DELETE


Dependices
<dependencies>
    <!-- Spring Boot Dependencies -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Data JPA for persistence -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- Other dependencies -->
</dependencies>


