FROM openjdk:11

WORKDIR /usr/src/myapp
RUN ls
COPY securityspring-0.0.1.jar /usr/src/myapp/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]