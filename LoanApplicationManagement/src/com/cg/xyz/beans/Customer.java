package com.cg.xyz.beans;

public class Customer {
	private long custId;
	private String custName;
	private String address;
	private long mobile;
	private String email;
	
	public Customer() {
		
	}
	public Customer(String custName, String address, long mobile, String email) {
		super();
	
		this.custName = custName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}

}
