package yan;
class Father{
	private int moneyDollar=300;
	int moneyHK=200;
	int add(int x,int y){
		return x+y;
	}
}
class  Son extends Father{
	int moneyRMB=800;
	public void changMoneyHK(int x){
		moneyHK=x;
	}
	public void changeMoneyRMB(int x){
		moneyRMB=x;
	}
	int subs(int x,int y){
		return x*y;
	}
}
class GrandSon extends Son{
	int mulit(int x,int  y){
		return x*y;
	}
}
public class Example4_18 {
	public  static void main(String args[]){
		int a=5,b=3;
		Son son=new Son();
		GrandSon sunzi=new GrandSon();
		son.changMoneyHK(6666);
		son.changeMoneyRMB(80000);
		System.out.println("儿子的港币的继承属性，当前的值是："+son.moneyHK);
		System.out.println("儿子的人名币是新增属性，当前的值是："+son.moneyRMB);
		System.out.println("减法是儿子新增的功能，"+a+"-"+b+"等于"+son.subs(a, b));
		System.out.println("加法是儿子的继承功能，"+a+"+"+b+"等于"+son.add(a, b));
		System.out.println("孙子的港币和人民币都是继承的属性，当前的值是：");
		System.out.println("港币："+sunzi.moneyHK+"人民币："+sunzi.moneyRMB);
		System.out.println("乘法是孙子新增的功能，"+a+"*"+b+"="+sunzi.mulit(a, b));
		System.out.println("加法是孙子继承的功能"+a+"+"+b+"="+sunzi.add(a, b));
		System.out.println("减法是孙子继承的功能"+a+"-"+b+"="+sunzi.subs(a, b));
	
	}

}
