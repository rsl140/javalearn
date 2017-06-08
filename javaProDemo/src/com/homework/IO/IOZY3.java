package com.homework.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class IOZY3 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"1.txt";
		String pathArrays =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"2.txt";
		System.out.println("输入一段字符串：");
		String strs = input.next();
		
		File file = new File(path);
		//排序后文件目录
		File filenew = new File(pathArrays);
		if(!file.exists()){
			file.createNewFile();
		}
		
		Writer writer = new FileWriter(path);
		if(!filenew.exists()){
			filenew.createNewFile();
		}
		writer.write(strs);
		writer.close();
		String[] strArrays = strs.split("");
		Arrays.sort(strArrays);
		
		Writer writerArrays = new FileWriter(pathArrays);
		if(!filenew.exists()){
			filenew.createNewFile();
		}
		String str1 = "";
		for (String string : strArrays) {
			str1+=string;
		}
		writerArrays.write(str1);
		writerArrays.close();
	}
}
