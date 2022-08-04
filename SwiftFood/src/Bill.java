

public class Bill {
	private static int counter = 9000;
	private String billId;
	private String paymentMode;
	
	{
		counter = counter+1;
	}
	
	public Bill(String paymentMode) {
		
		this.billId = "B"+ Bill.counter;
		this.paymentMode = paymentMode;
	}
	public static int getCounter() {
		return counter;
	}
	
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	

}
