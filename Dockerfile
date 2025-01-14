FROM gradle:8-jdk11-corretto AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle buildFatJar --no-daemon

FROM openjdk:11
EXPOSE 8080:8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/link-saver_server.jar
ENTRYPOINT ["java", "-jar", "/app/link-saver_server.jar"]