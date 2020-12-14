FROM openjdk:8-jdk-alpine

LABEL maintainer="Amol Gaikwad"

RUN apk update && apk add ca-certificates wget && update-ca-certificates

ADD kafka-producer-*.jar /kafka-producer.jar

CMD ["java", "-jar", "/kafka-producer.jar"]
