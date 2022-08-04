package com.infy.regex;

import java.util.regex.Pattern;

class RegexDemo {
	
	public static void main(String args[]) { 
		
		//Creating a Pattern through Regular Expression 
		String regex = "Hello";
		//String to be compared with RegEx 
		String input = "Hello";
			
		//Pattern Matching done using matches() method
		System.out.println(input.matches(regex));
		//Pattern Matching done using Pattern.matches() method
		System.out.println(Pattern.matches(regex, input));
		/**
		 *  Output: true, true
		 */
		
		//Sample String
		String chainedString = "Lets-break-this-chain-and-be-free-!";
		//Creating Regex for splitting the String
		regex = "-";
		//Splitting the String using split() method
		//split()divides the String and stores them in a Array of String
		String[] freeString = chainedString.split(regex);
		/**
		 *  freeString = ("Lets", "break", "this", "chain", "and", "be", "free", "!")
		 */


		//Regular Expression for Name Validation:
		String nameRegex = "([A-Za-z ]+)";        
		//Regular Expression for Email Id Validation:
		String emailIdRegex = "([A-Za-z0-9-_]+)[@]([a-z]+)[.](com|in)";
		
		

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
		
