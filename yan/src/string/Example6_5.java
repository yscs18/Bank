package string;

public class Example6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    byte d[]="YOUIHE你我他".getBytes();
    System.out.println("数组d的长度是(一个汉字占2字节)：  "+d.length);
    String s=new String(d,6,2);
    System.out.println(s);
	}

}
