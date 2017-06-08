package com.homework.kuangjia;

import java.util.*;

public class Queue {
/**
 * 简答题4
 * */
	LinkedList list = new LinkedList();
	void add(Object obj){
		list.addFirst(obj);
	}
	void get(){
		list.removeLast();
	}
	public static void main(String[] args) {
		Queue que = new Queue();
		que.add("1");
		que.add("2");
		que.add("3");
		que.add("4");
		
		que.get();
		
		for (Object string : que.list) {
			System.out.println(string);
		}
	}

}
