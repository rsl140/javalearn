package com.demo.chapter10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
//		Dog dog0 = new Dog("小黄",4);
//		Dog dog1 = new Dog("小2",5);
//		Dog dog2 = new Dog("小3",7);
//		Dog dog3 = new Dog("小4",10);
		
		List<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(new Dog("小黄",4));
		dogs.add(new Dog("小2",5));
		dogs.add(new Dog("小3",7));
		dogs.add(new Dog("小4",10));
		System.out.println("总共有小狗"+dogs.size()+"只");
		System.out.println("-------------分割线------------");
		show(dogs);
		System.out.println("-------------移除第三条狗------------");
		
		dogs.remove(2);
		show(dogs);
		
		LinkedList<Penguin> pen = new LinkedList<Penguin>();
		
		
		pen.add(new Penguin("2",3,"男"));
		pen.add(new Penguin("3",5,"男"));
		pen.add(new Penguin("4",9,"女"));
		pen.addFirst(new Penguin("1",8,"女"));
		showPen(pen);
		}
		public static void show(List<Dog> dogs){
			for (int i = 0; i < dogs.size(); i++) {
				System.out.println("狗名:"+dogs.get(i).name);
			}
		}
		public static void showPen(List<Penguin> pen){
			
			for (int i = 0; i < pen.size(); i++) {
				System.out.println("企鹅名:"+pen.get(i).getName());
			}
		}
	
}
