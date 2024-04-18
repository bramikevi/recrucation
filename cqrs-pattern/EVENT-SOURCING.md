Event sourcing (źródło zdarzeń) to wzorzec projektowy, który polega na przechowywaniu zmian stanu aplikacji jako sekwencji zdarzeń biznesowych. Zamiast bezpośrednio aktualizować stan aplikacji w bazie danych, zachowuje się historię wszystkich operacji, które zmieniają stan systemu.

Oto podstawowe założenia i cechy event sourcingu:

1. Zapisywanie zdarzeń: Wzorzec event sourcingu polega na zapisywaniu zdarzeń biznesowych, które opisują zmiany stanu aplikacji. Zamiast bezpośrednio aktualizować stan w bazie danych, aplikacja rejestruje zdarzenia, takie jak "Utworzono post", "Zaktualizowano post", "Usunięto post" itp.

2. Historia zdarzeń: Zamiast przechowywać tylko bieżący stan aplikacji, event sourcing przechowuje pełną historię wszystkich zdarzeń, które spowodowały zmiany stanu aplikacji. Dzięki temu można odtworzyć stan aplikacji w dowolnym momencie, analizować historię zmian i odzyskiwać poprzednie stany aplikacji.

3. Niemożność modyfikacji zdarzeń: Zdarzenia, które zostały już zarejestrowane, są niezmienne i nie można ich edytować ani usuwać. Każde zdarzenie jest trwałe i reprezentuje fakt, który wystąpił w przeszłości.

4. Replikacja zdarzeń: Zdarzenia mogą być replikowane między różnymi częściami systemu, co umożliwia synchronizację stanu aplikacji w rozproszonym środowisku.

5. Przechowywanie zdarzeń w zdarzeniowym magazynie danych: Zdarzenia biznesowe są zazwyczaj przechowywane w specjalnym magazynie danych zwanych zdarzeniowym magazynem danych (event store). Jest to zazwyczaj baza danych, która umożliwia efektywne przechowywanie i odczytywanie zdarzeń.

6. Materializacja widoków: Aby odczytywać dane w sposób efektywny, można użyć materializacji widoków, gdzie dane są przetwarzane i zapisywane w prezentacjach danych, które są zoptymalizowane pod kątem konkretnych zapytań odczytu.

Event sourcing jest często stosowany w połączeniu z wzorcem CQRS (Command Query Responsibility Segregation), który rozdziela operacje zapisu i odczytu, co pozwala na jeszcze większą elastyczność i wydajność w zarządzaniu stanem aplikacji.





