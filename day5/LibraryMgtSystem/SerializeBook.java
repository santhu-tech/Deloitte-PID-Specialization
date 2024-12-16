package com.day5.fileconcept.LibraryMgtSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeBook {
    public static void main(String[] args) {
        Book book =new Book("Java ","James Goslin", "918-23434549t5546","IT");
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("book.ser"))){
            out.writeObject(book); //Serialize the object
            System.out.println("Book object serialized ");
            System.out.println();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
