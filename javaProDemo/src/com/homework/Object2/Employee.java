package com.homework.Object2;
/**
 * @author rsl
 * @功能 基础11
 * @时间 2017.5.27
 * */
public class Employee extends MyDate {
	private String name;
	private String moneyOfYear;//年薪
	public Employee() {
		super();
	}
	public Employee(String y, String m, String d,String name,String moneyOfYear) {
		super(y, m, d);
		this.name = name;
		this.moneyOfYear = moneyOfYear;
	}
	public void show(){
		String msg = "姓名："+name+"，年薪:"+moneyOfYear+",日期："+super.getY()+super.getM()+super.getD();
		System.out.println(msg);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMoneyOfYear() {
		return moneyOfYear;
	}
	public void setMoneyOfYear(String moneyOfYear) {
		this.moneyOfYear = moneyOfYear;
	}
	
	
}
