package com.homework.duotai;

public class Cat extends Pet{
	//上机一
	public void eat(){
		this.Health+=2;
		System.out.println("小猫正在进食！");
		System.out.println("小猫生命值为："+this.Health);
	}
}
