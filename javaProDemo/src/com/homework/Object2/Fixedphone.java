package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础4
 * @时间 2017.5.27
 * */
public class Fixedphone extends Phone {
	private String address;//家里放置位置

	
	public Fixedphone() {
		super();
	}

	public Fixedphone(int phoneNumber,String address) {
		super(phoneNumber);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
