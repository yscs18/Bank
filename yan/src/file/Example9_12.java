package file;
import java.io.*;

public class Example9_12 {
        public static void main(String args[]){
        	RandomAccessFile inAndOut=null;
        	int data[]={20,30,40,50,60};
        	try {
				inAndOut=new RandomAccessFile("a.dat", "rw");
			} catch (Exception e) {
				// TODO: handle exception
							
			}
        	try {
				for(int i=0;i<data.length;i++)
					inAndOut.writeInt(data[i]);
				for(long i=data.length-1;i>=0;i--){
					inAndOut.seek(i*4);
					System.out.println("   "+inAndOut.readInt());
				}
				inAndOut.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
        }
}
