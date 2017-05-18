package Demo;
/*
 * @功能：狮子
 * @作者：饶思羚
 * @时间：2017.5.8
 * @地点：家
 */
public class AutoLion {
	String color = "黄色";
	
	public void run(){
		System.out.println("每秒0.1米的速度前进");
	}
	
	public String bark(){
		String sound = "大声的吼叫";
		return sound;
	}
	
	//获得颜色
	public String getColor(){
		return color;
	}
	
	/*显示狮子特性*/
	public String showLion(){
		return "这是一个" + getColor() + "的玩具狮子。";
	}
}
