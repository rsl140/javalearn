package com.homework.duotai;

public class Master {
	
	//上机一
	public void feed(Pet pet){
		pet.eat();
	}
	//上机二
	int love=0;
	public void play(Pet pet){
		this.love+=5;
		if(pet instanceof Dog){
			((Dog) pet).catchingFlyDisc();
		}else if (pet instanceof Penguin){
			((Penguin) pet).swimming();
		}
	}
}
