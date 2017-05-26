package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础21
 * @时间 2017.5.26
 * */
public class zuoye21 {
	public static void main(String[] args) {

		  int a[] = new int[100];
		  int count[] =new int[7];
		  System.out.println("生成的随机数");
		  for(int i = 0; i < 100; i++){
			  a[i] = (int)(Math.random()*6) + 1;
			  //对应下标数字+1计算出共出现几次
			  count[a[i]]++;
			  System.out.print(a[i] + " ");
		  }
		  System.out.println();
		  for(int i = 1; i < 7;i++){
			  System.out.println(i+":"+count[i]);
		  }
		 
	}
}
