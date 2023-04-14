FROM openjdk:11-jdk
ARG JAR_FILE=target/action-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} apps.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/apps.jar"]