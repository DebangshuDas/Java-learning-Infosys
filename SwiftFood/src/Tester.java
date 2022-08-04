public class Tester {
	public static void main(String[] args) {
		Address custAddress = new Address(89,"D", "St. Louis Street",
				"Springfield", 62729);
		Customer premiumCustomer = new PremiumCustomer("C1016",
				"Stephen Abram", 7856341287L, custAddress);
		premiumCustomer.displayCustomerDetails();
		double amountRemaining = premiumCustomer.payBill(140);
		System.out.println("Final amount to be paid " + amountRemaining);
	}
}

