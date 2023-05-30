package com.stackroute.fileio;

import java.io.IOException;
import java.io.*;

public class RemoveDuplicateLines {
    //write logic to read data from input.txt and  write result to output.txt
    public void removeDuplicateLines() throws IOException {
        PrintWriter pwobj = new PrintWriter("output.txt");

        BufferedReader brobj1 = new BufferedReader(new FileReader("input.txt"));

        String line1 = brobj1.readLine();


        while(line1 != null)
        {
            boolean flag = false;

            BufferedReader brobj2 = new BufferedReader(new FileReader("output.txt"));

            String line2 = brobj2.readLine();

            while(line2 != null)
            {

                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }

                line2 = brobj2.readLine();

            }

            if(!flag){
                pwobj.println(line1);

                pwobj.flush();
            }

            line1 = brobj1.readLine();

        }

        brobj1.close();
        pwobj.close();



    }
}