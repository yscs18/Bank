package string;

public class Example6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="���¼��http://www.cctv.cn������";
		String regex="(http://www)[.]?\\w+[.]{1}\\p{Alpha}+";
		String str1=str.replaceAll(regex, "");
		System.out.println(str1);

	}

}
