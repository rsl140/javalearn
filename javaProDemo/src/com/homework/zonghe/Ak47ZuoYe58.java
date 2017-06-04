package com.homework.zonghe;

public class Ak47ZuoYe58 extends GunZuoYe58{

	public Ak47ZuoYe58(String name, int num, int id) {
		super(name, num, id);
	}
	public void fire(){
		this.setNum(this.getNum()-1);
	}
	
	public void add(){
		this.setNum(30);
	}
}
