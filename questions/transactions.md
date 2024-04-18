
W Spring Boot transakcyjność jest obsługiwana za pomocą mechanizmu transakcji zarządzanych przez Spring Framework, zwłaszcza moduł Spring Data JPA lub Spring JDBC. Mechanizm ten zapewnia deklaratywną obsługę transakcji, co oznacza, że możesz definiować transakcje bezpośrednio w kodzie za pomocą adnotacji.

Oto podstawowe informacje na temat działania transakcji w Spring Boot:

1. Adnotacje transakcyjne: Spring Boot umożliwia korzystanie z adnotacji transakcyjnych, takich jak @Transactional. Ta adnotacja może być stosowana do metod serwisów lub repozytoriów w celu oznaczenia, że ​​dane metody powinny być wykonywane w obrębie transakcji.

2. Zasięg transakcji: Transakcje w Spring Boot mogą obejmować pojedynczą metodę lub wiele metod. Można kontrolować zasięg transakcji, aby obejmował pojedynczą metodę lub obejmował całą ścieżkę wykonania metody włączając w to wywołania metod z poziomu innych klas.

3. Transakcje propagacji: Spring Boot pozwala na kontrolę propagacji transakcji, czyli sposób, w jaki istniejąca transakcja jest propagowana przez metody, które są wywoływane w obrębie innej transakcji. Możliwe wartości propagacji to np. REQUIRED, REQUIRES_NEW, NESTED, itp.

4. Zarządzanie transakcjami przez Spring Data JPA: Spring Boot współpracuje z Spring Data JPA, co umożliwia prostą obsługę transakcji w przypadku korzystania z JPA. Spring Boot automatycznie tworzy ziarno proxy dla repozytoriów JPA, które obsługuje zarządzanie transakcjami.

5. Obsługa wyjątków transakcyjnych: W przypadku, gdy wystąpi błąd podczas wykonywania operacji w obrębie transakcji, Spring Boot automatycznie anuluje transakcję (rollback) w celu zachowania spójności danych.

6. Konfiguracja transakcji: Spring Boot umożliwia konfigurację transakcji zarówno za pomocą adnotacji, jak i plików konfiguracyjnych. Można dostosować parametry transakcji, takie jak izolacja transakcji, timeout, czy obsługa wyjątków.

Dzięki wbudowanemu mechanizmowi transakcyjnemu w Spring Boot, programiści mogą łatwo zarządzać transakcjami w aplikacjach bez konieczności ręcznego zarządzania połączeniami i transakcjami JDBC. Jest to jedna z wielu zalet korzystania z Spring Boot w aplikacjach opartych na Javie.

---
W Spring Boot transakcyjność jest obsługiwana przez Spring Framework, który oferuje mechanizm zarządzania transakcjami. 
Transakcyjność w Spring Boot jest związana z aspektami (ang. aspects) w Spring AOP (Aspect-Oriented Programming), które są wykorzystywane
do deklaratywnej obsługi transakcji.

Oto jak działa transakcyjność w Spring Boot i jak jest związana z aspektami:

1. Adnotacje transakcyjne: Spring Boot umożliwia stosowanie adnotacji transakcyjnych, takich jak @Transactional, 
do metod serwisów lub repozytoriów w celu oznaczenia, że ​​dane metody powinny być wykonywane w obrębie transakcji.

2. Proxy transakcyjne: Spring Boot wykorzystuje aspekty do generowania proxy transakcyjnych wokół metod oznaczonych adnotacją @Transactional. 
Podczas wywoływania takiej metody, Spring automatycznie otwiera transakcję, wykonuje metodę, a następnie zatwierdza transakcję (commit) lub ją anuluje (rollback) w zależności od wyniku metody.

3. Zarządzanie granicami transakcji: Aspekty w Spring Boot umożliwiają zarządzanie granicami transakcji, czyli definiowanie, 
gdzie transakcja powinna być rozpoczęta i zakończona. Można kontrolować to, czy transakcja powinna obejmować jedną metodę, kilka metod, 
czy cały cykl życia żądania HTTP.

4. Konfiguracja transakcji: Spring Boot umożliwia konfigurację różnych parametrów transakcji, takich jak izolacja, timeout, czy obsługa wyjątków. 
Te ustawienia można dostosować za pomocą adnotacji @Transactional lub konfiguracji XML.

5. Obsługa wyjątków transakcyjnych: Spring Boot obsługuje wyjątki transakcyjne, które mogą wystąpić podczas przetwarzania operacji w obrębie transakcji. 
Można skonfigurować, jak Spring ma reagować na różne typy wyjątków, na przykład czy powinien zatwierdzić transakcję lub anulować ją.

W ten sposób, aspekty w Spring Boot są kluczowe dla deklaratywnej obsługi transakcji. Adnotacje transakcyjne są wykorzystywane do oznaczania metod, 
które powinny być wykonywane w obrębie transakcji, a aspekty są odpowiedzialne za implementację logiki zarządzania transakcjami, 
takiej jak rozpoczęcie, zakończenie, zatwierdzenie lub anulowanie transakcji. Dzięki temu mechanizmowi programiści mogą skupić się na implementacji 
logiki biznesowej, a nie na zarządzaniu transakcjami.

propagacja transkakcji = sposob zarzadzania transakcjami - tworzenie nowej lub nie, wlaczenie sie w istniejaca transkacje itp
izolacja = integralnosc danych - ustawianie blokad