package com.homework.zonghe;

public class changFangTi2ZuoYe8 extends changFangTiZuoYe8{
	private int gao;
	
	public changFangTi2ZuoYe8() {
		super();
	}
	public changFangTi2ZuoYe8(int chang, int kuan) {
		super(chang, kuan);
	}
	public void tiji(){
		gao = this.getChang()*this.getKuan();
	}
	public int getGao() {
		return gao;
	}
	public void setGao(int gao) {
		this.gao = gao;
	}
	
	
}
