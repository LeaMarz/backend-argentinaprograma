FROM amazoncorretto:11-alpine-jdk
MAINTAINER LMarzonetto
COPY target/yoProgramo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
