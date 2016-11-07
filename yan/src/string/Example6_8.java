package string;

import java.util.Scanner;

public class Example6_8 {
	public static void main(String args[]){
		String regex="[a-zZ-Z]+";
	    Scanner scanner= new Scanner(System.in);
	    System.out.println("请输入一行文本（输入#号结束程序）");
	    String str=scanner.nextLine();
	    while(str!=null){
	    	if(str.matches(regex))
	    		System.out.println(str+"中的字符都是英文字母");
	    	else
	    		System.out.println(str+"中含有非英文字母");
	    	System.out.println("输入一行文本(输入#结束程序)");
	    	str=scanner.nextLine();
	    	if(str.startsWith("#"))
	    		System.exit(0);
	    }
	}

}
