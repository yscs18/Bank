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
		System.out.println("���ӵĸ۱ҵļ̳����ԣ���ǰ��ֵ�ǣ�"+son.moneyHK);
		System.out.println("���ӵ����������������ԣ���ǰ��ֵ�ǣ�"+son.moneyRMB);
		System.out.println("�����Ƕ��������Ĺ��ܣ�"+a+"-"+b+"����"+son.subs(a, b));
		System.out.println("�ӷ��Ƕ��ӵļ̳й��ܣ�"+a+"+"+b+"����"+son.add(a, b));
		System.out.println("���ӵĸ۱Һ�����Ҷ��Ǽ̳е����ԣ���ǰ��ֵ�ǣ�");
		System.out.println("�۱ң�"+sunzi.moneyHK+"����ң�"+sunzi.moneyRMB);
		System.out.println("�˷������������Ĺ��ܣ�"+a+"*"+b+"="+sunzi.mulit(a, b));
		System.out.println("�ӷ������Ӽ̳еĹ���"+a+"+"+b+"="+sunzi.add(a, b));
		System.out.println("���������Ӽ̳еĹ���"+a+"-"+b+"="+sunzi.subs(a, b));
	
	}

}
