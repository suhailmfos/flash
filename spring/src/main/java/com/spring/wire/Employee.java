package com.spring.wire;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}
	
}
