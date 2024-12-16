package com.day5.fileconcept.LibraryMgtSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeBook {
    public static void main(String[] args) throws FileNotFoundException {

        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("book.ser"))){
            Book book=(Book) in.readObject(); //Deserialize the object
            System.out.println("Deserialized" + book);

        }
        catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
