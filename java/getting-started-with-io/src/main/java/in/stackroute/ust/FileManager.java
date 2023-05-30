package in.stackroute.ust;


import java.io.*;

public class FileManager {

    private String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public void writeToFile(String data) throws IOException {
        // opening a stream to the data.txt file
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(data);
        writer.flush();
        writer.close();
    }

    public void printToFile(String data) throws IOException {
        // node stream
        try (FileWriter writer = new FileWriter(fileName, true)) { // try with resource block
            // stream chaining using a filter stream
            try (PrintWriter printWriter = new PrintWriter(writer)) {
                printWriter.println(data);
                printWriter.flush();
                writer.flush();
            }
        }

    }

    public void readFromFile() throws IOException {
        FileReader reader = new FileReader(fileName);
        int read = 0;
        while (read != -1) {
            read = reader.read();
            System.out.print((char) read);
        }
        reader.close();
    }

    public void printFromFile() {
        try (FileReader fileReader = new FileReader(fileName)) {
            try(BufferedReader bufferedReader = new BufferedReader(fileReader)){
                String line = bufferedReader.readLine();
                while (line != null){
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
