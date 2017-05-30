package con.homewor.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串3
 * @时间 2017.5.30
 * */
public class zuoye3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入第一段内容：");
		String str1 = input.next();
		System.out.println("输入第二段内容：");
		String str2 = input.next();
		String out = str1.length()>str2.length() ?"第一段内容长":"第二段内容长";
		System.out.println(out);
	}
	
}
