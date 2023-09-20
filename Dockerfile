FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 6868
CMD ["java", "-jar", "app.jar"]
