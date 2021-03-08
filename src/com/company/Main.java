package com.company;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Как я выживал 10 лет в ашане", "Циолковский", 333, 170);
        Book book1 = new Book("Конкурсы на гендерные праздники в колонии строгого режима", "Сартр", 222);
        Book book2 = new Book("50 лучших тостов на поминках", "Ницше");
        Book book3 = new Book("Гарри Поттер и восточный фронт");
        Book book4 = new Book(null);

        Book[] arrBook = {book, book1, book2, book3, book4};

        Reader reader = new Reader();
        Book thisBook = reader.choiceBook(arrBook);

        reader.readBook(thisBook);

        reader.estimate(thisBook);
    }
}
