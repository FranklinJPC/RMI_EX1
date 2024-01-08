# Definir la imagen base JAVA
FROM openjdk:latest
# Copia los archivos compilados al contenedor 
COPY . /app
# Definir el directorio de trabajo
WORKDIR /app
# Compila archivos de JAVA
RUN javac *.java
# Expone el puerto utilizado por el RMI
EXPOSE 1099
# Inicia el servidor RMI al ejecutar el contenedor
CMD ["java", "ServidorRMI"]

