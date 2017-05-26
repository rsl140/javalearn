package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础7
 * @时间 2017.5.27
 * */
public class Rectangle {
	private int chang;
	private int kuan;
	//周长
	public int zhouChang(){
		return (this.chang + this.kuan) * 2;
	}
	//面积
	public int mianJi(){
		return this.chang * this.kuan;
	}
	//打印
	public void show(){
		System.out.println("周长为："+ zhouChang() +"，面积为：" + mianJi());
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
	
	
	public static void main(String[] args) {
		Rectangle test = new Rectangle();
		test.setChang(14);
		test.setKuan(20);
		test.show();
	}
}
