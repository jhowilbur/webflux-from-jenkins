FROM openjdk:8-jdk-alpine

MAINTAINER github.com/jhowilbur

COPY target/demo-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/

RUN addgroup -S wilbur && adduser -S wilbur -G wilbur
USER wilbur:wilbur
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 9000