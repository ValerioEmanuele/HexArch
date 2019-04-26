# Architettura Esagonale

Nell’esempio è implementata un’applicazione che legge da un repository una collezione di utenti ed invia un messaggio di auguri a quelli che compiono gli anni nella data passata in input.

## Schema Attore Primario e Attori Secondari
![Schema dell'architettura esagonale](https://i1.wp.com/valerioemanuele.blog/wp-content/uploads/2019/04/Esempio-Esagono.png?ssl=1)

## Schema Porte e Adapter
![Schema dell'architettura esagonale porte e adapter](https://i2.wp.com/valerioemanuele.blog/wp-content/uploads/2019/04/Esempio-Concreto-Esagono.png?ssl=1)

## Eseguire l'Esagono

### Eseguire con Junit
Il test può essere eseguito lanciando il comando `mvn install` oppure lanciando la classe `blog.valerioemanuele.adapter.driver.BirthdayServiceJunitAdapterTest` come unit test.

### Eseguire con il main()
Ho predisposto anche un metodo main nel quale viene impostato tutto l'esagono (porta driver + porte driven) ed eseguito.
Per eseguire l'esagono in tale modalità lanciare come applicazione Java la classe `blog.valerioemanuele.main.Main`

## Requirements
L'applicativo è stato realizzato con:
- Eclipse versione 2018-12 (4.10.0)
- Java 8