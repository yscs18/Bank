package yan;
class A{
	protected double x=8.0,y=0.88888;
	public void speak(){
		System.out.println("Œ“œ≤ª∂NBA");
	}
	public void cry(){
		y=x+y;
		System.out.println("y="+y);
	}
}
class X extends A{
	int y=100,z;
	public  void speak(){
		z=2*y;
		System.out.println("I LOVE This Game");
		System.out.println("y="+y+"      z="+z);
	}
}
public class Example5_4 {
     public static void main(String[] args){
    	 X b=new X();
    	 b.cry();
    	 b.speak();
     }
}
