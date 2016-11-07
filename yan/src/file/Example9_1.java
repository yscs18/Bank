package file;

import java.io.*;

class FileAccept implements FilenameFilter{
	String str=null;
	FileAccept(String s){
		str="."+s;
	}
	public boolean accept(File dir,String name){
		return name.endsWith(str);
	}
}

public class Example9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("F:/ch");
		FileAccept acceptCondition =new FileAccept("txt");
		File fileName[]=dir.listFiles(acceptCondition);
		for(int i=0;i<fileName.length;i++){
			System.out.println("文件名称"+fileName[i].getName()+"长度"+fileName[i].length());
		}
		boolean boo=false;
		if(fileName.length>0){
			boo=fileName[0].delete();
			if(boo)
				System.out.println("文件"+fileName[0].getName()+"被删除");
		}
	}
}
