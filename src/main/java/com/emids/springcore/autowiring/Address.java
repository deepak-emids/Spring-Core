package com.emids.springcore.autowiring;

public class Address {

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}



	private String address;
	
	public Address(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	
 
}
