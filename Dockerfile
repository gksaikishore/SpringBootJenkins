FROM openjdk:8
ADD target/demo-spring-boot.jar demo-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/demo-spring-boot.jar"]
