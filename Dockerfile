# Etapa 1: Build
FROM eclipse-temurin:21-jdk AS builder
WORKDIR /inventario

# Copiar todos los archivos del proyecto
COPY . .

# Dar permisos al wrapper si es necesario y construir el proyecto
RUN ./mvnw clean package -DskipTests

# Etapa 2: Runtime
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copiar el JAR construido desde la etapa builder
COPY --from=builder /inventario/target/*.jar app.jar

# Exponer el puerto
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]
