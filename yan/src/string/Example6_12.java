package string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example6_12 {
	public static void main(String args[]){
		String cost="市话费：176.89元，长途费：187.98元，网络费：928.66元";
		Scanner scanner =new Scanner(cost);
		scanner.useDelimiter("[^0123456789.]+");
		double sum=0;
		while(scanner.hasNext()){
			try {
				double price=scanner.nextDouble();
				sum=sum+price;
				System.out.println(price);

			} catch (InputMismatchException e) {
				// TODO: handle exception
				String str=scanner.next();
			}
		}
		System.out.println("总的通讯费用："+sum+"元");
	}

}
