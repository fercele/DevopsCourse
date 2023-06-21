FROM amazoncorretto:11.0.19-al2023-headless
COPY target/springboot-maven-course-micro-svc-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
