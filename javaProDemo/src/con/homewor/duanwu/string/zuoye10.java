package con.homewor.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串10
 * @时间 2017.5.30
 * */
public class zuoye10 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String str = input.next();
		//String str = "rotor";
		StringBuffer str1 = new StringBuffer(str);
		if(str1.reverse().toString().equals(str)){
			System.out.println("是回文字符");
		}
		else{
			System.out.println("不是回文字符");
		}
	}
}
