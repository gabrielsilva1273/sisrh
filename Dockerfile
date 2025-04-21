FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY . .

RUN mvn clean package -DskipTests

FROM tomcat:9.0-jdk21-temurin

COPY --from=builder /app/target/sisrh.war /usr/local/tomcat/webapps/sisrh.war

EXPOSE 8080


