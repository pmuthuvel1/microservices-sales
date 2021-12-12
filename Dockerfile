#FROM openjdk:8-jdk-alpine
FROM azul/zulu-openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sales.jar
ENTRYPOINT ["java","-jar","/sales.jar"]