FROM openjdk:8
EXPOSE 8181
ADD target/docker-hello-word.jar docker-hello-word.jar
ENTRYPOINT ["java","-jar","/docker-hello-word.jar"]