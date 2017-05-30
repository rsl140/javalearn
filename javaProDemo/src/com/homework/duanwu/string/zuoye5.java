package con.homewor.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串5
 * @时间 2017.5.30
 * */
public class zuoye5 {
	public static void main(String[] args) {
		String str = "22030219851022024";
		if(str.startsWith("220302")){
			System.out.println("是以指定220302为前缀");
		}else{
			System.out.println("不是以指定220302为前缀");
		}
		
		if(str.endsWith("220302")){
			System.out.println("是以指定220302为后缀");
		}else{
			System.out.println("不是以指定220302为后缀");
		}
	}
	
}
