package org.example;

public class MemberAccount {
    public int  accountNo;
public int borrowBooks(Library l,int isbn,int currentIndexOfBooks){
return l.lendBooks(isbn,currentIndexOfBooks);

}
public void returnBooks(Library l,Book b,int currentIndexOfBooks){

l.books[currentIndexOfBooks+1]=b;
}
public void payDues(){

}
}
