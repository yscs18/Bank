package string;

public class Example6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,sum=0;
		for(int i=0;i<args.length;i++){
			sum=sum+Double.parseDouble(args[i]);			
}
		n=sum/args.length;
		System.out.println("ƽ������"+n);
		int number=8658;
		String binaryString=Long.toBinaryString(number);
		System.out.println(number+"�Ķ����Ʊ�ʾ"+binaryString);
		System.out.println(number+"�İ˽��Ʊ�ʾ"+Long.toOctalString(number));
		System.out.println(number+"��ʮ�����Ʊ�ʾ"+Long.toString(number , 16));
	}
 }
