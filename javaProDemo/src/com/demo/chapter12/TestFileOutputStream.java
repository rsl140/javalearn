package com.demo.chapter12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class TestFileOutputStream {
	public static void main(String[] args) throws Exception {
		//第一步：关联文件
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"hello.txt";
		File file = new File(path);
		if(!file.exists()){
			file.createNewFile();
		}
		
		//第二部：创建输出流
		OutputStream outputStream = new FileOutputStream(file);
		//OutputStream outputStream = new FileOutputStream(file,true); //不覆盖原内容
		
		//第三部：写内容到文件
		String str = "Hello,World";
		outputStream.write(str.getBytes());//写内容到文件
		//第四部：关闭资源
		outputStream.close();
	}
}
