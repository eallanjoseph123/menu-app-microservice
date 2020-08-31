FROM openjdk:8-jre-alpine

WORKDIR /app

COPY target/discovery-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "discovery-0.0.1-SNAPSHOT.jar"]