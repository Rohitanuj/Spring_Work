# Spring  REST API 

**A simple Spring Boot 2.x app for CRUD operations for Courses of  user**

## How to Run Application

**Start the application using any of the commands mentioned below**

**Requirements**

  Java 8 or above
  Maven 3.5 or higher
  IDE (e.g., IntelliJ, Eclipse) or a text editor
  Optional: Postman or curl for testing the API

**Access the API:**

  http://localhost:8080/courses

# Application port
server.port=8080

> **Note:** By default spring boot application starts on port number 8080. If port 8080 is occupied in your system then you can change the port number by uncommenting and updating the **server.port** property inside the **application.properties** file that is available inside the **src > main > resources** folder.
Send an HTTP GET request to '/courses' endpoint using any of the two methods

**Browser or REST client**

http://localhost:8080/home

**CURL**

curl --request GET 'http://localhost:8080/courses'

# CORS configuration

cors.allowedOrigins=http://localhost:3000
cors.allowedMethods=GET, POST, PUT, DELETE


**Dependices:**

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
</dependencies>


