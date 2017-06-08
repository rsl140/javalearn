package com.demo.chapter12;

import java.io.File;
import java.util.Date;

public class FileTest2 {
	public static void main(String[] args) {
		String path =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"2.html";
		String path1 =File.separator+"Users"+File.separator+"rsl"+File.separator+"Desktop"+File.separator+"1.html";
		File file = new File(path);
		System.out.println("文件的名字是："+file.getName());
		System.out.println("是不是文件："+file.isFile());
		System.out.println("文件是否为隐藏："+file.isHidden());
		System.out.println("是否为目录："+file.isDirectory());
		System.out.println("最后一次修改时间："+file.lastModified());
		System.out.println("最后一次修改时间："+new Date(file.lastModified()));
		
		if(file.exists()){//如果目录不相同 相当于剪切
			File newFile = new File(path1);
			file.renameTo(newFile);
		}
	}
}
