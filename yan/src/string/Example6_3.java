package string;

import java.util.Date;

public class Example6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date date=new Date();
       Student stu=new Student("wangyixiang", 100);
       TV tv=new TV("µçÊÓ»ú", 8776);
       System.out.println(date.toString());
       System.out.println(stu.toString());
       System.out.println(tv.toString());
	}
}
class Student{
	String name;
	double score;
	Student(String name,double score){
		this.name=name;
		this.score=score;
	}
	public String toString(){
		return "name   £º"+name+",  grades£º "+score;
	}
}
class TV{
	String name;
	double price;
	TV(String name,double price){
		this.name=name;
		this.price=price;
	}
}