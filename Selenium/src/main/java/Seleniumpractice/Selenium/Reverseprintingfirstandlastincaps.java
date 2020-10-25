package Seleniumpractice.Selenium;

public class Reverseprintingfirstandlastincaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="hello world";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
		s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		s2=s2.substring(0,1).toUpperCase()+s2.substring(1,4)+s2.substring(4,5).toUpperCase()+" "+
		s2.substring(6,7).toUpperCase()+s2.substring(7,10)+s2.substring(10,11).toUpperCase();
		System.out.println(s2);
	}

}
