package in.stackroute.ust;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("File Manager");
        System.out.println();
        FileManager fileManager = new FileManager("Data.txt");
        fileManager.writeToFile("Campus Training Guildelines" + "\r\n");
        fileManager.writeToFile("1.Be punctual nad prepared for class everyday"+ "\r\n");
        fileManager.writeToFile("2.Adhere to training session and break timings"+ "\r\n");
        fileManager.writeToFile("3.Dress appropriately and adhere to UST dress code policy"+ "\r\n");
        fileManager.writeToFile("4.Ask questions and seek clarifications"+ "\r\n");
        fileManager.writeToFile("5.Show courtesy to the speaker and wait your turn"+ "\r\n");
        fileManager.writeToFile("6.Training premises should be maintained neat and tidy"+ "\r\n");
        fileManager.writeToFile("7.Be mindful of UST property. Vandalism will lead to disciplinary action"+ "\r\n");
        fileManager.writeToFile("8.No food or beverages allowed outside of the designated areas"+ "\r\n");
        fileManager.writeToFile("9.Strictly no casual leaves allowed while training"+ "\r\n");
        fileManager.writeToFile("10.Access to mobile phones are strictly prohibited in the training room"+ "\r\n");
        fileManager.writeToFile("11.be respectful of your own personal space and of those around you"+ "\r\n");
        fileManager.writeToFile("12.Uphold ust values"+ "\r\n");



        fileManager.printFromFile();
    }
}