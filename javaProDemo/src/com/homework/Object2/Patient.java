package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础13
 * @时间 2017.5.26
 * */
public class Patient {
	private String name;
	private char sex;
	private int age;
	private float weight;
	private boolean allergies;
	
	public Patient() {
		
	}
	
	
	public Patient(String name, char sex, int age, float weight, boolean allergies) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.weight = weight;
		this.allergies = allergies;
	}

	public void show(){
		System.out.println("姓名："+this.name+",性别:"+this.sex+",年龄"+this.age+",体重"+this.weight+",过敏性："+this.allergies);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public boolean isAllergies() {
		return allergies;
	}
	public void setAllergies(boolean allergies) {
		this.allergies = allergies;
	}
	
	public static void main(String[] args) {
		Patient text1 = new Patient("1",'男',15,100,true);
		Patient text2 = new Patient("2",'女',25,80,false);
		text1.show();
		text2.show();
		
	}
}
