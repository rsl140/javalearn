package com.homework.classes;
/**
 * @作者：饶思羚
 * @功能：面向对象一-课后作业2 调用
 * @地址：机房
 * @时间：2017.5.17
 * */
public class CurrentTimeTest {

	public static void main(String[] args) {
		CurrentTime time = new CurrentTime();
		//赋值
		time.year = 2011;
		time.mouth = 10;
		time.day = 1;
		time.s = 12;
		time.m = 11;
		time.s = 00;
		//显示
		time.show();
	}

}
