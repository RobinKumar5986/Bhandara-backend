# Spring Starter

![Java](https://img.shields.io/badge/Java-11-blue?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.2-brightgreen?style=flat-square)

## Overview
`Spring Starter` is a Spring Boot project that provides a basic structure with the MVC architecture, ideal for quickly starting new Spring Boot applications. This starter project includes the foundational components such as `JPA` annotations, `database` connection configurations, and `API documentation` using Swagger. It serves as a starting point for building scalable and maintainable applications with Spring Boot, including RESTful APIs and database interactions.

# Database Connection Configuration
```
spring.datasource.url=jdbc:mysql://localhost:3306/curd_test?useSSL=false&allowPublicKeyRetrieval=true&zeroDateTimeBehavior=CONVERT_TO_NULL
spring.datasource.username=<USER_NAME>  # Example: root
spring.datasource.password=<YOUR_DB_PASSWORD>  # Example: your_password_here

```
# JPA Configuration

```
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```
Configure the above in the applications.properties file

![image.png](https://assets.leetcode.com/users/images/5427e383-6b09-4ec8-81c2-c5eae02ab9d7_1738618455.9265134.png)

## API Documentation

Once the project is running, you can easily access the API documentation via Swagger UI.

Simply open your browser and navigate to the following URL:

`http://localhost:9090/swagger-ui/index.html`


This will provide an interactive interface where you can view and test all the available API endpoints for your application.
