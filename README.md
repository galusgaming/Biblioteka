Zadanie: Projektowanie Diagramu Klas UML dla Systemu Bibliotecznego
Opis:
W małej bibliotece chcemy zaprojektować system zarządzania książkami i użytkownikami. Oto podstawowe wymagania i informacje dotyczące systemu:
Książki:
Każda książka ma tytuł, autora i rok wydania.
Każda książka może być przypisana do jednej lub wielu kategorii (np. literatura, nauka, fantastyka).
Książki mogą być wypożyczane przez użytkowników.
Kategorie:
Kategoria ma nazwę.
Każda kategoria może zawierać wiele książek.
Użytkownicy:
Użytkownik ma imię, nazwisko i numer identyfikacyjny.
Użytkownik może wypożyczać książki.
Wypożyczenia mają datę wypożyczenia i datę zwrotu.
Wypożyczenia:
Wypożyczenie odnosi się do jednej książki i jednego użytkownika.
Wypożyczenie zawiera datę wypożyczenia i datę zwrotu.
Relacje:
Każda książka może być wypożyczona przez wielu użytkowników, ale w danym czasie może być wypożyczona tylko przez jednego użytkownika.
Każdy użytkownik może wypożyczać wiele książek, ale jedno wypożyczenie dotyczy tylko jednej książki.
Zadanie: Na podstawie powyższego opisu stwórz diagram klas UML, który odzwierciedli strukturę i relacje pomiędzy klasami w systemie bibliotecznym. Diagram powinien zawierać:
Klasy: Książka, Kategoria, Użytkownik, Wypożyczenie
Atrybuty każdej klasy
Relacje między klasami (np. asocjacje, kardynalności)
