package configuration;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String args[]) {
	     
	     HashMap<String,String> hmp = new HashMap<String,String>();
	     hmp.put("1","Rajeev");
	     hmp.put("2","Gaurav");
	     hmp.put("3","Tree");
	     
	     hmp.forEach((k,v)->{
	    	 System.out.println(k + " "+ v);
	     });
	}
}

