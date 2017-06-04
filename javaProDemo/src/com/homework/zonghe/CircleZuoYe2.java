package com.homework.zonghe;

public class CircleZuoYe2 extends PointZuoYe2{
	double rad = 5;//半径
	//计算圆面积
	public double area(){
		return (3.14*rad*rad);
	}
	public void show(){
		System.out.println("圆面积为：" + area());
	}
}
