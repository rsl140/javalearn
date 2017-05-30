package com.homework.duanwu.string;
/**
 * @author rsl
 * @功能 字符串2
 * @时间 2017.5.27
 * */
public class zuoye2 {
	public static void main(String[] args) {
		String str = "aaa果4金5a";
		  char d;
	         
	        for(int i=0;i<str.length();i++)
	        {
	             d=str.charAt(i);
	            if(d>='0'&&d<='9'){
	                int h=d-'0';
	              //截取需要后一位字符
	                char d1=str.charAt(i+1);
	                String s1=str.substring(0,i);
	                //截取后面的字符
	                String s2=str.substring(i+1);
	                for(int j=0;j<h;j++){
	                		s1=s1+d1;
	                }
	                str=s1+s2;
	            }
	        }
	            System.out.println(str);
	    }
	
}
