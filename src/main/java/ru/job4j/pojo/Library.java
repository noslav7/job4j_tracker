package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book clean = new Book("Clean Code", 600);
        Book head = new Book("Head First", 750);
        Book reference = new Book("Complete Reference", 1100);
        Book thinking = new Book("Thinking in Java", 900);
        Book[] bookArray = new Book[4];
        bookArray[0] = clean;
        bookArray[1] = head;
        bookArray[2] = reference;
        bookArray[3] = thinking;
        for (Book book : bookArray) {
            System.out.println(book.getTitle() + " " + book.getPages());
        }
        Book temp = bookArray[0];
        bookArray[0] = bookArray[3];
        bookArray[3] = temp;
        for (Book book : bookArray) {
            System.out.println(book.getTitle() + " " + book.getPages());
        }
        for (Book book : bookArray) {
            if ("Clean Code".equals(book.getTitle())) {
                System.out.println(book.getTitle() + " " + book.getPages());
            }
        }
    }
}
