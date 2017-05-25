package com.homework.Object2;
/**
 * @author rsl
 * @功能 面向对象基础作业1
 * @时间 2017.5.25
 * */
public class Score {
	private String course;
	private String grade;
	
	public Score(){}
	
	public Score(String course,String grade){
		this.course = course;
		this.grade = grade;
	}
	
	
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
