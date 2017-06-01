package com.homework.Interface;
/**
 * @author rsl
 * @功能 上机三
 * @时间 2017.6.1
 * */
public class TestPrinter {

	public static void main(String[] args) {
		Printer printer=new Printer();
		printer.setName("HP");
		printer.setInkBox(new BlackInkBox());
		printer.setPaper(new B5Paper());
		printer.print("Hello World");
		

	}

}
