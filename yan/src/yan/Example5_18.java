package yan;

public class Example5_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,m=0,t=0;
		try {
			t=999;
			m=Integer.parseInt("8000");
			n=Integer.parseInt("12s3a");
			System.out.println("��û�л������");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����쳣");
			n=123;
		}
      System.out.println("n="+n+",m="+m+",t="+t);
	}

}
