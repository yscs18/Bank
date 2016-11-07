package file;
import java.io.*;

public class Example9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("hello1.txt");
		char b[]="欢迎 welcome ".toCharArray();
		try {
			FileWriter out =new FileWriter(file,true);
			out.write(b);
			out.write("来到北京！");
			out.close();
			FileReader in =new FileReader(file);
			int n=0;
			while((n=in.read(b, 0, 2))!=-1){
				String str = new String(b,0,n);
				System.out.print(str);
			}
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
