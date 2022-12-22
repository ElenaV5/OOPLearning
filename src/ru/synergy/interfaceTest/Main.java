package ru.synergy.interfaceTest;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Danwich horror", "Lovecraft");
        book.print(); //Danwich horror (Lovecraft)

        Journal journal = new Journal("Cosmo");
        journal.getName();
        journal.print(); //Cosmo

        Printable printableJournal = journal;
        printableJournal.print(); //Cosmo

        //Printable.read(); //Read printable
        book.read("This is run upon the book");


    }
}
class Book implements Printable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable{
    private String name;

    public String getName() {
        return name;
    }

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}

