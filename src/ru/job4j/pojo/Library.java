package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Father & children", 300);
        Book book1 = new Book("Fairy tales", 250);
        Book book2 = new Book("Bible", 400);
        Book book3 = new Book("Clean code", 350);

        Book[] books = new Book[5];

        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (int i = 0; i < books.length; i++) {
            Book vivod = books[i];
            System.out.println(vivod.getName() + " - " + vivod.getPage());
        }

        books[4] = books[0];
        books[0] = books[2];
        books[2] = books[4];
        books[4] = null;

        for (int i = 0; i < books.length; i++) {
            Book vivod = books[i];
            System.out.println(vivod.getName() + " - " + vivod.getPage());
        }

        for (int i = 0; i < books.length; i++) {
            Book vivod = books[i];
            if (vivod.getName().equals("Clean code")) {
                System.out.println(vivod.getName() + " - " + vivod.getPage());
            }
        }
    }
}
