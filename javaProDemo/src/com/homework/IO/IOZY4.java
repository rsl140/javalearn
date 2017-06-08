package com.homework.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IOZY4 {
	public static void main(String[] args) throws Exception{
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"1.txt";
		String copypath =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"2.txt";
		
		File file = new File(path);
		File copyfile = new File(copypath);
		InputStream input = new FileInputStream(file);
		
		if(!file.exists()){
			file.createNewFile();
		}
		if(!copyfile.exists()){
			copyfile.createNewFile();
		}
		byte data[] = new byte[1024];
		int len = input.read(data);
		
		input.close();
		OutputStream output = new FileOutputStream(copyfile);
		String str = "";
		//判断源文件是否有内容
		if(len != -1){
			str = new String(data,0,len);
		}

		output.write(str.getBytes());
		output.close();
		
	}
}
