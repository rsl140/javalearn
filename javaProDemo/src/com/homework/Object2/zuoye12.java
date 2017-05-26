package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础12-学生类
 * @时间 2017.5.27
 * 姓名、年龄、兴趣、班级编号和一个教员类
 * */
public class zuoye12 extends Jiaoyuan{
	private String name;
	private int age;
	private String like;
	private int classNo;
	
	public zuoye12() {
		super();
	}
	
	
	
	public zuoye12(String name, int age, String like, int classNo,String thearName, String classFor, String perFor, int yearAge) {
		super(thearName, classFor, perFor, yearAge);
		this.name = name;
		this.age = age;
		this.like = like;
		this.classNo = classNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	public int getClassNo() {
		return classNo;
	}
	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}
	
}
