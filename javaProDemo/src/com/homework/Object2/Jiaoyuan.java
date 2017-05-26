package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础12-教员类
 * @时间 2017.5.27
 * 姓名、教授课程、专业方向、教龄
 * */
public class Jiaoyuan {
	private String thearName;
	private String classFor;
	private String perFor;
	private int yearAge;
	
	public Jiaoyuan(){}
	
	
	public Jiaoyuan(String thearName, String classFor, String perFor, int yearAge) {
		super();
		this.thearName = thearName;
		this.classFor = classFor;
		this.perFor = perFor;
		this.yearAge = yearAge;
	}
	public String getThearName() {
		return thearName;
	}
	public void setThearName(String thearName) {
		this.thearName = thearName;
	}
	public String getClassFor() {
		return classFor;
	}
	public void setClassFor(String classFor) {
		this.classFor = classFor;
	}
	public String getPerFor() {
		return perFor;
	}
	public void setPerFor(String perFor) {
		this.perFor = perFor;
	}
	public int getYearAge() {
		return yearAge;
	}
	public void setYearAge(int yearAge) {
		this.yearAge = yearAge;
	}
	
	
}
