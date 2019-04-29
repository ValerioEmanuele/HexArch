# Architettura Esagonale

Nell’esempio è implementata un’applicazione che legge da un repository una collezione di utenti ed invia un messaggio di auguri a quelli che compiono gli anni nella data passata in input.

## Schema Attore Primario e Attori Secondari
![Schema dell'architettura esagonale](https://i1.wp.com/valerioemanuele.blog/wp-content/uploads/2019/04/Esempio-Esagono.png?ssl=1)

## Schema Porte e Adapter
![Schema dell'architettura esagonale porte e adapter](https://i2.wp.com/valerioemanuele.blog/wp-content/uploads/2019/04/Esempio-Concreto-Esagono.png?ssl=1)

## Eseguire l'Esagono

### Eseguire con maven
L'applicazione può eseguita lanciando il comando `mvn install` 

### Eseguire con il main()
In altearnativa a maven, l'applicazione può essere eseguita come applicazione Java standard tramite la classe `blog.valerioemanuele.main.Main`

## Requirements
L'applicativo è stato realizzato con:
- Eclipse versione 2018-12 (4.10.0)
- Java 8