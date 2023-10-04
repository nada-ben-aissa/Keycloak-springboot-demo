FROM eclipse-temurin:17-jdk
EXPOSE 8081
ARG JAR_FILE=target/keycloack-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]