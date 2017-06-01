package com.homework.duotai;
/**
 * 作业2
 * 
 * */
public class TestPrient {
	public static void main(String[] args) {
		Printer test1 = new DotMatrixPrinter();
		Printer test2 = new InkpetPrinter();
		Printer test3 = new LaserPrinter();
		
		test1.print();
		test2.print();
		test3.print();
	}
	
}
