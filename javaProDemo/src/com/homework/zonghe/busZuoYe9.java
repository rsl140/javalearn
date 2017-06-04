package com.homework.zonghe;

public class busZuoYe9 {
//定义一个bus类，里面有speed和number属性。
	//以及构造方法和get、set方法。定义一个bus2的子类。并继承父类的方法。计算bus的速度和人数。
	private int speed;
	private int number;
	public busZuoYe9(){}
	
	public busZuoYe9(int speed, int number) {
		super();
		this.speed = speed;
		this.number = number;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
