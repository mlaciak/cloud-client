FROM openjdk:11-jre
EXPOSE 7878
RUN mkdir /app
COPY * /app/
WORKDIR /app/
ARG ENVIRONMENT=test
ENV env=$ENVIRONMENT
ENTRYPOINT java -Dspring.profiles.active=$env -jar /app/app.jar