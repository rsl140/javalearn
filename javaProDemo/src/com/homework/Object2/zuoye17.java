package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础17
 * @时间 2017.5.26
 * */
public class zuoye17 {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public static void main(String[] args) {
		zuoye17 text = new zuoye17();
		//赋值
		text.setX(9);
		text.setY(1);
		//获取
		System.out.println("x:"+text.getX());
		System.out.println("y:"+text.getY());
	}
}
