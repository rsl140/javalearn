package com.homework.zonghe;

public class TriangleZuoYe16 extends ZuoYe16{

	public TriangleZuoYe16(int length, int heigth) {
		super(length, heigth);
	}

	@Override
	public void area() {
		System.out.println("三角形面积："+(this.length*this.heigth)/2);
	}

}
