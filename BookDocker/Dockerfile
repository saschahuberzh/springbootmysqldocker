FROM openjdk:8
ADD target/bookservice.jar bookservice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "bookservice.jar"]