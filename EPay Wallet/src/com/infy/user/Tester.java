package com.infy.user;

public class Tester {

	public static void main(String[] args) {
		User user1 = new User(101,"Jack","jack@infy.com",1000);
		
		KYCUser user2 = new KYCUser(210,"Jill","jill@infy.com",3000,0);
		
		EPayWallet.processPaymentByUser(user1,700 );
		EPayWallet.processPaymentByUser(user2, 1500);
		EPayWallet.processPaymentByUser(user2, 800);
		EPayWallet.processPaymentByUser(user2, 1200);

	}

}
