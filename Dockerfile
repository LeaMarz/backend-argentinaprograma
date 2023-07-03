FROM amazoncorretto:11-alpine-jdk
MAINTAINER LMyoProgramo
COPY target/yoProgramo-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

