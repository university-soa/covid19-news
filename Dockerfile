FROM maven:3.6.3-openjdk-8 as builder

WORKDIR /work
COPY . /work
RUN mvn clean install

FROM openjdk:8-jdk-alpine

COPY --from=builder /work/target/covid19-news-0.0.1-SNAPSHOT.jar /.
COPY --from=builder /work/test.db.mv.db /.

EXPOSE 8081

ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "covid19-news-0.0.1-SNAPSHOT.jar"]