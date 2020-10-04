package Seleniumpractice.Selenium;

public class CATPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remoing special charaters
		String s1="C*A@T";
		String s2=s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s2);
        
	    //Removing numeric characters
        String firstname1 = "S1234am";
        firstname1 = firstname1.replaceAll("[0-9]","");
        System.out.println(firstname1);
        
        //removing characters
        String roll = "S*123*am";
        roll = roll.replaceAll("[a-zA-Z]","");
        System.out.println(roll);
	}

}
