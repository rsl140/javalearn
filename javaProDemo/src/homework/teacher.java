package homework;

public class teacher {
	/*
	 * @功能：课堂作业
	 * @作者：饶思羚
	 * @时间：2017.5.17
	 * @地点：
	 */
	String teacherName;
	String teacherProfession;
	String teacherClass;
	int teacherTeachYear;
	
	/**
	 * 输出教师信息
	 * */
	public void showTeacherInfo(){
		System.out.println("姓名：" + teacherName);
		System.out.println("专业方向：" + teacherProfession);
		System.out.println("教授课程：" + teacherClass);
		System.out.println("教龄：" + teacherTeachYear);
	}
}
