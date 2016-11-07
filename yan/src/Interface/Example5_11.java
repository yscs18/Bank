package Interface;
interface Computable{
	final int Max=100;
	int f(int x);
	public abstract int g(int x,int y); 
}
class A implements Computable{
	public int f(int x){
		return x*x;
	}
	public int g(int x,int y){
		return x+y;
	}
}
class B implements Computable{
	public int f(int x){
		return x*x*x;
	}
	public int g(int x,int y){
		return x*y;
	}
}
public class Example5_11 {
	public static void main(String args[]){
		A a= new  A();
		B b= new B();
		System.out.println(a.Max);
		System.out.println(""+a.f(10)+"  "+a.g(12,6));
		System.out.println(b.Max);
		System.out.println(""+b.f(10)+" "+b.g(29, 2));
	}
}
