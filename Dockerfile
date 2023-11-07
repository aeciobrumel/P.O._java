# Use uma imagem Java como base
FROM openjdk:21

# Defina o diretório de trabalho
WORKDIR /app

# Copie todos os arquivos do diretório "src" para o contêiner
COPY /Agenda/src/ /app/src/

# Compile o código Java
RUN javac src/*.java

# Execute o aplicativo Java
CMD ["java", "-cp", "src", "App"]