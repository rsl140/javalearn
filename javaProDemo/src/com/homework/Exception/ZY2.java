package com.homework.Exception;

public class ZY2 {
	public static void main(String[] args) {
		try {
			System.out.println("抛出异常前");
			int a = 1/0;
			//出异常，不执行try里面的下一行代码，跳到catch里。
			System.out.println("继续执行");
			
			}catch (Exception e) {
			System.out.println("捕获异常");
			}finally {//最终会执行的语句
			System.out.println("不管有没有异常，最后都要执行这里");
			}
	}
}
