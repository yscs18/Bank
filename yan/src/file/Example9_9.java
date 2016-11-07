package file;

import java.io.*;

public class Example9_9 {
	public static void main(String args[]){
		try {
			FileOutputStream fos=new FileOutputStream("jerry.dat");
			DataOutputStream out_data=new DataOutputStream(fos);
			out_data.writeInt(100);
			out_data.writeInt(10012);
			out_data.writeLong(123456);
			out_data.writeFloat(3.1415926f);
			out_data.writeFloat(2.789f);
			out_data.writeDouble(987654321.1234);
			out_data.writeBoolean(true);
			out_data.writeBoolean(false);
			out_data.writeChars("I am ok");
		} catch (IOException e) {
			// TODO: handle exception
		}
		try{
			FileInputStream fis=new FileInputStream("jerry.dat");
			DataInputStream in_data=new DataInputStream(fis);
			System.out.println(":"+in_data.readInt());
			System.out.println(":"+in_data.readInt());
			System.out.println(":"+in_data.readLong());
			System.out.println(":"+in_data.readFloat());
			System.out.println(":"+in_data.readFloat());
			System.out.println(":"+in_data.readDouble());
			System.out.println(":"+in_data.readBoolean());
			System.out.println(":"+in_data.readBoolean());
			char c;
			while((c=in_data.readChar())!='\0')
				System.out.print(c);
		}catch(IOException e){
			
		}
		}

}
