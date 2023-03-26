FROM amazoncorretto:11-alpine-jdk
MAINTAINER Mauricio
COPY build/libs/mdn-0.0.1-SNAPSHOT.jar mdn-app.jar
ENTRYPOINT ["java","-jar","/mdn-app.jar"]
