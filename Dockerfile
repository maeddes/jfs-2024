# Use the official OpenJDK 21 image as a base image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/application.jar

# Expose the port your application will run on (optional, adjust as needed)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "application.jar"]
