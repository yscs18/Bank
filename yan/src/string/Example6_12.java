package string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example6_12 {
	public static void main(String args[]){
		String cost="�л��ѣ�176.89Ԫ����;�ѣ�187.98Ԫ������ѣ�928.66Ԫ";
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
		System.out.println("�ܵ�ͨѶ���ã�"+sum+"Ԫ");
	}

}
