# Usando uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia o JAR da aplicação para o contêiner
COPY target/avengers.jar app.jar

# Exponha a porta em que sua aplicação será executada
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]
