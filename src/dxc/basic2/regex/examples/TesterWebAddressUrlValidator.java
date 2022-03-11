package dxc.basic2.regex.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class TesterWebAddressUrlValidator {

	
	 String regex = "((http|https)://)(www.)?"
             + "[a-zA-Z0-9@:%._\\+~#?&//=]"
             + "{2,256}\\.[a-z]"
             + "{2,6}\\b([-a-zA-Z0-9@:%"
             + "._\\+~#?&//=]*)";
	 
	
	 public boolean isValidWebAddress(String url){
	        //code here
		 	
		 // Compile the ReGex
	        
			Pattern p = Pattern.compile(regex);
	 
			 
	        Matcher m = p.matcher(url);
	 
	        // Return if the string
	        // matched the ReGex
	        boolean flagFound =  m.matches();
	        
		 	
		 	System.out.println(" WebAddress : " +  url  +
		 			"  is valid  :" +   flagFound);
		 	
	        return flagFound;
	    }
	 
	 
	 	public static void main (String[] args) {
	       
	    	
	    	TesterWebAddressUrlValidator validator = new TesterWebAddressUrlValidator();
	    	
	    	String url1 = "http://www.dxc.com";
	    	
	    	String url2 = "https://www.dxc.com";
	    	
	    	String url3 = "htt://www.dxc.com";
	    	
	    	validator.isValidWebAddress(url1);
	    	
	    	
	    	validator.isValidWebAddress(url2);
	    	
	    	validator.isValidWebAddress(url3);
	    	
	    	
	    }
	 
	 
	 
}
 
 