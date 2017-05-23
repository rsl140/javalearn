package Demo;
/**
 * 学生管理系统
 * */
public class StudentMgr {
	Student[] student = new Student[30];//存放学生内容
	//增加
	public void addStudent(Student stu){
		for (int i = 0; i < student.length; i++) {
			if(null == student[i]){
				student[i]=stu;
				break;
			}
		}
	}
	
	public void editStudent(Student stu){
		
	}
	
	public void deliteStudent(Student stu){
	
	}
	
	public void queryStudent(){
		System.out.println("姓名\t性别\t年龄\t爱好\t学号\t身份证");
		for(Student stu:student){
			System.out.println(stu.name + "\t" + stu.sex + "\t" + stu.age + "\t" + stu.hobby + "\t" + stu.num + "\t" + stu.idCard);
		}
	}
	
}
