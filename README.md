# API REST para Gestionar Clientes

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5-green)
![H2](https://img.shields.io/badge/Database-H2%20%2F%20PostgreSQL-blue)

API REST completa para la gestión de clientes, desarrollada con Spring Boot y arquitectura en capas (Controller → Service → Repository).

## Stack Tecnológico

- **Java 17**
- **Spring Boot 3.5**
- **Spring Data JPA**
- **H2** (in-memory, para desarrollo)
- **PostgreSQL** (para producción)
- **Maven**

## Endpoints

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/api/clientes` | Obtener todos los clientes |
| GET | `/api/clientes/{id}` | Obtener cliente por ID |
| POST | `/api/clientes` | Crear nuevo cliente |
| PUT | `/api/clientes/{id}` | Actualizar cliente existente |
| DELETE | `/api/clientes/{id}` | Eliminar cliente |

## Ejecutar el proyecto

```bash
cd clientes-api
./mvnw spring-boot:run
```

La API estará disponible en `http://localhost:8080`

La consola H2 estará en `http://localhost:8080/h2-console`

## Ejemplos de uso

**Crear cliente:**
```bash
curl -X POST http://localhost:8080/api/clientes \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Juan García","email":"juan@email.com","telefono":"600123456","direccion":"Calle Mayor 1, Madrid"}'
```

**Listar todos:**
```bash
curl http://localhost:8080/api/clientes
```

**Actualizar:**
```bash
curl -X PUT http://localhost:8080/api/clientes/1 \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Juan García","email":"juan.nuevo@email.com","telefono":"600123456","direccion":"Calle Mayor 1, Madrid"}'
```

**Eliminar:**
```bash
curl -X DELETE http://localhost:8080/api/clientes/1
```

## Estructura del proyecto

```
clientes-api/
└── src/main/java/com/example/clientes/
    ├── ClientesApiApplication.java   # Clase principal
    ├── controller/
    │   └── ClienteController.java    # Endpoints REST
    ├── service/
    │   └── ClienteService.java       # Lógica de negocio
    ├── repository/
    │   └── ClienteRepository.java    # Acceso a datos (JPA)
    └── model/
        └── Cliente.java              # Entidad JPA
```

## Autor

**Alex Pérez Rubio** — [github.com/alex5perez](https://github.com/alex5perez)
