package com.demo.chapter12;

import java.io.File;
import java.io.*;

public class TestFileInputStream {
	public static void main(String[] args) throws Exception{
		//第一步：关联文件
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"hello.txt";
		File file = new File(path);
		if(!file.exists()){//如果不存在 穿件文件
			file.createNewFile();
		}
		//第二步：创建输入流
		InputStream input = new FileInputStream(file);
		
		//第三部：读文件
		byte data[] = new byte[1024];
		int len = input.read(data);// 只读取一次
		//第四步：关闭资源
		input.close();
		System.out.println("读到的内容是：");
		System.out.println(new String(data,0,len));
	}
}
