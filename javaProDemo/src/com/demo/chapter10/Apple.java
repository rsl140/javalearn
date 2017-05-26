package com.demo.chapter10;

public class Apple extends Fruit{
	public String name;
	public String color;
	public String address;
	
	@Override
	void print() {
		System.out.println(this.name+","+this.color+","+this.address);
	}
}
