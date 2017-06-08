package com.homework.kuangjia;

import java.util.HashMap;
import java.util.Map;

public class HashMapJianDa5 {
	public static void main(String[] args) {
		Map<String, Integer> stu = new HashMap<String, Integer>();
		stu.put("张三", 80);
		stu.put("李四", 65);
		stu.put("王五", 100);
		stu.put("赵六", 43);
		//修改
		stu.put("赵六", 20);
		//打印
		System.out.println(stu.values());
	}
}
