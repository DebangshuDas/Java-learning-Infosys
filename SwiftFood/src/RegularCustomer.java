

class RegularCustomer extends Customer {
	private float discount;
	
	public RegularCustomer() {
		super();
	}
	public RegularCustomer(String custId, String custName) {
		super(custId,custName);
		this.discount = 5.0f;
	}
	public RegularCustomer(String custId, String custName, long mobileNo,
			Address address) {
		super(custId, custName, mobileNo, address);
		this.discount = 5.0f;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	@Override
	public double payBill(double totalPrice) {
		return totalPrice* (1 - (discount / 100));
	}
}



