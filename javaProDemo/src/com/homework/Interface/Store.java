package com.homework.Interface;
/**
 * @author rsl
 * @功能 课后一
 * @时间 2017.6.1
 * */
public class Store {
	public Pet getPet(String pet){
		Pet a;
		if("dog".equals(pet)){
			a=new Dog();
		}else if("pig".equals(pet)){
			a= new Pig();
		}else{
			a= new Cat();
		}
		
		return a;
	}
}
