package com.homework.duanwu.string;

public class zuoye15 {
	/**
	 * @author rsl
	 * @功能 字符串14
	 * @时间 2017.5.27
	 * */
	public static void main(String[] args) {
		String a="yekmaakkccekymbvb";
		int longth=a.length();
		for(int i=0;i<longth;i++){
			if(!"".equals(a)){
				String d=a.substring(0,1);
				//重复的变为空
				String b=a.replace(d, "");
				//原先长度减去去重长度等于去掉得个数==有几个相同的
				System.out.println(d+":"+(a.length()-b.length()));
				a=b;
			}
			else{
				break;
			}
		}
	}
}
