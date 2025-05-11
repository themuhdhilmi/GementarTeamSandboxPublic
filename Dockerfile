FROM openjdk:21-slim

WORKDIR /app

COPY benda-pelik-lol.jar app.jar

CMD ["java", "-jar", "app.jar"]