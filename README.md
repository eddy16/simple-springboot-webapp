# Simple Web Application With Spring Boot Configuration

A simple web app shows the default configuration for Spring MVC with Thymeleaf with Spring Boot, and a little rest endpoint with Spring Rest Controller

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You must have installed on your machine

- JDK 1.8 or later
- Maven 3 or later
- Git 2 or later

### Clone and Install

```
git clone https://github.com/eddy16/simple-springboot-webapp.git

cd simple-springboot-webapp

mvn clean install
```

### Run

```
mvn spring-boot:run
```

### Test
There are two URL mapped, the first one is a simple rest endpoint and you can get with:
```
curl localhost:8080/hello/yourname
```
Or simply put it in the browser.

The another one is a simple hello world page built with Thymeleaf, just put the url in the browser:
```
localhost:8080
```



## References

* [Spring Boot](http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/) - The official Spring Boot Documentation
* [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/) - A official example 
