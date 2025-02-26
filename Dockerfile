# Stage 1: Build the application using Maven
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the application
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Use JDK to run the application
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/bhandara-api-0.0.1-SNAPSHOT.jar .

# Expose port number 9090
EXPOSE 9090

# Run the application
ENTRYPOINT ["java", "-jar", "/app/bhandara-api-0.0.1-SNAPSHOT.jar"]