package com.demo.chapter1_9;


/*
 * @功能：数组的删除
 * @作者：饶思羚
 * @时间：2017.5.8
 * @地点：
 */

public class demo5 {

	public static void main(String[] args) {
		String[] musics = new String[]{"island","Ocean","Pretty","Sun"};//旧数组
		
		int index = -1;
		//查找需要删除的数组下标
		for(int i= 0;i<musics.length;i++){
			if(musics[i].equals("Ocean")){
				index = i;
				break;
			}
		}
		//移位
		for(int i = index;i<musics.length-1;i++){
			musics[i]=musics[i+1];
		}
		//删除最后一个数值
		musics[musics.length-1]=null;
		for(String str :musics){
			System.out.print(str+" ");
		}
	}

}
