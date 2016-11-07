package string;

public class Example6_1 {
	public static void main(String args[]){
		String s1,s2;
		s1=new String("we are students");
		s2=new String("We are students");
		System.out.print(s1.equals(s2)+" ");
		System.out.println(s1==s2);
		String s3,s4;
		s3="How are you";
		s4="How are you";
		System.out.print(s1.equals(s4)+" ");
		System.out.println(s3==s4);
		System.out.println(s1.contains(s3)+"");
		System.out.println(s2.contains("stu")+"");
	}

}
