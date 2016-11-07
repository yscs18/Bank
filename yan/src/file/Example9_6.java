package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputAnswer=new Scanner(System.in);
		int score=0;
		StringBuffer answer =new StringBuffer();
		String result="ABCD";
		try {
			FileReader inOne=new FileReader("hello.txt");
			BufferedReader inTwo=new BufferedReader(inOne);
			String s=null;
			while((s=inTwo.readLine())!=null){
				if(!s.startsWith("*")){
					System.out.println(s);
				}else{
					System.out.print("输入选择的答案（A,B,C,D):");
					String str=inputAnswer.nextLine();
					try{
						char c=str.charAt(0);
						answer.append(c);
					}catch(StringIndexOutOfBoundsException exp){
						answer.append("*");
					}
				}
			}
			inOne.close();
			inTwo.close();
		} catch (IOException exp) {
			// TODO: handle exception
			
			}
		for(int i=0;i<result.length();i++){
			if(result.charAt(i)==answer.charAt(i)||result.charAt(i)==answer.charAt(i)-32)
				score++;
		}
		System.out.println("最后得分"+score);
		}

	}

