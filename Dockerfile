FROM openjdk
WORKDIR user/src/myapp
CMD [ "java", "-jar", "DockerDemoApplication-0.0.1-SNAPSHOT.jar"]