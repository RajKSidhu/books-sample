## Library project
 Project name : library

Java application illustrating the CRUD operations for the Books for a Library.

## Requirements
Used Dependencies for Spring Web, Spring Data JPA and H2 Database. 

The requirement of this application is Maven. All other dependencies can be installed by building the maven package.

mvn package

## Development

* Clone the Git Repository using the command.

  $ git clone https://github.com/RajKSidhu/books-sample.git

* Import project into IDE: Intellij/Eclipse/STS, etc. 

  Java 8 is used as SDK.
Check Module Settings for the Java SDK. 
* In application.properties spring data source needs to be updated for local file store.
 spring.datasource.url=jdbc:h2:mem:testdb
 is updated as
 spring.datasource.url=jdbc:h2:file:C:/Users/Rajdeep/test

* Build project using the command

   mvn clean package

* Start server and open the H2 console.  Check the Table created. 

* Execute the below Endpoints in Postman and check records in H2 Database. 
 
## Endpoints
**Context path:** The value of the context-path is mentioned. 

*path : [/library](/library)*

HTTP Methods | Endpoint name 
---|---|
**POST** | /book
**PUT** | /book/{id}
**GET** | /books
**GET** | /book/{id}
**DELETE** | /book/{id}
