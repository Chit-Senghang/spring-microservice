FROM gradle:8.7.0-jdk-jammy AS build
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew build

FROM eclipse-temurin:21
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8082
HEALTHCHECK --interval=30s --timeout=5s CMD curl -f http://localhost:8082 || exit 1
ENTRYPOINT ["java", "-jar", "app.jar"]
