package com.homework.zonghe;

public class CircleZuoYe20 {
	protected int radius;
	public CircleZuoYe20(){}
	public CircleZuoYe20(int radius) {
		super();
		this.radius = radius;
	}

	public double mianji(){
		return 3.14*radius*radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
