package string;

import java.util.Scanner;

public class Example6_8 {
	public static void main(String args[]){
		String regex="[a-zZ-Z]+";
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("������һ���ı�������#�Ž�������");
	    String str=scanner.nextLine();
	    while(str!=null){
	    	if(str.matches(regex))
	    		System.out.println(str+"�е��ַ�����Ӣ����ĸ");
	    	else
	    		System.out.println(str+"�к��з�Ӣ����ĸ");
	    	System.out.println("����һ���ı�(����#��������)");
	    	str=scanner.nextLine();
	    	if(str.startsWith("#"))
	    		System.exit(0);
	    }
	}

}
