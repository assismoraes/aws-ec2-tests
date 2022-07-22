FROM openjdk:11

WORKDIR /usr/src/myapp
RUN ls
COPY build/libs/securityspring-0.0.1.jar /usr/src/myapp/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]