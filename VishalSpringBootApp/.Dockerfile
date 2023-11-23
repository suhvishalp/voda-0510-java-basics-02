# For Java 8, try this
# FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre




# cp target/spring-boot-web.jar /opt/app/app.jar
COPY target/vishalspringbootapp.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","vishalspringbootapp.jar"]