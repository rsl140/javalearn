package Demo;
/**
 * @功能 检查文件格式
 * @作者 饶思羚
 * @时间 2017.5.23
 * @地址 机房
 * */
public class StringForJava {

	public static void main(String[] args) {
		String fileName = "djkl.java";
		int index = fileName.lastIndexOf(".");
		if(index != -1 && index != 0 && fileName.substring(index+1).equals("java")){
			System.out.println("有效文件名！");
		}else{
			System.out.println("文件名无效！");
		}

	}

}
