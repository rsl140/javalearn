package com.homework.duotai;

public class Dog extends Pet{
	//上机一
	public void eat(){
		this.Health+=3;
		System.out.println("狗狗正在进食！");
		System.out.println("狗狗生命值为："+this.Health);
	}
	
	//上机二
	public void catchingFlyDisc(){
		this.Health-=10;
		System.out.println("狗狗和主人玩飞盘游戏");
		System.out.println("狗狗生命值为："+this.Health);
	}
}
