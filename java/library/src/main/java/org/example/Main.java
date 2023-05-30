package org.example;

public class Main {
    public static void main(String[] args) {
        int currentIndexOfBooks=0;
        Library l=new Library();
        Book b1=new Book();
        Book b2=new Book();
        Book b3=new Book();
        Book b4=new Book();
        l.books[currentIndexOfBooks]=b1;
        l.books[currentIndexOfBooks++]=b2;
        l.books[currentIndexOfBooks++]=b3;
        l.books[currentIndexOfBooks++]=b4;
        Member m1=new Member();
        Address ad=new Address();
        m1.openAccount(ad,1,"aswin",1);
        currentIndexOfBooks=m1.memberAccount.borrowBooks(l,1,currentIndexOfBooks++);

    }
}