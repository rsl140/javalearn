package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础4
 * @时间 2017.5.27
 * */
public class Phone {
	private int phoneNumber;
	public Phone() {	}
	
	public Phone(int phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	private void callPhone(){
		System.out.println("打电话");
	}
	private void getPhone(){
		System.out.println("接电话");
	}
	
}
