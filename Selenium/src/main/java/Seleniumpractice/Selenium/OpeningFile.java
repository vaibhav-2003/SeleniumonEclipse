package Seleniumpractice.Selenium;

import java.awt.Desktop;
import java.io.File;

public class OpeningFile {
	public static void main(String[] args)   
	{  
	try  
	{  
	//constructor of file class having file as argument  
	File file = new File("C:\\New folder\\File.txt");   
	if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
	{  
	System.out.println("not supported");  
	return;  
	}  
	Desktop desktop = Desktop.getDesktop();  
	if(file.exists())         //checks file exists or not  
	desktop.open(file);              //opens the specified file  
	}  
	catch(Exception e)  
	{  
	e.printStackTrace();  
	}  
	}  
	

}
