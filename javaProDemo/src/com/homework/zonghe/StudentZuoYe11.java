package com.homework.zonghe;

public class StudentZuoYe11 {
	public String name;
	public int age;
	
	
	
	
	public StudentZuoYe11(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}




	public static void main(String[] args) {
		StudentZuoYe11 peo1 = new StudentZuoYe11("x",19);
		StudentZuoYe11 peo2 = new StudentZuoYe11("y",30);
		
		String name = peo1.age > peo2.age ? peo1.name:peo2.name;
		System.out.println(name);
	}
}
