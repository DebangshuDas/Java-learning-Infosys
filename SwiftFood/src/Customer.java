

public class Customer {
	private static int counter;
	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;
	private static float deliveryCharge;
	static {
		deliveryCharge = 1.5f;
		counter = 100;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Customer.counter = counter;
	}
	public Customer() {
		
	}
	public Customer(String customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}public Customer( String customerName, long contactNumber, Address address) {
		super();
		this.customerId = "C" + ++Customer.counter;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public Customer(String customerId, String customerName, long contactNumber, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}
	public static void setDeliveryCharge(float deliveryCharge) {
		Customer.deliveryCharge = deliveryCharge;
	}

	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + this.customerId);
		System.out.println("Customer Name : " + this.customerName);
		System.out.println("Contact Number : " + this.contactNumber);
		System.out.println("Address : " + this.address.toString());

		System.out.println("The delivery charge will be :"+Customer.deliveryCharge);
		System.out.println();
	}
	
	public double payBill(double totalPrice) {
		System.out.println("Final bill for the customer is calculated here");
		return totalPrice+Customer.deliveryCharge;
	}


}

