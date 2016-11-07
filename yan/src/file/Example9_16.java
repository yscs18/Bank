package file;

import java.io.*;
import java.util.Scanner;

public class Example9_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("Student.txt");
		TestWord test=new TestWord();
		test.setFile(file);
		test.setStopTime(5);
		test.startTest();

	}

}
class TestWord{
	File file;
	int stopTime;
	public void setFile(File f){
		file = f;
		
	}
	public void setStopTime(int t){
		stopTime=t;
	}
	public void startTest(){
		Scanner sc=null;
		Scanner read=new Scanner(System.in);
		int isRightNumber=0,wordNumber=0;
		try{
			sc=new Scanner(file);
			while(sc.hasNext()){
			wordNumber++;
			String word=sc.next();
			System.out.println("这个"+stopTime+"用于背单词"+word);
			Thread.sleep(stopTime*1000);
			System.out.print("\r");
			for(int i=1;i<=50;i++){
				System.out.print("*");
			}
			System.out.println("输入曾经显示的单词：");
			String  input=read.nextLine();
			if(input==null){
				input="******";
				
			}
			if(input.equals(word)){
			     isRightNumber++;
			     
			}
			System.out.println("当前正确率"+(float)isRightNumber/wordNumber+"%");
			}
			System.out.println("正确率"+(float)isRightNumber/wordNumber+"%");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
