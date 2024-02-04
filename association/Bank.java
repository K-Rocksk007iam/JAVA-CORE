package association;

class Bank {
	private String bankName;
	private String address;

	public Bank(String bankName, String address) {
		super();
		this.bankName = bankName;
		this.address = address;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
