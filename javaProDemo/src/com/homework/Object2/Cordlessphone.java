package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础4
 * @时间 2017.5.27
 * */
public class Cordlessphone extends Fixedphone {
//样式
	public String type;//子母机之类的

	public Cordlessphone() {
		super();
	}

	public Cordlessphone(int phoneNumber, String address,String type) {
		super(phoneNumber, address);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
