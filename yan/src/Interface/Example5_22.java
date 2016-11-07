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
class 乐器1{
	public String toString(){
		System.out.println("|5 6 3-|5  17  56|");
		return "";
	}
}
class 歌手1{
	public String toString(){
		System.out.println("美丽的草原是我的家");
		return "";
	}
}
public class Example5_22 {
	public static void main(String args[]){
		Chorus1<歌手1,乐器1>model =new Chorus1<歌手1, 乐器1>();
		歌手1 pengliyuan = new 歌手1();
		乐器1 piano = new 乐器1();
		model.makeChorus(pengliyuan ,piano);
	}

}
