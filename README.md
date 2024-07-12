# ntt-test-task

This is the REST API application for get information about organization.

Information is stored in PostgreSQL database.
Test data is added on first run by liquibase migrations.

Specify parameters for connecting to the database in the configuration file application-dev.yml
or use your own file for overwrite the current settings.

API documentation available on http://localhost:8080/swagger-ui/index.html

If you have no db, you can create it in docker container by docker-compose.yml
```
version: '3'

services:
  
  db:
    container_name: postgresql
    image: postgres:16.2-bookworm
    shm_size: 128mb
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: testpass
      PGDATA: /var/lib/postgresql/data/pgdata
      POSTGRES_DB: ntt
    volumes:
      - ./data/postgresql:/var/lib/postgresql/data
    ports:
      - "5432:5432"
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U postgres"]
      interval: 10s
      timeout: 5s
      retries: 5

```