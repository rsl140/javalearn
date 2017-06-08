package com.demo.chapter11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> countryMap = new HashMap<Integer, String>();
		countryMap.put(1, "China");
		countryMap.put(2, "USA");
		countryMap.put(3, "England");
		countryMap.put(4, "Korea");
		countryMap.put(4, "Korea");
		//可为空 但是不能重复，如果有重复的 后面的会覆盖前面的
		countryMap.put(null, "12å");
		System.out.println("map的长度为："+countryMap.size());
		
		Set<Integer> keys = countryMap.keySet();
		
		System.out.println("遍历key：");
		//遍历key并取值
		System.out.println("序号\t国家");
		for (Integer integer : keys) {
			System.out.println(integer+"\t"+countryMap.get(integer));
		}
		
		System.out.println("返回值的集合：========");
		Collection<String> values = countryMap.values();
		for (String string : values) {
			System.out.println(string);
		}
		
		System.out.println("是否包含key为5的："+countryMap.containsKey(5));
		System.out.println("是否包含value为cn的："+countryMap.containsValue("China"));
		
		//System.out.println("key2的值是："+countryMap.get(2));
		//移除
		//countryMap.remove(2);
		
		System.out.println("取entrySet：------------");
		
		Set<Entry<Integer, String>> entryies = countryMap.entrySet();
		for (Entry<Integer, String> entry : entryies) {
			System.out.println(entry);
		}
	
	}
}
