# Taller de Automatización CI
Este proyecto implementa Integración Continua (CI) para una aplicación Java y la ejecución automática de pruebas unitarias

## Objetivos del Proyecto
Implementar Pruebas Unitarias con JUnit 5
Automatizar la ejecución de las pruebas unitarias usando GitHub Actions (CI)
Generar y almacenar reportes de pruebas con Surefire

## Estructura del Proyecto
El proyecto sigue la estructura estándar de Maven, separando el código de la aplicación del código de pruebas

## Archivos Clave y Configuración
- pom.xml: Gestor de dependencias

- .github/workflows/ci.yml: 
    - Define el pipeline de Integracion Continua, donde se: 
        - Configura ejecución con Java 17. 
        - Ejecuta el comando mvn clean package. Este comando compila el código y ejecuta automáticamente las pruebas unitarias. 
        - Sube los reportes generados por Surefire (en target/surefire-reports) como artefactos del build para su posterior revisión

## Ejecucion Local
Requisitos:
- JDK 17 (o superior)
- Apache Maven

Comando de Ejecución
``` bash
mvn clean package
```
