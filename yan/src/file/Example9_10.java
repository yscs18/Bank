package file;
import  java.io.*;
public class Example9_10 {
	public static void main(String args[]){
		Goods TV1=new Goods("Haier TV",3468);
	    try {
			FileOutputStream fileOut=new FileOutputStream("a.txt");
			ObjectOutputStream objectOut=new  ObjectOutputStream(fileOut);
			objectOut.writeObject(TV1);
			FileInputStream fileIn=new FileInputStream("a.txt");
			ObjectInputStream objectIn=new ObjectInputStream(fileIn);
			Goods TV2=(Goods)objectIn.readObject();
			TV2.setName("GreatWall");
			TV2.setUnitPrice(8888);
			System.out.println("TV1     "  +TV1.getName()+"  "+TV1.getUnitPrice());
			System.out.println("TV2     "  +TV2.getName()+"  "+TV2.getUnitPrice());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
class Goods  implements Serializable{
	String name=null;
	double unitPrice;
	Goods(String name,double unitPrice){
		this.name=name;
		this.unitPrice=unitPrice;
	}
	public  void setUnitPrice(double unitPrice){
		this.unitPrice=unitPrice;
	}
	public void setName(String name){
		this.name=name;
		
	}
	public String getName(){
		return name;
	}
	public double getUnitPrice(){
		return unitPrice;
	}
}
