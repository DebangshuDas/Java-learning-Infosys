
public class Order {
	
	private int orderId;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;
	private static int orderIdCounter = 100;
	private Customer customer;
	
	
	public Order() {
		this.status = "Ordered";
	}
	public Order(Food[] orderedFoods) {
		this.orderId = ++Order.orderIdCounter;
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	
	
	public Order(Food[] orderedFoods, Customer customer) {
		this.orderId = ++Order.orderIdCounter;
		this.orderedFoods = orderedFoods;
		this.customer = customer;
		this.status = "Ordered";
	}
	public static int getTotalNoOfOrders() {
		return Order.orderIdCounter;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
		
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}
    
    //other methods
	
	public double calculateTotalPrice(String paymentMode) {
		double foodPrice = 0;
		double finalPrice = 0;
		float serviceCharge = 0f;
		for (Food food : orderedFoods) {
			foodPrice+=food.getUnitPrice()*1;
		}
		if (paymentMode.equals("Credit Card") || paymentMode.equals("Debit Card")) {
			serviceCharge = 2.0f;
		}
		else if (paymentMode.equals("PayPal")) {
			serviceCharge = 2.9f;
		}
		finalPrice = foodPrice+foodPrice*(serviceCharge/100);
		return finalPrice;
	}

	public static void setOrderIdCounter(int orderIdCounter) {
		Order.orderIdCounter = orderIdCounter;
	}
}


