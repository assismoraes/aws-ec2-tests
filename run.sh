#!bin/bash
docker container stop -t 0 aws-test
docker container rm aws-test
docker build -t aws-test:0.0.1 .
#docker run --name aws-test -p 80:8080 aws-test:0.0.1