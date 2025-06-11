# Java ToDo App

A simple Spring Boot-based ToDo List application.

## Features
- REST API to create, view, and delete todos
- Stores data using JPA and H2 (in-memory DB)
- Packaged with Docker
- Built with Maven
- Deployable on AWS EC2
- Artifacts and logs uploadable to S3

## Run Locally

```bash
mvn clean package
docker build -t todo-app .
docker run -p 8080:8080 todo-app
```

Visit: `http://localhost:8080/todos`
