package com.homework.Interface;
/**
 * @author rsl
 * @功能 上机二
 * @时间 2017.6.1
 * */
public class SoftEngineer implements BizAgent,Programmer{

	@Override
	public String getName() {
		return "jack";
	}

	@Override
	public void giveProgrammer() {
		System.out.println("我是工程师");
	}

	@Override
	public void giveBizAgent() {
		System.out.println("我会讲解业务");
	}
	
	public static void main(String[] args) {
		SoftEngineer text = new SoftEngineer();
		System.out.println("我叫"+text.getName());
		text.giveProgrammer();
		text.giveBizAgent();
	}
}
