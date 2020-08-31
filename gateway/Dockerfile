FROM openjdk:8-jre-alpine

WORKDIR /app

COPY target/gateway-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "gateway-0.0.1-SNAPSHOT.jar"]