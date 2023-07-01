FROM amazoncorretto:17
MAINTAINER LMarzonetto
COPY target/yoProgramo-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

