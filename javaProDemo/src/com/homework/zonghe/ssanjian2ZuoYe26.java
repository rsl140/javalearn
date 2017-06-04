package com.homework.zonghe;

public class ssanjian2ZuoYe26 {
	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		ssanjianZuoYe26[] desk=new ssanjianZuoYe26[52];
		String[]f={"A","2","3","4","5","6","7","8","9"
				,"10","j","Q","k"};
		String[]s={"黑桃","红桃","梅花","方块"};
		for(int i=0;i<52;i++,num2++){
			if(i==13||i==26||i==39){
				num2=0;
				num1++;
			}
			desk[i]=new ssanjianZuoYe26(s[num1],f[num2]);
		}
		for (ssanjianZuoYe26 string : desk) {
			System.out.println(string);
		}

	}
}
