package yan;
interface showMessage{
	void showTradeMark();
}
class TV implements showMessage{
	public void showTradeMark(){
		System.out.println("���ǵ��ӻ�");
	}
}
class PC implements showMessage{
	public void showTradeMark(){
		System.out.println("���ǵ���");
	}
}
public class Example5_12 {
               public static void main(String args[]){
            	   showMessage sm;
            	   sm= new TV();
            	   sm.showTradeMark();
            	   sm=new PC();
            	   sm.showTradeMark();
               }
}
