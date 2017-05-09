package homework;
import java.util.Scanner;
public class arrayshomework2 {

	/*
	 * @功能：统计每个整数和非法数字的个数
	 * @作者：饶思羚
	 * @时间：2017.5.8
	 * @地点：家
	 */
	public static void main(String[] args) {
		System.out.println("请输入10个数：");
		Scanner input = new Scanner(System.in);
		int[] number = new int[10];//循环输入10个数字
		for(int i = 0;i<number.length;i++){
			number[i] = input.nextInt();
		}
		//System.out.println(number.length);
		int one = 0,two = 0,three = 0,def = 0;//计算数字个数
		for(int j = 0;j<number.length;j++){
			switch(number[j]){//判断数字是否为非法并计数
			case 1: one++;
			break;
			case 2: two++;
			break;
			case 3: three++;
			break;
			default: def++;
			break;
			}
		}
		System.out.println("数字1的个数："+one);
		System.out.println("数字2的个数："+two);
		System.out.println("数字3的个数："+three);
		System.out.println("非法数字的个数："+def);
	}

}
