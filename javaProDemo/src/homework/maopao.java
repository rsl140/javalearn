package homework;

import java.util.Arrays;


public class maopao {

	public static void main(String[] args) {
		int[] data = {2,5,3,1,4};
		
		System.out.println("排序前："+Arrays.toString(data));
		for(int i = 0;i<data.length-1;i++){
			for(int j = 0;j<data.length-1-i;j++){
				if(data[j]>data[j+1]){
					int temp;
					temp = data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		System.out.println("排序后："+Arrays.toString(data));
	}

}
