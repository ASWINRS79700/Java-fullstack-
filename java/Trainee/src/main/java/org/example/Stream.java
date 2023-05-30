package org.example;

import java.io.*;

public class Stream implements Serializable {
    public void serializeB (Trainee b){
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("stream");
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(b);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }
    public Trainee deSerialize (){
        try
        {
            //Saving of object in a file
            FileInputStream file = new FileInputStream("stream");
            ObjectInputStream out = new ObjectInputStream(file);

            // Method for serialization of object
            Trainee t=null;
            t= (Trainee) out.readObject();
            out.close();
            file.close();
            System.out.println(t);
            return t;



        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
