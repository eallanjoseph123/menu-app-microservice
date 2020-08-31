FROM openjdk:8-jre-alpine

WORKDIR /app

COPY target/cart-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "cart-0.0.1-SNAPSHOT.jar"]