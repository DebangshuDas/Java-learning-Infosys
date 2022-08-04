package com.infy.regex;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str);
		WebAddressValidator web = new WebAddressValidator();
		if(web.isValidWebAddress(str))
			System.out.println("You have entered a valid web address.");
		else
			System.out.println("You have entered a invalid web address.");

	}

}
