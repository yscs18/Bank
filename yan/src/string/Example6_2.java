package string;

public class Example6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,sum=0;
		for(int i=0;i<args.length;i++){
			sum=sum+Double.parseDouble(args[i]);			
}
		n=sum/args.length;
		System.out.println("平均数："+n);
		int number=8658;
		String binaryString=Long.toBinaryString(number);
		System.out.println(number+"的二进制表示"+binaryString);
		System.out.println(number+"的八进制表示"+Long.toOctalString(number));
		System.out.println(number+"的十六进制表示"+Long.toString(number , 16));
	}
 }
