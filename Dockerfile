FROM openjdk:11

EXPOSE 8080

RUN apt-get update  
RUN apt-get install -y maven

ADD target/pipeline.jar pipeline.jar
ENTRYPOINT ["java","-jar","pipeline.jar"]
