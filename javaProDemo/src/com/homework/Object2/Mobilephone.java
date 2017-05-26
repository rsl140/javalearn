package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础4
 * @时间 2017.5.27
 * */
public class Mobilephone extends Phone {
	private String type;//品牌

	public Mobilephone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobilephone(int phoneNumber,String type) {
		super(phoneNumber);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
