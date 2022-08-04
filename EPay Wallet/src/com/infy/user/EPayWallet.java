package com.infy.user;

public class EPayWallet {
	
	public static void processPaymentByUser(KYCUser user,double billAmount) {
		if(user.makePayment(billAmount)) {
			System.out.println("Congratulations "+user.getUsername()+", payment of "+billAmount+" was successful :)");
		}
		else {
			System.out.println("Sorry "+user.getUsername()+", not enough balance to make payment :(");
		}
		System.out.println("Your wallet balance is "+user.getWalletBalance());
		System.out.println("You have "+ user.getRewardPoints()+" reward points");
	}
	public static void processPaymentByUser(User user,double billAmount) {
		if(user.makePayment(billAmount)) {
			System.out.println("Congratulations "+user.getUsername()+", payment of "+billAmount+" was successful :)");
		}
		else {
			System.out.println("Sorry "+user.getUsername()+", not enough balance to make payment :(");
		}		
		System.out.println("Your wallet balance is "+user.getWalletBalance());
	}

}
