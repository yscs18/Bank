package Interface;
interface Computer<E,F>{
	void makeChorus(E x,F y);
}
class Chorus1<E,F>implements Computer<E,F>{
	public void makeChorus(E x,F y){
		x.toString();
		y.toString();
	}
}
class ����1{
	public String toString(){
		System.out.println("|5 6 3-|5  17  56|");
		return "";
	}
}
class ����1{
	public String toString(){
		System.out.println("�����Ĳ�ԭ���ҵļ�");
		return "";
	}
}
public class Example5_22 {
	public static void main(String args[]){
		Chorus1<����1,����1>model =new Chorus1<����1, ����1>();
		����1 pengliyuan = new ����1();
		����1 piano = new ����1();
		model.makeChorus(pengliyuan ,piano);
	}

}
