package com.demo.chapter10;

public class TrstDog {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		System.out.println("我的名字是：" + dog.name);
		System.out.println("我的年龄是：" + dog.age);
		
		Dog dog1 = new Dog("八公");
		
		System.out.println("我的名字是：" + dog1.name +" " + dog1.age);
		Dog[] dog2 = new Dog[4];
		
	}

}
