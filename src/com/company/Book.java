package com.company;

public class Book {
    String name;
    String author;
    int serialNum;
    int pages;

    Book(String name) {
        this.name = name;
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    Book(String name, String author, int serialNum) {
        this.name = name;
        this.author = author;
        this.serialNum = serialNum;
    }

    Book(String name, String author, int serialNum, int pages) {
        this.name = name;
        this.author = author;
        this.serialNum = serialNum;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", serialNum=" + serialNum +
                ", pages=" + pages +
                '}';
    }

}
