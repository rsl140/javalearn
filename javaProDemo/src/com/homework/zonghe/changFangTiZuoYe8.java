package com.homework.zonghe;

public class changFangTiZuoYe8 {
//定义一个changFangTi的父类，
	//里面有chang，kuan两个属性。和相应的构造方法和get、set方法。
	//定义个changFangTi2的子类继承changFangti，里面有一个gao属性，
	//有相信的get和set方法。和求体积的tiJi（）方法。在main（）方法中调用父类的方法。并求长方体的体积。
	private int chang;
	private int kuan;
	public changFangTiZuoYe8() {}
	
	public changFangTiZuoYe8(int chang, int kuan) {
		super();
		this.chang = chang;
		this.kuan = kuan;
	}
	public int getChang() {
		return chang;
	}
	public void setChang(int chang) {
		this.chang = chang;
	}
	public int getKuan() {
		return kuan;
	}
	public void setKuan(int kuan) {
		this.kuan = kuan;
	}
	
	
}
