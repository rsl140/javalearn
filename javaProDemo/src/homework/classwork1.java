package homework;
import java.util.Scanner;
public class classwork1 {

	/*
	 * @功能：插入到合适位置
	 * @作者：饶思羚
	 * @时间：2017.5.9
	 * @地点：
	 */
	public static void main(String[] args) {
		String[] books = new String[]{"computer","Hibernate","java","struts"};//旧数组
		String inputbooks="";
		String[] newbooks = new String[books.length+1];
		
		for(int i=0;i<books.length;i++){
			newbooks[i] = books[i];
		}
		System.out.println("请输入新书名：");
		Scanner input = new Scanner(System.in);
		inputbooks = input.next();
		
		int index = -1;
		
		for(int i=0;i<newbooks.length;i++){
			if(newbooks[i].compareToIgnoreCase(inputbooks)>0){
				index=i;
				break;
			}
		
		}
		//移位 从后往前赋值
		for(int i = newbooks.length-1;i>index;i--){
			newbooks[i]=newbooks[i-1];
		}
		newbooks[index]=inputbooks;
		System.out.println("---------");
		for(String str:newbooks){
			System.out.println(str+" ");
		}
	}

}
