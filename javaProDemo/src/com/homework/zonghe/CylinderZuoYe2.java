package com.homework.zonghe;

public class CylinderZuoYe2 extends CircleZuoYe2{
	int height = 6;
	//计算圆柱形体积
	public double vol(){
		return (3.14*rad*rad)*height;
	}
	//计算圆柱形表面积
	public double area(){
		return (3.14*rad*2)*height;
	}
	
	public void show(){
		System.out.println("圆柱形体积为：" + vol());
		System.out.println("圆柱形表面积：" + area());
	}
}
