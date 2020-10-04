package Seleniumpractice.Selenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:/New folder/File.txt");
            BufferedReader bf = new BufferedReader(reader);
                            //OR
        	//File file = new File("C:\\New folder\\File.txt"); 
        	//BufferedReader bf = new BufferedReader(new FileReader(file));
            // We need to provide file path as the parameter: 
            // double backquote is to avoid compiler interpret words 
            // like \test as \t (ie. as a escape sequence)
            String line;
 
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
