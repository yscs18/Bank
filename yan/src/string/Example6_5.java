package string;

public class Example6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    byte d[]="YOUIHE������".getBytes();
    System.out.println("����d�ĳ�����(һ������ռ2�ֽ�)��  "+d.length);
    String s=new String(d,6,2);
    System.out.println(s);
	}

}
