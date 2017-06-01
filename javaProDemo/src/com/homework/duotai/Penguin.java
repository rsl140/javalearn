package com.homework.duotai;

public class Penguin extends Pet{
	//上机一
	public void eat(){
		this.Health+=5;
		System.out.println("企鹅正在进食！");
		System.out.println("企鹅生命值为："+this.Health);
	}
	//上机二
		public void swimming(){
			this.Health-=10;
			System.out.println("企鹅和主人一起游泳");
			System.out.println("企鹅生命值为："+this.Health);
		}
}
