package com.demo.chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class TestFileWriter {
	public static void main(String[] args) throws Exception{
		//第一步：关联文件
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"hello.txt";
		File file = new File(path);
		
		if(!file.exists()){//如果不存在 穿件文件
			file.createNewFile();
		}
		
		Writer writer = new FileWriter(file);
		String str = "中华人民共和国中华人民共和国";
		writer.write(str);
		writer.close();
		System.out.println("ok!");
	}
}
