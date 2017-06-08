package com.demo.chapter12;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		//关联文件
		
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"2.html";
		File file = new File(path);
		//检查文件夹路径
		if(!file.getParentFile().exists()){
			file.getParentFile().mkdirs();//创建文件的父路径
		}
		
		if(file.exists()){//如果存在
			file.delete();
		}else{
			try {
				file.createNewFile();//创建文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("程序结束");
	}
}
