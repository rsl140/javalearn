package homework;

public class schoolMain {

	public static void main(String[] args) {
		/*
		 * @功能：课堂作业
		 * @作者：饶思羚
		 * @时间：2017.5.17
		 * @地点：
		 */
		stu stuInfo = new stu();
		teacher teacherInfo = new teacher();
		System.out.println("学生信息");
		stuInfo.stuName = "张浩";
		stuInfo.stuAge = 20;
		stuInfo.stuClass = 33;
		stuInfo.stuHobby = "篮球";
		
		stuInfo.showStuInfo();
		System.out.println("===================");
		System.out.println("教师信息");
		teacherInfo.teacherName = "王老师";
		teacherInfo.teacherProfession = "计算机";
		teacherInfo.teacherClass = "使用JAVA语言控制程序逻辑";
		teacherInfo.teacherTeachYear = 5;
		
		teacherInfo.showTeacherInfo();
		
	}

}
