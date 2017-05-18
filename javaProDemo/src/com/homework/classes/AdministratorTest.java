package com.homework.classes;

/**
 * @功能：面向对象1-上机练习三
 * @作者：饶思羚
 * @地点：机房
 * @时间：2017.5.17
 * */
public class AdministratorTest {

	public static void main(String[] args) {
		Administrator admin1 = new Administrator();//创建管理员对象1
		Administrator admin2 = new Administrator();//创建管理员对象2
		//给管理员对象1赋值并输出
		admin1.name = "admin1";
		admin1.password = "11111";
		admin1.show();
		System.out.println("===============");
		///给管理员对象2赋值并输出
		admin1.name = "admin2";
		admin1.password = "22222";
		admin1.show();
	}

}
