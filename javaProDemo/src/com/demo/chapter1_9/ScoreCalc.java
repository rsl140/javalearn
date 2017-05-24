package com.demo.chapter1_9;

public class ScoreCalc {
	int java;//java成绩
	int db;//数据库成绩
	int cSharp;//C#成绩
	
	public int sum(){
		return java+db+cSharp;
	}
	public double avg(){
		return sum()/3;
	}
}
