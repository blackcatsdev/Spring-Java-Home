# spring-cloud-config-server-oracle-db
This project has implementation of Spring cloud config server with oracle database

## Table of Contents

* [The Project All About](#the-project-all-about)
  * [Built With](#built-with)
* [How do we Get Started](#how-do-we-get-started)
  * [Setup](#setup)

## The Project All About

This project consist of spring boot config server using oracle db 

#Built with
Below are the dependencies used to build this project
* spring cloud config server
* spring data jpa
* Spring Boot
* oracle 

## How do we Get Started

# setup

1. Update the application.properties with oracle db instance

``` sh
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/test
spring.datasource.username=test
spring.datasource.password=test
```

2. Clone the repo

``` sh
git clone https://github.com/blackcatsdev/spring-cloud-config-server-oracle-db.git
```

3. Build the Project

```sh
mvn clean package
```

4. Execute the application

```sh
mvn spring-boot:run
```
# output

Below are endpoints exposed as similar as any config server

```
http://localhost:8080/applicationname/enviroment/properties
```
