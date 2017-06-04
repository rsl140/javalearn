package com.homework.zonghe;

public class busZuoYe19 {
	int speed;
	int number;
	
	public busZuoYe19() {
		super();
	}

	public void addSpeed(){
		System.out.println("加速");
	}
	public void jianSu(){
		System.out.println("减速");
	}
	//上人
	public void shangRen(int num){
		System.out.println("上了"+num+"个人");
		this.number+=num;
	}
	//下人
	public void xiaRen(int num){
		System.out.println("下了"+num+"个人");
		this.number-=num;
	}
	public void star(){
		System.out.println("开车");
	}
	public void stop(){
		System.out.println("停车");
	}
	
	public static void main(String[] args) {
		busZuoYe19 test = new busZuoYe19();
		System.out.println("车上有35人");
		test.number = 35;
		test.star();
		test.stop();
		test.xiaRen(13);
		test.shangRen(25);
		test.star();
		test.stop();
		System.out.println("车上还有："+test.number+"人");
	}
}
