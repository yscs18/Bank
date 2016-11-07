package string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cost="TV cost 877 dollar,Computer cost 2398";
		Scanner scan=new Scanner(cost);
		double sum=0;
		while(scan.hasNext()){
			try {
				double price=scan.nextDouble();
				sum=sum+price;
				System.out.println(price);
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
				String t=scan.next();
			}
		}
       System.out.println("总消费："+sum+"元");
	}

}
