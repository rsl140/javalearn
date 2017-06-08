package com.homework.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class IOZY1 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		String pathOrigin =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"2.txt";
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator;
		System.out.println("输入创建的文件名：");
		String fileName = input.next();
		path+=fileName+".txt";
		
		File file = new File(pathOrigin);
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
		Writer writer = new FileWriter(filenew);
		if(!filenew.exists()){
			filenew.createNewFile();
		}
		writer.write(str);
		writer.close();
	}
}
