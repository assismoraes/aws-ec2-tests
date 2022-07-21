FROM openjdk:11

COPY build/libs/securityspring-0.0.1.jar /usr/src/myapp/securityspring.jar
WORKDIR /usr/src/myapp
RUN ls

ENTRYPOINT ["java", "-jar", "securityspring.jar"]