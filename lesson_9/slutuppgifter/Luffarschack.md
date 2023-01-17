# Uppgift Luffarschack 

Du ska skapa ett luffarschack-spel. I luffarschack turas spelarna om att sätta markörer (vanligen X och O) i ett rutnät. Den som först får en linje av ett förutbestämt antal markörer vinner.  

![](Luffarschack.png)

Bilden ovan visar luffarschack med fem-i-rad som vinstvillkor. 

## Krav för Godkänt

- Spelet visualiseras som ett rutnät med minst 5x5 rutor
- Man kan turas om att sätta X och 0 på lediga platser i rutnätet
- Om man får minst 4 rutor i rad (horisontellt, vertikalt eller diagonalt) deklareras den spelaren som vinnare
- Om det är slut på tomma rutor avslutas spelet
- Appen för statistik över färdiga spel, som antal vinster, förluster, antalet drag
- Koden är objektorienterad

## Utökade krav (minst 2 för VG)

- Spelet stödjer ett obegränsat rutnät, dvs det går att fortsätta åt alla håll så länge man vill (användargränssnittet kanske behöver ett sätt att kunna visa olika delar av rutnätet åt gången)
- Man kan spela mot datorn som använder någon strategi för att vinna samt stoppa spelaren om den håller på att vinna
- Användarvänlig visualisering och val av ruta, exempelvis kan man flytta runt en markör och trycka enter på sin ruta, använda sig av färger eller liknande
- Man kan spara och ladda spel från fil eller databas
- Kan spela upp en repris av ett spel där varje drag visas i tur och ordning
