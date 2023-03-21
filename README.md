# ejemplo-hibernate-search

Código de ejemplo de un post de mi blog.

https://www.israel-perales.com/hibernate-search-2/

## Prerrequisitos

* Java 17
* Docker
* IDE
* Git
* Maven

## ¿Cómo correr el proyecto?

```bash
docker run -p 5432:5432 -e POSTGRES_PASSWORD=sepomex -e POSTGRES_USER=sepomex -d jesusperales/sepomex-db-postgresql:latest
git clone
cd ejemplo-hibernate-search
mvn clean install
mvn spring-boot:run
```

