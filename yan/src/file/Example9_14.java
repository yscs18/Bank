package file;
import java.io.*;
public class Example9_14 {
	public static void main(String args[]){
		RandomAccessFile in=null;
		try {
			in=new RandomAccessFile("Example9_13.java", "rw");
			long length=in.length();
			long poition=0;
			in.seek(poition);
			while(poition<length){
				String str=in.readLine();
				byte b[]=str.getBytes("iso-8859-1");
				str=new String(b);
				poition=in.getFilePointer();
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
