# Spring Boot WebFlux Mongo DB

## Table of Contents

* [The Project All About](#the-project-all-about)
  * [Built With](#built-with)
* [How do we Get Started](#how-do-we-get-started)
  * [Setup](#setup)

## The Project All About

This sample project consist of spring boot java with reactive apis integrated with Mongo Db instance

#Built with
Below are the frameworks used to build this project
* Java
* Maven
* Spring Boot 2.2 and higher
* Mongo DB

## How do we Get Started

# setup

1. Update the application.properties with mongo db instance

``` sh
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<host>:<port>/<dbname>
spring.data.mongodb.database=college
```

2. Clone the repo

``` sh
git clone https://github.com/blackcatsdev/Spring-Boot-Webflux-Mongo-Db.git
```

3. Build the Project

```sh
mvn clean package
```

4. Execute the application

```sh
mvn spring-boot:run
```