package com.stackroute.exception;

public class Account {
    public int balance;
    public Account(){
        this.balance=0;
    }
    public Account(int balance){
        this.balance=balance;
    }
    public double getAccountBalance(){
        return balance;
    }
    public double withdraw(int w) throws InsufficientFundException, NegativeIntegerException{

        if(balance<w){
            throw new InsufficientFundException("Account balance is less than entered amount");
        } else if (w<0) {
            throw new NegativeIntegerException("Entered value is not valid");
        }
        else{
            balance=balance-w;
            return balance;
        }
    }

}
