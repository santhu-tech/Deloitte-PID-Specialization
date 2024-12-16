package com.day5.fileconcept;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try(FileReader reader=new FileReader("src/example.txt")){

            //Try with Resources
         //   AutoCloseable
            int character;
            while((character= reader.read())!=-1){
                System.out.println((char) character);
            }


        }
        catch(IOException e){
            System.out.println("Error occurered" +e.getMessage());
        }
    }
}
