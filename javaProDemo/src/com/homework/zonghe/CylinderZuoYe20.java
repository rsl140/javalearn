package com.homework.zonghe;

public class CylinderZuoYe20 extends CircleZuoYe20{
	protected int height;
	
	public CylinderZuoYe20() {
		super();
	}
	public CylinderZuoYe20(int radius,int height) {
		super(radius);
		this.height = height;
	}
	public double tiji(){
		return mianji()*height;	
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public static void main(String[] args) {
		CylinderZuoYe20 test1 = new CylinderZuoYe20(5,4);
		CylinderZuoYe20 test2 = new CylinderZuoYe20(6,3);
		CylinderZuoYe20 test3 = new CylinderZuoYe20(7,2);
		System.out.println("高:"+test1.getHeight());
		System.out.println("面积:"+test1.mianji());
		System.out.println("体积:"+test1.tiji());
		System.out.println("-----------------");
		System.out.println("高:"+test2.getHeight());
		System.out.println("面积:"+test2.mianji());
		System.out.println("体积:"+test2.tiji());
		System.out.println("-----------------");
		System.out.println("高:"+test3.getHeight());
		System.out.println("面积:"+test3.mianji());
		System.out.println("体积:"+test3.tiji());
		System.out.println("-----------------");
	}
}
