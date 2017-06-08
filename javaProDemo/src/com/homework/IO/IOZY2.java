package com.homework.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class IOZY2 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator;
		System.out.println("输入创建的文件名：");
		String fileName = input.next();
		System.out.println("输入要拷贝的文件名：");
		String oldName = input.next();
		String newFilePath = path + fileName +".txt";
		path += oldName +".txt";
		
		File file = new File(path);
		File filenew = new File(path);
		if(!file.exists()){
			file.createNewFile();
		}
		
		//读取旧文件
		Reader reader = new FileReader(file);
		char data[] = new char[1024];
		int len = reader.read(data);
		
		String str="";
		for (int i = 0; i < len; i++) {
			str += data[i];
		}
		reader.close();
		Writer writer = new FileWriter(newFilePath);
		if(!filenew.exists()){
			filenew.createNewFile();
		}
		writer.write(str);
		writer.close();
	}
}
