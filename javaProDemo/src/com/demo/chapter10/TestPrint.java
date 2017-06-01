package com.demo.chapter10;

public class TestPrint {
	public static void main(String[] args) {
		Printer a = new ColorPrinter();
		a.print("1");
		Printer b = new BlackPrinter();
		b.print("2");
	}
	
}
