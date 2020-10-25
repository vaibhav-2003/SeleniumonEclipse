package Seleniumpractice.Selenium;

import java.util.*;

public class secondlargestfromrepeatedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          List<Integer> l=new ArrayList<Integer>();
          l.add(10);
          l.add(10);
          l.add(30);
          l.add(40);
          l.add(10);
          l.add(50);
		  int temp, size;
	      Integer [] array= new Integer[l.size()];
	      array=l.toArray(array);
	      for(Integer i:array)
	      {
	      System.out.print(i+",");
	      }
	      size = array.length;
          
	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Second largest number is:: "+array[size-2]);
	   }
	
	}


