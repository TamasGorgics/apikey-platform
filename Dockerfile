FROM openjdk:14-alpine

ARG version=0.1.0
ARG hash=undefined

LABEL app=apikey-platform
LABEL version=$version
LABEL hash=$hash

EXPOSE 8080

ENV DEPENDENCIES=postgresdb:5432

WORKDIR /
ADD bootstrap /bootstrap
ADD build/libs/apikey-platform-${version}.jar app.jar

CMD ["./bootstrap"]
