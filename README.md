# Hexagonal Architecture - Simple Java 8 Example
In the example is implemented an application that reads a collection of users from a repository and sends a greeting message to those who turn the years on the input date.

## Scheme of Primary Actor and Secondary Actors
![Scheme of HexArch](https://i1.wp.com/valerioemanuele.blog/wp-content/uploads/2019/04/Esempio-Esagono.png?ssl=1)

## Port and Adapter Scheme
![Scheme of HexArch Port and Adapter Scheme](https://i2.wp.com/valerioemanuele.blog/wp-content/uploads/2019/04/Esempio-Concreto-Esagono.png?ssl=1)

## Run the Hexagon

### Run with maven
The application can run by launching the command `mvn install` 

### Run with main()
As an alternative to maven, the application can be run as a standard Java application through the class `blog.valerioemanuele.main.Main`

## Requirements
- Eclipse version 2018-12 (4.10.0) or higher
- Java 8 or higher
- JUnit 5 or higher
