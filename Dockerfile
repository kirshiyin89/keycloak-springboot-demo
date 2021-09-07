FROM openjdk:11.0.7-jre-slim
WORKDIR /app
EXPOSE 8080
COPY /build/libs/KeycloakSpringBootDemo-0.0.1-SNAPSHOT.jar ./app.jar
CMD java $JAVA_OPTIONS -jar app.jar
