package com.homework.duotai;

public class Text {
	public static void main(String[] args) {
		//上机1
		Master a = new Master();
		Pet dog = new Dog();
		Pet penguin = new Penguin();
		Pet cat = new Cat();
		a.feed(dog);
		a.feed(penguin);
		a.feed(cat);
		
		//上机二
		a.play(dog);
		a.play(penguin);
	}
}
