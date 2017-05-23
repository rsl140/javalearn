package com.homework.classString;
/**
 * @功能 类的有参 课后练习3
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 机房
 * */
public class Triangle {
	/*判断是否为三角形*/
	public boolean isTriangle(int a, int b, int c){
		if(a + b > c){
			System.out.println("是三角形！");
			return true;
		}else{
			System.out.println("不是三角形！");
			return false;
		}
		
	}
	/*判断是什么三角形*/
	public String shape(int a, int b, int c){
		String lx;
		if(a * a + b * b == c * c){
			lx = "直角三角形";
		}else if(a * a + b * b < c * c){
			lx = "钝角三角形";
		}else{
			lx = "锐角三角形";
		}
		return lx;
	}
}
