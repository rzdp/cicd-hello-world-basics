# Use openjdk image as your parent or base image
FROM openjdk:8-jdk-alpine

# Copy the jar file from target folder to current location
ADD target/cicd-hello-world-basics-0.0.1-SNAPSHOT.jar cicd-hello-world-basics-0.0.1-SNAPSHOT.jar

# Set the command to be run at startup
ENTRYPOINT ["sh", "-c", "java -jar /cicd-hello-world-basics-0.0.1-SNAPSHOT.jar"]
