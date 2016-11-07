package yan;
abstract class Student{
	abstract void  speak();
}
class Teacher{
	void look(Student stu){
		stu.speak();
	}
}

public class Example5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Teacher zhang = new Teacher();
        zhang.look(new Student(){
        	void speak(){
        		System.out.println("这是匿名类中的方法");
        	}
        }
        );
	}

}
