package con.homewor.duanwu.string;

import java.util.Scanner;

/**
 * @author rsl
 * @功能 字符串16
 * @时间 2017.5.27
 * */
public class zuoye16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入一组字符串：");
		String a = input.next();
		//String a = "我ABC汉DEF";
		byte b[] = a.getBytes();
		System.out.println("输入要截取的字符数量：");
		int c = input.nextInt();
		
//		System.out.println(a.length());
//		System.out.println(b.length);
//		System.out.println("----------------");
//		for(int i = 0;i<b.length;i++){
//			System.out.print(b[i]+" ");
//		}
		// 判断是否出现了截半，截半的话字节对于的ASC码是小于0的值 
		
		if (c > b.length) {  
            c = b.length;  
        }
		if(b[c] < 0){
//			String subStrx = new String(b, 0, --c);
//			System.out.println(subStrx);
			System.out.println(a.substring(0,c-1));
		}else{
//			String subStrx = new String(b, 0, c);
//			System.out.println(subStrx);
			System.out.println(a.substring(0,c));
		}
		
	}
}
