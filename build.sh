#!bin/bash
./gradlew clean
./gradlew build -x test
docker build -t aws-test:0.0.1 .
docker container stop -t 0 aws-test
docker container rm aws-test