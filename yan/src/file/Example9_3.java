package file;
import java.io.*;
public class Example9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("hello.txt");
		byte b[]="»¶Ó­ welcome".getBytes();
		try {
			FileOutputStream out=new FileOutputStream(file);
			out.write(b);
			out.close();
			FileInputStream in=new FileInputStream(file);
			int n=0;
			while((n=in.read(b,0,2))!=-1){
				String str=new String(b, 0, n);
				System.out.print(str);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
