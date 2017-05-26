package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础18
 * @时间 2017.5.26
 * */
public class zuoye18 {
	public void isSuSu(){
		int num = 0;
		for (int i = 2; i <= 200; i++) {
			int count =0;
			for(int j = 1;j <= i;j++){
				
				if(i%j==0){
					count++;
				}
			}
			if(count == 2){
				System.out.print(i+" ");
			}
			
		}
	}
	public static void main(String[] args) {
		zuoye18 test = new zuoye18();
		test.isSuSu();
	}
}
