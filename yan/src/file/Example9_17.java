package file;
import java.io.*;
import java.nio.channels.*;
import java.nio.*;

public class Example9_17 {
	   public static void main(String args[]){
		   int b;
		   byte tom[]=new byte[12];
		   try {
			RandomAccessFile input=new RandomAccessFile("Example9_1.java", "rw");
			FileChannel channel=input.getChannel();
			while((b=input.read(tom,0,10))!=-1){
				FileLock lock=channel.tryLock();
				String s=new String(tom, 0, b);
				System.out.println(s);
				try {
					Thread.sleep(1000);
					lock.release();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	   }

}
