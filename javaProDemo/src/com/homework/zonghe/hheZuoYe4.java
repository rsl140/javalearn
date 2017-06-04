package com.homework.zonghe;

public class hheZuoYe4 {
	private int length;
	private int width;
	private int high;
	//体积
	public void tiJi(){
		System.out.println("体积为：" + (length * width * high));
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	
}
