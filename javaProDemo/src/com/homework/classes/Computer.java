package com.homework.classes;
/**
 * @作者：饶思羚
 * @功能：面向对象一-课后作业3
 * @地址：机房
 * @时间：2017.5.17
 * */
public class Computer {
	String cpu;
	String mainboard;//主板
	String display;//显示器
	String hdd;//硬盘
	String memory;//内存
	//显示
	public void show(){
		System.out.println(cpu.toString() + mainboard.toString() + display.toString() + hdd.toString() + memory.toString());
	}
}
