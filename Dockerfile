FROM alpine:3.21.2

RUN apk add openjdk21
COPY build/libs/book-api.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]