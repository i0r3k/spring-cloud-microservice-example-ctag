FROM @docker.image.prefix@/java:8
VOLUME /tmp
ADD movies-ui-0.1.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Xmx512m","-Xms256m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
