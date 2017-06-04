package com.homework.zonghe;

public class RectZuoYe16 extends ZuoYe16{

	public RectZuoYe16(int length, int heigth) {
		super(length, heigth);
	}

	@Override
	public void area() {
		System.out.println("长方形面积："+this.length*this.heigth);
	}

}
