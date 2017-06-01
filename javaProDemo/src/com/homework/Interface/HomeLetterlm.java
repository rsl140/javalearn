package com.homework.Interface;
/**
 * @author rsl
 * @功能 上机一
 * @时间 2017.6.1
 * */
public class HomeLetterlm implements HomeLetter{

	@Override
	public String writeTitle() {
		return "亲爱的爸爸，妈妈\n";
	}

	@Override
	public String WriteHello() {
		return "你们好吗？\n";
	}

	@Override
	public String writeBody() {
		return "我在这里挺好的。\n我会努力学习的，已经学到java OOP啦！\n请您二老保重身体啊!\n";
	}

	@Override
	public String writeGreeting() {
		return "   此致\n敬礼";
	}

	@Override
	public String writeSelft() {
		return "\t\t\t周杰\n\t\t\t2010年6月1日";
	}
	public void print(){
		System.out.println(writeTitle()+WriteHello()+writeBody()+writeGreeting()+writeSelft());
	}
	
	public static void main(String[] args) {
		HomeLetterlm print=new HomeLetterlm();
		print.print();
	}
	
}
