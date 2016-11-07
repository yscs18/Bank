package Interface;
class Chorus<E,F>{
	void makeChorus(E person,F yueqi){
		person.toString1();
		yueqi.toString1();
	}
}
class ����{
	public String toString1(){
		System.out.println("��һ������������");
		return "";
	}
}
class ����{
	public String toString(){
		System.out.println("|3 35 6116 |5 56 5-|");
		return "";
	}
}
public class Example5_20 {
     public static void main(String args[]){
    	 Chorus<����,����>model=new Chorus<����,����>();
    	 ���� pengliyuan =new ����();
    	 ���� piano=new ����();
    	 model.makeChorus(pengliyuan,piano);
     }
}

