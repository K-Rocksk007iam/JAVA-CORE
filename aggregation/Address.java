package aggregation;

public class Address {
	private String bldName;
	private String city;
	private int pincode;

	public Address(String bldName, String city, int pincode) {
		super();
		this.bldName = bldName;
		this.city = city;
		this.pincode = pincode;
	}

	public String getBldName() {
		return bldName;
	}

	public void setBldName(String bldName) {
		this.bldName = bldName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
