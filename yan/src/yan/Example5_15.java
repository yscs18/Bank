package yan;
class NorthEast{
	String land="������";
}
class China{
	int x=10,y=10;
	LiaoNing dalian;
	China(){
		dalian=new LiaoNing();
	}
	void f(){
		System.out.println("�����й�");
		dalian.speak();
	}
	class LiaoNing extends NorthEast{
		int z;
		void speak(){
			System.out.println("���Ǵ�����z="+z+";"+land);
		}
		void g()
		{
			z=x+y;
			f();
		}
	}
}

public class Example5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		China china=new China();
		china.f();
		china.dalian.g();

	}

}
