package pro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 会员维护
 * */
public class MemberMaintain {
	MemberBusiness memberBiz;
	Scanner input =new Scanner(System.in);
	public MemberMaintain(){
		init();
	}
	
	/**
	 * 初始化
	 * */
	public void init(){
		 //������
		memberBiz=new MemberBusinessImpl();
		System.out.println("-------欢迎进入CRM--------");
		mainMenu();
		
	}
	
	/**
	 * 主菜单
	 * */
	public void mainMenu(){
		System.out.println("1.新增会员\n2.修改会员\n3.查询会员\n4.删除会员\n 0.退出");
		System.out.println("请选择：");
		int choose1=input.nextInt(); 
		switch(choose1){
		case 1:
			addMenu();
			break;
		case 3:
			queryMenu();
			break;
		}
	}
	
	/**
	 * 新增界面
	 * */
	public void addMenu(){
		System.out.println("请输入客户信息（格式如下）");
		System.out.println("姓名,性别,生日<年/月/日>,手机号,地址ַ,ְ职业");
		String memberInfo=input.next();
		String infos[]=memberInfo.split(",");
		Member member=new Member();
		member.setId(memberBiz.findMaxId());
		member.setName(infos[0]);
		if(!"".equals(infos[1])){ //性别不为空
			member.setGender(infos[1]);
		}
		if(!"".equals(infos[2])){  //生日不为空
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
			try {
				Date birthDay=sdf.parse(infos[2]);
				member.setBirthDay(birthDay);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if(!"".equals(infos[3])){ //手机号不为空
			member.setPhoneNumber(infos[3]);
		}
		if(!"".equals(infos[4])){ //地址不为空
			member.setAddress(infos[4]);
		}
		
		if(!"".equals(infos[5])){ //职业不为空
			member.setJob(infos[5]);
		}
		
		memberBiz.addMember(member);
		System.out.println("新增成功！");
		queryMenu();
		
	}
	
	public void queryMenu(){
		memberBiz.queryAllMember();
		this.mainMenu();
	}
	public static void main(String[] args) {
		MemberMaintain mm=new MemberMaintain();
		//mm.init();
	}
}
	
	
