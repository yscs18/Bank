package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Example9_5 {
	public static void main(String args[]){
		File readFile=new File("Student.txt"),
				writeFile=new File("hello.txt");
		try {
			FileReader inOne=new FileReader("Student.txt");
			BufferedReader inTwo=new BufferedReader(inOne);
			FileWriter outOne=new FileWriter("hello.txt");
			BufferedWriter outTwo=new BufferedWriter(outOne);
			String s=null;
			int i=0;
			while((s=inTwo.readLine())!=null){
				i++;
				outTwo.write(i+""+s);
				outTwo.newLine();
			}
			outTwo.flush();
			outTwo.close();
			outOne.close();
			inOne=new FileReader("hello.txt");
			inTwo=new BufferedReader(inOne);
			while((s=inTwo.readLine())!=null){
				System.out.println(s);
			}
			inOne.close();
			inTwo.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
