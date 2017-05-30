package con.homewor.duanwu.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串17
 * @时间 2017.5.30
 * */
public class zuoye17 {
	
	public static void main(String[] args) {
		String str = "sbc,fds,des";
		str=str.replace(",","");
		String [] str1 = str.split("");
		
		Arrays.sort(str1);
		for (String strs : str1) {
			System.out.print(strs);
		}
		
		
	}
}
