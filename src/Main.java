import java.util.*;

import models.*;

public class Main {

    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();

        boolean exit = false;
        int option = 0;
        while (true){
            List<Books> books = biblioteka.selectBooks();
            List<Categories> categories = biblioteka.selectCategories();
            List<Users> users = biblioteka.selectUsers();
            List<Loans> loans = biblioteka.selectLoans();
            System.out.println("1. Dodaj ksiazke");
            System.out.println("2. Dodaj kategorie");
            System.out.println("3. Dodaj uzytkownika");
            System.out.println("4. Dodaj wypozyczenie");
            System.out.println("5. Wyswietl ksiazki");
            System.out.println("6. Wyswietl kategorie");
            System.out.println("7. Wyswietl uzytkownikow");
            System.out.println("8. Wyswietl wypozyczenia");
            System.out.println("9. Wyjscie");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Podaj tytul ksiazki");
                    String title = scanner.next();
                    System.out.println("Podaj autora ksiazki");
                    String author = scanner.next();
                    System.out.println("Podaj rok wydania ksiazki");
                    int year = scanner.nextInt();
                    biblioteka.insertBook(title, author, year);
                    break;
                case 2:
                    System.out.println("Podaj nazwe kategorii");
                    String name = scanner.next();
                    biblioteka.insertCategory(name);
                    break;
                case 3:
                    System.out.println("Podaj imie uzytkownika");
                    String FirstName = scanner.next();
                    System.out.println("Podaj nazwisko uzytkownika");
                    String LastName = scanner.next();
                    biblioteka.insertUser(FirstName, LastName);
                    break;
                case 4:

                    for (Books book : books){
                        System.out.println(book.getId()+" - "+book.getTitle());
                    }
                    System.out.println("Podaj id ksiazki");
                    int id_book = scanner.nextInt();
                    for(Users user : users){
                        System.out.println(user.getId()+" - "+user.getFirstName()+" "+user.getLastName());
                    }
                    System.out.println("Podaj id uzytkownika");
                    int id_user = scanner.nextInt();
                    System.out.println("Podaj date od");
                    String date_from = scanner.next();
                    System.out.println("Podaj date do");
                    String date_to = scanner.next();
                    biblioteka.insertLoan(id_book, id_user, date_from, date_to);
                    break;
                case 5:
                    for (Books book : books){
                        System.out.println(book);
                    }
                    break;
                case 6:
                    System.out.println("Kategorie:");
                    for (Categories category : categories){
                        System.out.println(category);
                    }
                    break;
                case 7:
                    System.out.println("Uzytkownicy:");
                    for (Users user : users){
                        System.out.println(user);

                    }
                    break;
                case 8:
                    System.out.println("Wypozyczenia:");
                    for (Loans loan : loans){
                        System.out.println(loan);
                    }
                    break;
                case 9:
                    exit = true;
                    break;
            }
        }
    }
}