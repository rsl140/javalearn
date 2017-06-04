package pro;

import java.text.SimpleDateFormat;
import java.util.Date;
//CRM 客户关系管理系统
/**
 * 会员模型
 * */
public class Member implements Comparable{
 private String id;  //会员编号，唯一
 private String name; //会员名字
 private int point;   //积分
 private String gender; //性别
 private Date birthDay; //生日
 private String phoneNumber; //电话号码
 private String address;	//地址
 private String job;        //职业

 
 
 public Member(){}
 
 public Member(String id,String name){
	 this.id=id;
	 this.name=name;
	 this.point=0;
 }
 
 
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPoint() {
	return point;
}
public void setPoint(int point) {
	this.point = point;
}
public String getGender() {
	if(null==gender||"".equals(gender)){
		return "保密";
	}
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getBirthDay() {
	return birthDay;
}

public String getDateStr(){
	String dateStr=null;
	if(null!=this.birthDay){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		dateStr=sdf.format(birthDay);
	}else{
		return "保密";
	}
	return dateStr;
}

public void setBirthDay(Date birthDay) {
	this.birthDay = birthDay;
}
public String getPhoneNumber() {
	if(null==phoneNumber||"".equals(phoneNumber)){
		return "保密";
	}
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAddress() {
	if(null==address||"".equals(address)){
		return "保密";
	}
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getJob() {
	if(null==job||"".equals(job)){
		return "保密";
	}
	return job;
}
public void setJob(String job) {
	this.job = job;
}

@Override
//排序
public int compareTo(Object o) {
	if(this.id.compareTo(((Member)o).getId())>0){
		return 1;
	}else if(this.id.compareTo(((Member)o).getId())<0){
		return -1;
	}else{
		return this.name.compareTo(((Member)o).getName());
	}
}
 
 
 
 
}
