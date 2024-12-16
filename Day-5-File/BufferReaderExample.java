package com.day5.fileconcept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {
    public static void main(String[] args) throws FileNotFoundException {
        try(BufferedReader reader=new BufferedReader(new FileReader("src/example.txt"))){
            String line;
            while((line =reader.readLine()) !=null)

            {
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());


    }
}
}
