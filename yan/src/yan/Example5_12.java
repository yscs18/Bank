package yan;
interface showMessage{
	void showTradeMark();
}
class TV implements showMessage{
	public void showTradeMark(){
		System.out.println("我是电视机");
	}
}
class PC implements showMessage{
	public void showTradeMark(){
		System.out.println("我是电脑");
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
