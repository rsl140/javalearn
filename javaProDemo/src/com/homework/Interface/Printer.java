package com.homework.Interface;
/**
 * @author rsl
 * @功能 上机三
 * @时间 2017.6.1
 * */
public class Printer {
	private String name;
	private Paper paper;
	private InkBox inkBox;
	
	public void print(String str){
		System.out.println(name+"牌的打印机打印出"+paper.getSize()
		+inkBox.getColor()+str);
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public InkBox getInkBox() {
		return inkBox;
	}

	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
