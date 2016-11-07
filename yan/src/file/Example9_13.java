package file;
import java.io.*;
import java.util.*;
public class Example9_13 {
	public static void main(String args[]){
		File file=new File("cost.txt");
		Scanner sc=null;
		int sum=0;
		try {
			sc=new Scanner(file);
			while(sc.hasNext()){
				try {
					int price =sc.nextInt();
					sum=sum+price;
					System.out.println(price);
				} catch (InputMismatchException exp) {
					// TODO: handle exception
					String t=sc.next();
				}
			}
			System.out.println("Total Cost"+sum+"dollar");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
