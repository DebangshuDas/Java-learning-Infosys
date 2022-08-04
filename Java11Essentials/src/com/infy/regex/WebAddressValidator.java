package com.infy.regex;

public class WebAddressValidator {
	public boolean isValidWebAddress(String webAddress)
	{
		String regex = "(http|https)[://]www\\.[a-z]+[.](com|org|net)";
		return webAddress.matches(regex);
        //code here
    }

}
