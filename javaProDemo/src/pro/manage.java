package pro;

import java.util.Scanner;

public class manage {

	/**
	 * 会员管理系统
	 * 日期:2017.5.10
	 * 作者：饶思羚
	 * 会员名，会员年龄，电话
	 * */
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Boolean flag = false;//定义是否继续循环
		String[] vipName = new String[3];
		String[] vipAge = new String[3];
		String[] vipPhone = new String[3];
		
		//初始化数据内容
		vipName[0] = "张三";
		vipAge[0] = "20";
		vipPhone[0] = "11111111111";
		
		vipName[1] = "李四";
		vipAge[1] = "28";
		vipPhone[1] = "22222222222";
		
		do{
			Mnue();
			int choose = input.nextInt();
			switch(choose){
			case 1:
				selects(vipName,vipAge,vipPhone);
				flag = returns();
				break;
			case 2:
				change(vipName,vipAge,vipPhone);
				flag = returns();
				break;
				default:
					System.exit(0);
			}
		}while(flag);
	}
	//首页
	private static void Mnue(){
		System.out.println("***********************");
		System.out.println("\n\t1.查找");
		System.out.println("\t2.修改");
		System.out.println("\t3.删除");
		System.out.println("\t4.新增");
		System.out.println("\t5.列表\n");
		System.out.println("***********************");
		System.out.println("请选择：");
	}
	//是否返回上级菜单
	private static Boolean returns(){
		System.out.println("返回上级菜单请按：0");
		int returnChoose = input.nextInt();
		if(returnChoose==0){
			return true;
		}else{
			return false;
		}
	}
	//查找
	public static void selects(String[] vipName,String[] vipAge,String[] vipPhone){
		System.out.println("输入姓名查找：");
		String name = input.next();
		int index = forEarchArrayReturnIndex(vipName,name);//是否能查找到
		if(index != -1){
			System.out.println("会员名："+vipName[index]);
			System.out.println("年龄："+vipAge[index]);
			System.out.println("电话："+vipPhone[index]);
		}else{
			System.out.println("查无此人！");
		}
		System.out.println();
		
	}
	//修改
	public static void change(String[] vipName,String[] vipAge,String[] vipPhone){
		Boolean changeflag = false;
		do{
			System.out.println("***********************");
			System.out.println("\n\t1.姓名");
			System.out.println("\t2.年龄");
			System.out.println("\t3.电话\n");
			System.out.println("***********************");
			int changepro = input.nextInt();
			switch(changepro){
			case 1:
				changeContent(vipName);
				changeflag=false;
				break;
			case 2:
				changeContent(vipAge);
				changeflag=false;
				break;
			case 3:
				changeContent(vipPhone);
				changeflag=false;
				break;
			default:
				System.out.println("输入有效数字");
				changeflag=true;
				break;
			}
		}while(changeflag);
		
	}
	
	//删除
	public static void delect(){
		
	}
	//增加
	public static void add(){
		
	}
	//返回列表
	public static void list(){
		
	}
	
	//根据修改不同的数组更改数组内容
	public static void changeContent(String[] array){
		System.out.println("请输入要修改的内容");
		String vale = input.next();
		int index = forEarchArrayReturnIndex(array,vale);
		if(index != -1){
			System.out.println("请输入需要修改为的内容");
			String changevale = input.next();
			array[index] = changevale;
		}else{
			System.out.println("找不到需要修改的内容");
		}
	}
	
	//根据输入的内容在数组中查找相同的值返回下标
	public static int forEarchArrayReturnIndex(String[] array,String vale){
		int index = -1;
		for(int i = 0;i<array.length-1;i++){
			if(array[i].equals(vale)){
				index = i;
				break;
			}
		}
		return index;
	}
	

}
