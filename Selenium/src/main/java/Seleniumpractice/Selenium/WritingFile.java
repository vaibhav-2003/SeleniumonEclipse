package Seleniumpractice.Selenium;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
	
	  public static void main(String[] args) {
		    try {
		      FileWriter myWriter = new FileWriter("C:\\New folder\\File1.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
		    try  
			{ 
		    File file = new File("C:\\New folder\\File1.txt");   
			if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
			{  
			System.out.println("not supported");  
			return;  
			}  
			Desktop desktop = Desktop.getDesktop();  
			if(file.exists())         //checks file exists or not  
			desktop.open(file);              //opens the specified file  
			}  
			catch(IOException e)  
			{  
			e.printStackTrace();  
			}  
		  }

}
