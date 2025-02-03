#Docker file always starts with FROM command which basically fetch parent or base image
#Go to Docker hub and copy the required image name
#In my case I used "eclipse-temurin" image from https://hub.docker.com/_/openjdk
#And Define java version "<Docker Base image name >:17"
From eclipse-temurin:17

#Creating "/app" working directory in container
WORKDIR /app

#Copy source jar file into /app folder in container and naming the jar file as "Docker.jar"
COPY target/Docker-0.0.1-SNAPSHOT.jar /app/Docker.jar

#Command to run the jar file
ENTRYPOINT ["java","-jar","Docker.jar"]

