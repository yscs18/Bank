package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Pattern p;
         Matcher m;
         String s1="loveyouhatemelove123jkjhate999love888";
         p=Pattern.compile("love\\w{3}|hate\\w{2}");
         m=p.matcher(s1);
         while(m.find()){
        	 String str=m.group();
        	 System.out.println("��"+m.start()+"��"+m.end()+"ƥ��ģʽ������");
        	 System.out.println(str);
         }
	}
}
