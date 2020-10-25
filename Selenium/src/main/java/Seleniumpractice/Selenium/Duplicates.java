package Seleniumpractice.Selenium;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings = new ArrayList<String>();
		strings.add("stack");
		strings.add("overflow");
		strings.add("yahoo");
		strings.add("msn");
		strings.add("MSN");
		strings.add("overflow");
		strings.add("stack");
		

		Map<String, Integer> counts = new HashMap<String, Integer>();

		for (String str : strings) {
		    if (counts.containsKey(str)) {
		        counts.put(str, counts.get(str) + 1);
		    } else {
		        counts.put(str, 1);
		    }
		}

		for (Map.Entry<String, Integer> entry : counts.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
