package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础19
 * @时间 2017.5.26
 * */
public class Fibonacci {
	public int fb(int num){
		int vale = 0;
		if(num < 2 && num >=0){
			vale = num;
		}
		else if(num >= 2){
			vale = fb(num - 1) + fb(num - 2);
		}
		return vale;
	}
	public static void main(String[] args) {
		Fibonacci test = new Fibonacci();
		for (int i = 0; i < 16; i++) {
			System.out.print(test.fb(i)+" ");
		}
		
	}
}
