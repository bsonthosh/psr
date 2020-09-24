FROM openjdk:11-slim
ADD ./psr-0.0.1-SNAPSHOT.jar psr-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "psr-1.0.jar"]