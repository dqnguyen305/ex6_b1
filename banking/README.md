# Banking Spring Boot service

Run the application and PostgreSQL database from this directory:

```powershell
docker compose up -d --build
docker compose logs -f banking-app
```

The application connects to `banking_db` through the `core-db` Compose service.
PostgreSQL is also available on port `5432`, and the Spring Boot service listens
on port `8080`. The credentials in `docker-compose.yml` are for local exercise
use only; replace them before using this setup outside a local environment.

If host port `5432` is already in use, set `POSTGRES_HOST_PORT` to another
available port before starting Compose. The application still connects to
PostgreSQL internally on port `5432`.

Stop the containers with `docker compose down`. Add `-v` to also remove the
local PostgreSQL data volume.
