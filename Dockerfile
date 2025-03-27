FROM openjdk:21-jdk-slim

WORKDIR /app

ARG JAR_FILE=target/EventManagement-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

LABEL authors="varunharinath"

ENTRYPOINT ["java", "-jar", "/app/app.jar"]