package com.homework.zonghe;

public class ssanjianZuoYe26 {
	private String face;
	private String suit;
	public ssanjianZuoYe26(String face,String suit){
		this.face=face;
		this.suit=suit;
	}
	protected String getFace(){
		return this.face;
	}
	protected String getSuit(){
		return this.suit;
	}
	public String toString(){
		return this.face+this.suit;
	}
}
