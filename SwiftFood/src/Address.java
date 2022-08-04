
public class Address {
	
	private int houseNo;
	private String blockNo;
	private String streetNmae;
	private String cityName;
	private int pincode;
	public Address(int houseNo, String blockNo, String streetNmae, String cityName, int pincode) {
		super();
		this.houseNo = houseNo;
		this.blockNo = blockNo;
		this.streetNmae = streetNmae;
		this.cityName = cityName;
		this.pincode = pincode;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getBlockNo() {
		return blockNo;
	}
	public void setBlockNo(String blockNo) {
		this.blockNo = blockNo;
	}
	public String getStreetNmae() {
		return streetNmae;
	}
	public void setStreetNmae(String streetNmae) {
		this.streetNmae = streetNmae;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String toString() {
		return this.getBlockNo()+"/"+this.getHouseNo()+", "+this.getStreetNmae()+", "+this.getCityName()+", Pin Code - "+this.getPincode();
		
	}

}
