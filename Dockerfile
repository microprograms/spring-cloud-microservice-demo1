FROM openjdk:8-jre
ADD target/spring-cloud-microservice-demo1-1.0.0.jar app.jar
EXPOSE 8001
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]