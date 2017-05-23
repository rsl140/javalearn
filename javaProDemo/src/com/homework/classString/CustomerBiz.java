package com.homework.classString;
/**
 * @功能 类的有参 上机练习1,2
 * @作者 饶思羚
 * @时间 2017.5.19
 * @地址 机房
 * */
public class CustomerBiz {
	String[] name = new String[20];
	
	/*添加姓名*/
	public void addName(String vale){
		for(int i = 0;i<name.length;i++)
		{
			if(null == name[i]){
				name[i] = vale;
				break;
			}
			
		}
	}
	
	/*显示姓名*/
	public void showNames(){
		for(int i = 0;i < name.length;i++){
			if(null != name[i]){//不显示空数据
				System.out.print(name[i]+"\t");
			}
		}
	}
	
	public boolean search(String vale){
		boolean find = false;//是否找到
		for(int i = 0;i < name.length;i++){
			if(null != name[i]){
				if(name[i].equals(vale)){
					find = true;
					break;
				}
			}
		}
		return find;
	}
}
