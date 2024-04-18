CQRS, czyli Command Query Responsibility Segregation, to wzorzec architektoniczny, który sugeruje rozdzielenie modelu domenowego na dwie osobne części - jedną do obsługi operacji związanych z zapisem danych (komendy), a drugą do operacji odczytu danych (zapytania). Pozwala to na lepszą separację odpowiedzialności oraz optymalizację systemu pod kątem operacji zapisu i odczytu.

Oto główne założenia i cechy wzorca CQRS:

1. Rozdzielenie operacji zapisu i odczytu: Wzorzec sugeruje wykorzystanie oddzielnych modeli lub części systemu do obsługi operacji zapisu i odczytu. Komendy, które zmieniają stan aplikacji, są obsługiwane przez jednostki nazywane komendami, podczas gdy zapytania, które służą jedynie do odczytu danych, są obsługiwane przez jednostki nazywane zapytaniami.

2. Różne modele dla zapisu i odczytu: Model używany do obsługi operacji zapisu (komendy) może być inny niż model używany do operacji odczytu (zapytania). Często model do odczytu jest zoptymalizowany pod kątem wydajnego odczytu danych.

3. Możliwość optymalizacji: Dzięki rozdzieleniu operacji zapisu i odczytu, system może być optymalizowany pod kątem specyficznych potrzeb każdego rodzaju operacji. Na przykład, model do odczytu może zawierać prezentacje danych zoptymalizowane pod kątem UI, podczas gdy model do zapisu może być bardziej złożony, ale dostosowany do wymagań biznesowych.

4. Skalowalność: Dzięki temu, że operacje zapisu i odczytu są oddzielone, system może być łatwiej skalowany. Na przykład, możesz skalować model do odczytu niezależnie od modelu do zapisu, co pozwala na obsługę dużych obciążeń odczytu bez wpływu na operacje zapisu.

5. Ułatwienie testowania: Oddzielanie operacji zapisu i odczytu ułatwia testowanie systemu. Możesz testować komendy i zapytania osobno, co prowadzi do bardziej precyzyjnych testów.

W skrócie, wzorzec CQRS polega na rozdzieleniu operacji zapisu i odczytu, co prowadzi do lepszej separacji odpowiedzialności, optymalizacji wydajności systemu oraz ułatwienia zarządzania złożonymi modelami danych.