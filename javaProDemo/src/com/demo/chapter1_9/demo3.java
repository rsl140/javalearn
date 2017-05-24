package com.demo.chapter1_9;

import java.util.Scanner;

/*
 * @功能：数组的增加
 * @作者：饶思羚
 * @时间：2017.5.8
 * @地点：
 */

public class demo3 {

	public static void main(String[] args) {
		String[] musics = new String[]{"island","Ocean","Pretty","Sun"};//旧数组
		String[] newMusic = new String[musics.length+1];
		String inputMusic = "";
		for(int i=0;i<musics.length;i++){
			newMusic[i]=musics[i];//赋值
		}
		System.out.println("请输入歌名：");
		Scanner input =new Scanner(System.in);
		inputMusic = input.next();
		int index=-1;//找不到
		//找到存放位置
		for(int i = 0;i<newMusic.length-1;i++){
			if(newMusic[i].compareToIgnoreCase(inputMusic)>0){
				index = i;
				break;
			}
		}
		System.out.println("插入位置为："+index);
		//判断是否为有效位置
		if(index!=-1){
			//移位
			for(int i = newMusic.length-1;i>index;i--){
				newMusic[i]=newMusic[i-1];
			}
			//赋值到指定地址
			newMusic[index] = inputMusic;
		}else{
			newMusic[newMusic.length-1] = inputMusic;
		}
		
		//输出新数组
		for(String str :newMusic){
			System.out.print(str+" ");
		}
	}

}
