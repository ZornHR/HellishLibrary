package com.company;

import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] arrBook) {
        Random random = new Random();
        int myBook = random.nextInt(arrBook.length);
        return arrBook[myBook];
    }

    public void readBook(Book bookToRead) {
        System.out.println(bookToRead);
    }

    public void estimate(Book bookEstimate) {
        Random random = new Random();
        int nameBal;
        if (bookEstimate.name == null) { //проверяем на заполненность поле. Там где инт - проверяем на ==0
            nameBal = - random.nextInt(10); //ограничиваем рандомное число
        } else {
            nameBal = bookEstimate.name.length();
        }

        int authorBal;
        if (bookEstimate.author == null) {
            authorBal = - random.nextInt(10);
        } else {
            authorBal = bookEstimate.author.length();
        }

        int serialNumBal;
        if (bookEstimate.serialNum == 0) {
            serialNumBal = random.nextInt(10);
        } else {
            serialNumBal = bookEstimate.serialNum;
        }

        int pagesBal;
        if (bookEstimate.pages == 0) {
            pagesBal = - random.nextInt(10);
        } else {
            pagesBal = bookEstimate.pages;
        }

        System.out.println(nameBal + authorBal - serialNumBal + pagesBal);
    }

}

