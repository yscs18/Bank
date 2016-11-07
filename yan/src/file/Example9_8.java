package file;

import java.io.*;

public class Example9_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=-1;
		CharArrayWriter out = new CharArrayWriter();
		for(int i=20320;i<=20520;i++){
			out.write(i);
		}
		CharArrayReader in =new CharArrayReader(out.toCharArray());
		try {
			while((n=in.read())!=-1){
			if(n%2==0){
				System.out.println("");
			}
			System.out.println("Î»ÖÃ"+n+"×Ö·û"+(char)n);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
