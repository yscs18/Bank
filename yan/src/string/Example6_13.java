package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example6_13 {
	public static void main(String args[]){
		Pattern p;
		Matcher m;
		String input="Have 7 monkeys on the tree,walk 2 monkeys,still leave how many monkeys?";
		p=Pattern.compile("monkey");
		m=p.matcher(input);
		while(m.find()){
			String str=m.group();
			System.out.println("¥”"+m.start()+"÷¡"+m.end()+" «"+str);
		}
		
	}

}
