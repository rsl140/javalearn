package com.homework.zonghe;

public class GunZuoYe58 {
	String name;
	private int num;//子弹数量
	private int id;//枪手编号
	static int count=0;
	
	public void fire(){
		System.out.println("开枪");
	}
	
	
	public GunZuoYe58(String name, int num, int id) {
		super();
		this.name = name;
		this.num = num;
		this.id = id;
	}


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
