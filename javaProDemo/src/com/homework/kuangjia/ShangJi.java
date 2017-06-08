package com.homework.kuangjia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class ShangJi {
	public static void main(String[] args) {
		/**
		 * 上机练习1
		 * 
		 * */
		List stus = new ArrayList();
		StudentShangJi1 temp1 = new StudentShangJi1("小明",16);
		StudentShangJi1 temp2 = new StudentShangJi1("小红",16);
		StudentShangJi1 temp3 = new StudentShangJi1("小兰",16);
		
		stus.add(temp1);
		stus.add(temp2);
		stus.add(temp3);
		System.out.println("学员数量："+stus.size());
		for(int i=0;i<stus.size();i++){
			StudentShangJi1 stu = (StudentShangJi1)stus.get(i);
			System.out.println("姓名："+stu.name+",年龄："+stu.age);
		}
		stus.remove(temp1);
		System.out.println(stus.contains(temp1));
		
		/**
		 * 上机练习2
		 * */
		System.out.println("=====================");
		Vector<StudentShangJi1> stuVertor = new Vector<StudentShangJi1>();
		stuVertor.add(temp1);
		stuVertor.add(temp2);
		stuVertor.add(temp3);
		System.out.println("学员数量："+stuVertor.size());
		for(int i=0;i<stuVertor.size();i++){
			StudentShangJi1 stuVertors = (StudentShangJi1)stuVertor.get(i);
			System.out.println("姓名："+stuVertors.name+",年龄："+stuVertors.age);
		}
		stuVertor.remove(temp1);
		System.out.println(stuVertor.contains(temp1));
		
		/**
		 * 上机练习3
		 * */
		System.out.println("=====================");
		List<StudentShangJi1> stuList = new ArrayList<StudentShangJi1>();
		stuList.add(temp1);
		stuList.add(temp2);
		stuList.add(temp3);
		
		System.out.println("学员数量："+stuList.size());
		for (StudentShangJi1 studentShangJi1 : stuList) {
			System.out.println("姓名："+studentShangJi1.name+",年龄："+studentShangJi1.age);
		}
		stuList.remove(temp1);
		System.out.println(stuList.contains(temp1));
		
		/**
		 * 上机练习4
		 * */
		System.out.println("=====================");
		Map<Integer, StudentShangJi1> mapstr = new HashMap<Integer, StudentShangJi1>();
		mapstr.put(1, temp1);
		mapstr.put(2, temp2);
		mapstr.put(3, temp3);
		Scanner input = new Scanner(System.in);
		System.out.println("输入要查找的学号：");
		int id= input.nextInt();
		System.out.println("学员信息：");
		System.out.println("姓名："+mapstr.get(id).name+",年龄："+mapstr.get(id).age);
		
	}
}
