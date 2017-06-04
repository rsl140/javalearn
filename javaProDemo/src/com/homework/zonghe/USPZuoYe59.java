package com.homework.zonghe;

public class USPZuoYe59 extends GunZuoYe58{

	public USPZuoYe59(String name, int num, int id) {
		super(name, num, id);
		// TODO Auto-generated constructor stub
	}
	public void fire(){
		this.setNum(this.getNum()-1);
	}
	
	public void add(){
		this.setNum(12);
	}
}
