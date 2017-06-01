package com.homework.Interface;
/**
 * @author rsl
 * @功能 课后二
 * @时间 2017.6.1
 * */
public class Dog2 extends Pet2 implements Eatable,FlyingDiscCatchable{

	@Override
	public void print() {
		System.out.println(this.name+"的健康值为："+this.health+"与主人的亲密度为："+this.love);
	}

	@Override
	public void catchingFlyDisc() {
		System.out.println("狗狗正在玩飞盘");		
	}

	@Override
	public void eat() {
		System.out.println("狗狗正在吃东西");		
	}
}
