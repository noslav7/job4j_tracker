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
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i]);
        }
        Book temp = bookArray[0];
        bookArray[0] = bookArray[3];
        bookArray[3] = temp;
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(bookArray[i]);
        }
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].equals(clean)) {
                System.out.println(bookArray[i]);
            }
        }
    }
}
