./gradlew clean build
docker build . -t romanzhula/book-api:1.0.0
docker push romanzhula/book-api:1.0.0