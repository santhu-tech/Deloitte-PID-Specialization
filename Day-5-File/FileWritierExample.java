package com.day5.fileconcept;

import java.io.*;

public class FileWritierExample {
    //CharStream
    //ByteStream
    //FileReader,BufferReader ,FileInputStream
    //FileWriter
    public static void main(String[] args) throws IOException {
        try(FileWriter writer=new FileWriter("output.txt",true)){
            writer.write("Deloitte Participants to the session");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //RandomAccessFile -->Help you to add the data to a specific position


        //Large file writing purpose you can use buffered Reader
        /*try(BufferedWriter writer=new BufferedWriter(new FileWriter( "output.txt"))){
            writer.write("This is my bufferedwriter");
            writer.newLine();
            writer.write("It's another example line ");

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/

       /* Byte Streaming purpose
        byte data[]={65,66,67,68};  //Writing the equvialent ASCII Values

        try(FileOutputStream outputStream=new FileOutputStream("output.bin")){
            outputStream.write(data);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        } */
    }

}
