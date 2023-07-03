FROM openjdk:8-jdk
MAINTAINER LMyoProgramo
COPY target/yoProgramo-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

