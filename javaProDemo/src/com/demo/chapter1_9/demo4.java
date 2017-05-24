package com.demo.chapter1_9;


/*
 * @功能：数组的修改
 * @作者：饶思羚
 * @时间：2017.5.8
 * @地点：
 */

public class demo4 {

	public static void main(String[] args) {
		String[] musics = new String[]{"island","Ocean","Pretty","Sun"};//旧数组
		
		for(int i= 0;i<musics.length;i++){
			if(musics[i].equals("Ocean")){
				musics[i]="read";
				break;
			}
		}
		for(String str :musics){
			System.out.print(str+" ");
		}
	}

}
