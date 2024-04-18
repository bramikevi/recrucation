
W Javie kontrakt między metodami hashCode() i equals() dotyczy tego, jak te dwie metody powinny działać 
w związku z identyfikacją i porównywaniem obiektów.

hashCode(): Metoda hashCode() zwraca wartość liczbową (hash code), która jest używana przez różne
struktury danych w Javie, takie jak HashMap, HashSet itp., aby szybko zidentyfikować obiekt wewnętrznie.
Wartość zwracana przez hashCode() jest wykorzystywana jako klucz do indeksowania obiektu. Zgodnie z kontraktem:

Gdy dwie klasy są równe według metody equals(), to ich hashe zwracane przez hashCode() muszą być jednakowe.
Jeśli dwie klasy nie są równe według equals(), to ich hasze mogą być jednakowe, ale nie jest to wymagane. Jednakże, dla optymalnej wydajności, unikatowe obiekty powinny zwracać unikatowe hashe, aby minimalizować kolizje.
equals(): Metoda equals() służy do porównywania dwóch obiektów pod kątem logicznej równości. Zgodnie z kontraktem:

Implementacja metody equals() powinna być spójna z implementacją metody hashCode(). Oznacza to, że dwa obiekty, które są równe według equals(), powinny również mieć takie same hashe zwracane przez hashCode().
Relacja równości musi być symetryczna, czyli jeśli a.equals(b) zwraca true, to b.equals(a) też musi zwracać true.
Relacja równości musi być przechodnia, czyli jeśli a.equals(b) i b.equals(c) oba zwracają true, to również a.equals(c) musi zwracać true.
Żaden obiekt nie może być równy null. Innymi słowy, wywołanie a.equals(null) zawsze powinno zwracać false.
W przypadku niezachowania tego kontraktu, struktury danych, takie jak HashMap, mogą działać niepoprawnie, prowadząc do błędów w aplikacji lub niespodziewanego zachowania się programu. Dlatego bardzo ważne jest, aby zawsze przestrzegać kontraktu między hashCode() a equals() podczas implementowania tych metod w swoich klasach w Javie.