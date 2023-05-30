package in.stackroute.ust;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("File Manager");
        System.out.println();
        FileManager fileManager = new FileManager("Data.txt");
//        fileManager.writeToFile("Hello" + "\r\n");
//        fileManager.writeToFile("Welcome to Java IO"+ "\r\n");
//        fileManager.writeToFile("This is written using a Charecter stream."+ "\r\n");
        fileManager.printFromFile();
    }
}