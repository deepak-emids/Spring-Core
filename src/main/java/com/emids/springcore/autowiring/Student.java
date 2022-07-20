package com.emids.springcore.autowiring;

public class Student {

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Address address;
	private int id;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Address address, int id, String name) {
		super();
		this.address = address;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + ", id=" + id + ", name=" + name + "]";
	}

}
