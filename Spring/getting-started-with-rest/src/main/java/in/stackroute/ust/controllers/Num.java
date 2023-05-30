package in.stackroute.ust.controllers;

public class Num {
    int num1,num2,result;
    public Num(){

    }

    public Num(int num1, int num2, int result, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Num{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", result=" + result +
                ", operation='" + operation + '\'' +
                '}';
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    String operation;
}
