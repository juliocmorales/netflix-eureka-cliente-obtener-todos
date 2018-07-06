FROM java:8-alpine
VOLUME /listalibros
ADD target/netflix-eureka-cliente-obtener-todos-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch app.jar'
EXPOSE 8094
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/app.jar"]