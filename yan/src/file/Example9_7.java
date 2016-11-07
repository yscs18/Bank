package file;
import java.io.*;

public class Example9_7 {
      public static void main(String args[]){
    	  int n=-1;
    	  ByteArrayOutputStream out=new ByteArrayOutputStream();
    	  for(int i=1;i<=127;i++){
    		  out.write(i);
    	  }
    	  ByteArrayInputStream in=new ByteArrayInputStream(out.toByteArray());
    	  while((n=in.read())!=-1){
    		  if(n%2==0){
    			  System.out.println("");
    		  }
    		  System.out.print("×Ö½Ú"+n+"¶ÔÓ¦×Ö·û"+(char)n);
    	  }
      }
}
