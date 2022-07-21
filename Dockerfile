FROM openjdk:11

# COPY . /usr/src/myapp/
WORKDIR /usr/src/myapp
# RUN /bin/sh ./gradlew build -x test
RUN ls
# COPY build/libs/securityspring-0.0.1.jar app.jar
COPY securityspring-0.0.1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]