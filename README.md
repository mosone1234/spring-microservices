# spring-microservices

## Run Service-Registry, eureka server.

cd ~/Documents/spring-microservices/service-registry

mvn spring-boot:run

port: 8761

## Run Store-Service, Service.

cd ~/Documents/spring-microservices/store-service

mvn spring-boot:run

port: 8072

## Run User-Service, Service.

cd ~/Documents/spring-microservices/user-service

port: 8073

mvn spring-boot:run

## Run APi-GATEWAY Service. eureka client

cd ~/Documents/spring-microservices/api-gateway

mvn spring-boot:run

port: 9191

```
a service registry (Eureka Server)
a REST service, which registers itself at the registry (Eureka Client)
a web application, which is consuming the REST service as a registry-aware client (Spring Cloud Netflix Feign Client)``

## License
[Spring cloud netflix eureka](https://www.baeldung.com/spring-cloud-netflix-eureka)

```
