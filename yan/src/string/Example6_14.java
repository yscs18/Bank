package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p;
		Matcher m;
		String regex="(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
		p=Pattern.compile(regex);
		String s="新浪:www.sina.cn,   央视:http://www.cctv.com";
		m=p.matcher(s);
		while(m.find()){
			String str=m.group();
			System.out.println(str);
		}
		System.out.println("剔除网站地址后：");
		String result=m.replaceAll("");
		System.out.println(result);
	}
}
