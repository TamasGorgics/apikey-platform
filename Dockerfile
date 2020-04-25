FROM openjdk:8-jre-alpine

ARG version=0.1.0
ARG hash=undefined

LABEL app=apikey-platform
LABEL version=$version
LABEL hash=$hash

ADD build/libs/apikey-platform-${version}.jar app.jar

RUN java -jar app.jar
