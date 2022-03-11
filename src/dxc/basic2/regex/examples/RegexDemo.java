package dxc.basic2.regex.examples;
 


class RegexDemo {
	
	public static void main(String args[]) { 
		
		String str = new String("We are going to learn Regular Expression in Java");
			
        //Declaring Regular Expressions For Comparisons
		String regex1 = "[A-Z].*";
		String regex2 = ".*to.*";
		
		/**
		 *      Different Uses of matches() method:
		 *      Note: matches() returns Boolean value (True/False) as result.
		 */
		//1. Checking the given String starts with an Uppercase Letter:
		System.out.println("Does the string start with an Uppercase Letter? : "+str.matches(regex1)); 
		
		//2. Checking the given String contains a particular Substring in it:
		System.out.println("Does the string contain the word 'to'? : " +str.matches(regex2));
		
		String str2 = "Thomas34";
		
		//Declaring the pattern as a Regular Expression:
		/**
		 *      The Required Pattern is:
		 *          1. First letter of String should be Uppercase [A-Z]
		 *          2. Atleast one letter in lowercase ([a-z]+)
		 *          3. should end with any two digit number \\d{2}
		 */
		String regex3="[A-Z]([a-z]+)\\d{2}";
		
		//3. Checking the given String follows a given Pattern:
		System.out.println("Does ("+str2+") match with required pattern ? : "+str2.matches(regex3));
	}
}
		