FROM java:8

VOLUME /tmp

ADD target/UserProvider-0.0.1-SNAPSHOT.jar /app/UserProvider-0.0.1-SNAPSHOT.jar

WORKDIR /app/

EXPOSE 8090

CMD ["java", "-jar", "/app/UserProvider-0.0.1-SNAPSHOT.jar"]
