# Hotellbokning

I denna uppgift ska du skriva ett program för att hantera bokningar av hotellrum. Användaren av programmet antas vara en receptionist, som kan föra in och hantera rumsbokningar.

## Krav för Godkänt

- Du kan lista / visa alla rum med status BOKAD / LEDIG för en given dag. Du kan (men måste inte) använda Javas `LocalDate`.
- Du kan boka rum. Bokningen innehåller en tidsperiod (från datum, till datum), rumsnummer och namn. Rummet måste vara ledigt hela den perioden för att bokningen ska accepteras.
- Du kan spara ner bokningar till en fil eller databas
- Du kan ladda in bokningar från en fil eller databas
- Koden är objektorienterad

## Utökade krav (minst 2 för VG)

- Rum kan ha olika egenskaper, som rökning/ej rökning, enkel/dubbel, standard/deluxe/svit.
- Bokningsinterfacet visar en lista på rum man kan boka för ett datum, om man anger preferens av rumsegenskaper begränsas listan efter det
- Din lösning visar även priset för rummets bokning, som varierar slumpmässigt eller med rummets egenskaper, etc
- Rum kan vara städade eller ostädade och användaren kan skicka ut uppdrag till housekeeping städa ett rum.
- Din lösning har ett interface för att checka in (gästen har anlänt till sin bokning) och checka ut (rummet ska markeras för städning eller liknande)
- Du kan gå in i ett simuleringsläge där man kan observera hotellet medan bokningar slumpmässigt genereras och kanske att gäster checkar in och ut. 
