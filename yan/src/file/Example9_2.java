package file;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Example9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Runtime ce=Runtime.getRuntime();
			ce.exec("javac Example9_1.java");
			File file=new File("C:\\Windows","Notepad.exe");
			ce.exec(file.getAbsolutePath());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
