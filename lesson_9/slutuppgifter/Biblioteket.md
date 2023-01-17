# Uppgift bibliotek

Uppgiften är att simulera att bibliotek för en kombination av verk exempelvis böcker, spel, filmer etc.

## Krav för Godkänt

- Det finns minst 3 typer av verk (ex bok, cd-skiva, film, spel) som kan sparas i biblioteket, och de har vissa gemensamma attribut (ex id, titel, inköpspris) och vissa olika attribut (ex sidantal, speltid).
- Man kan registrera nya verk som läggs in i bibliotekets katalog. Den frågar efter olika attribut beroende på vilken typ av verk.
- Man kan lista alla verk som finns i katalogen för varje verk visas summerad information om det
- Man kan spara ner och ladda in bibliotekets katalog från en fil eller databas
- Koden är objektorienterad

## Utökade krav (minst 2 för VG)

- Man kan söka på fritext i katalogen och sortera katalogen på olika vis
- Man kan beräkna ett värde på hela samlingen baserat på att varje verk har en metod som anger dess värde. Metoden att räkna ut värdet kan du bestämma själv men den behöver vara olika för varje typ av verk.
- Man kan ha flera exemplar av ett verk. Exemplaren har det mesta gemensamt (ex sidantal) men har något attribut som kan skilja dem åt (ex ett exemplar kan vara i skadat skick, ett annat i nyskick)
- Man kan låna ett exemplar av ett verk i biblioteket från och till ett datum och det går inte att låna ett verk som redan är utlånat under den valda perioden.
- Man kan skicka påminnelser till de som inte lämnat tillbaka sina verk efter sista datum (använd en riktig metod som ex. email eller en simulerad metod)