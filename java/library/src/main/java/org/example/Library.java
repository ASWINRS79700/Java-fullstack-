package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    String libraryName;
    Address address;
    String registerNumber;
    Book[] books;


    public int lendBooks(int bookIsbnNo,int currentIndexOfBooks){
        Book res=new Book();
        for (Book book:books) {
            if(book.bookIsbnNo==bookIsbnNo){
            List<Book> bb= Arrays.stream(books).filter(b->b.bookIsbnNo!=bookIsbnNo).toList();
            books=bb.toArray(new Book[0]);
                currentIndexOfBooks--;
            }

        }
        return currentIndexOfBooks;
    }
    public int collectDue(String id){

    }

}
