FROM openjdk:8
EXPOSE 8080
ADD target/entrevueSpringBoot-0.0.1-SNAPSHOT.jar entrevueSpringBoot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "entrevueSpringBoot-0.0.1-SNAPSHOT.jar"]
