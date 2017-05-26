package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础9
 * @时间 2017.5.27
 * */
public class Point {
	private int x;
	private int y;
	
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public static void main(String[] args) {
		Point test = new Point(10, 20);
		System.out.println("x:"+ test.getX() +",y:"+ test.getY());
	}
}
