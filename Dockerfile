# Usando uma imagem base do Maven para construir a aplicação
FROM maven:3.8.6-openjdk-17 AS builder

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o pom.xml e o diretório src para o contêiner
COPY pom.xml .
COPY src ./src

# Executa o Maven para construir a aplicação, pulando os testes
RUN mvn clean package -DskipTests

# Usando uma imagem base do OpenJDK para executar a aplicação
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o JAR da aplicação construída do estágio anterior
COPY --from=builder /app/target/avengers.jar app.jar

# Exponha a porta em que sua aplicação será executada
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]
