package com.demo.chapter12;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class TestFileReader {
	public static void main(String[] args) throws Exception{
		//第一步：关联文件
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"hello.txt";
		File file = new File(path);
		
		if(!file.exists()){//如果不存在 穿件文件
			file.createNewFile();
		}
		
		Reader reader = new FileReader(file);
		char data[] = new char[1024];
		int len = reader.read(data);
		System.out.println("读到的内容");
		System.out.println(new String(data,0,len));
		
		reader.close();
	}
}
