FROM maven:3.8.3-openjdk-17 as builder

COPY . .

RUN mvn clean package

FROM tomcat:latest
COPY --from=builder /target/*.war /usr/local/tomcat/webapps/
EXPOSE 8020
CMD ["catalina.sh", "run"]