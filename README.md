# Banking API

Backend Java Spring RESTful API providing core banking functionalities such as user management, account details, card information, features, and news.

## Main Technologies
- **Java 17**: Utilizing the latest LTS version of Java to leverage the newest innovations this robust and widely-used language offers.
- **Spring Boot 3**: Working with the newest version of Spring Boot, which maximizes developer productivity through its powerful auto-configuration premise.
- **Spring Data JPA**: Exploring how this tool can simplify our data access layer, facilitating integration with SQL databases.
- **OpenAPI (Swagger)**: Creating effective and easy-to-understand API documentation using OpenAPI (Swagger), perfectly aligned with the high productivity that Spring Boot offers.
- **Railway**: Facilitates the deployment and monitoring of our solutions in the cloud, in addition to offering various databases as a service and CI/CD pipelines.

## [Figma Link](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

Figma was used for the domain abstraction of this API, being useful in the analysis and design of the solution.

## Class Diagram (API Domain)
```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

## API Documentation (Swagger)
...