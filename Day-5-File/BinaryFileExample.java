package com.day5.fileconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryFileExample {
    //FileInputStream


    //Reading the image,Audio,Video file as the binart data or Byte streams
    //ETL -->.CSV or JSON files
    //WebApplication -->image resizing
    //Microservices Application -->log files

    public static void main(String[] args) throws IOException {
        try(FileInputStream inputStream=new FileInputStream("C:/Users/SanthiyaP/Desktop/Viyaan Study/Puppy.jpg")){
            int byteData;
            while((byteData=inputStream.read())!=-1){
                System.out.println(byteData + " ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
