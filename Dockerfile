# Usando uma imagem do Maven com JDK
FROM maven:3.8.6-openjdk-17-slim AS build

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o arquivo pom.xml e o diretório src para o contêiner
COPY pom.xml .
COPY src ./src

# Executa o Maven para compilar o projeto, pulando os testes
RUN mvn clean package -DskipTests

# Fase de execução
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o JAR gerado na fase de build para a fase de execução
COPY --from=build /app/target/avengers.jar app.jar

# Exponha a porta em que sua aplicação será executada
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]
