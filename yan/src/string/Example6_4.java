package string;

import java.util.Scanner;

public class Example6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader=new Scanner(System.in);
        String s=reader.nextLine();
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
        	a[i]=(char)(a[i]^'w');
        }
        String code =new String(a);
        System.out.println("Ô­ÎÄ£º"+code);
	}

}
