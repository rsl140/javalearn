package com.demo.chapter11;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一串字符串：");
		String str = input.next();
		String[] strs = str.split("");
		Set<String> set=new HashSet<String>();
		Map<Integer, String> countryMap = new HashMap<Integer, String>();
		//赋值
		for (int i = 0; i < strs.length; i++) {
			countryMap.put(i+1, strs[i]);
			set.add(strs[i]);
		}
		//查找
		for (int i = 0; i < set.toArray().length; i++) {
			int count = 0;
			for(int j = 1;j<=countryMap.size();j++){
				if(countryMap.get(j).equals(set.toArray()[i])){
					count++;
				}
			}
			System.out.println(set.toArray()[i]+"的次数："+count);
		}
	}
}
