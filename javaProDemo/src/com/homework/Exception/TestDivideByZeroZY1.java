package com.homework.Exception;

public class TestDivideByZeroZY1 {
	public double div(double a,double b) throws DivideByZeroExZY1{
		if(b==0){
			throw new DivideByZeroExZY1("除数不能为0");
		}else{
			return a/b;
		}
	}
	
	public static void main(String[] args) {
		TestDivideByZeroZY1 test = new TestDivideByZeroZY1();
		try{
			test.div(1, 0);
		} catch(DivideByZeroExZY1 e){
			e.printStackTrace();
			//e.getMessage();
		}
	}
}
