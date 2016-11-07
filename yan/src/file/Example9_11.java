package file;
import java.io.*;
class Good implements Serializable{
	String name=null;
	Good(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class shop implements Serializable{
	Good goods[];
	public void setGood(Good s[]){
		goods=s;
	}
	public Good[] getGood(){
		return goods;
	}
	
}
public class Example9_11 {
	public static void main(String args[]){
		shop shop1=new shop();
		Good s1[]={new Good("TV"),new Good("PC")};
		shop1.setGood(s1);
		try {
			ByteArrayOutputStream out =new ByteArrayOutputStream();
			ObjectOutputStream objectOut=new ObjectOutputStream(out);
			objectOut.writeObject(shop1);
			ByteArrayInputStream in  = new ByteArrayInputStream(out.toByteArray());
			ObjectInputStream objectIn = new ObjectInputStream(in);
			shop shop2=(shop)objectIn.readObject();
			Good good1[]=shop1.getGood();
			Good good2[]=shop2.getGood();
			System.out.println("shop1中的商品：");
			for(int i=0;i<good1.length;i++){
				System.out.println(good1[i].getName());
			}
			System.out.println("shop2是shop1的一个克隆，shop2中的商品");
			for(int i=0;i<good2.length;i++){
				System.out.println(good2[i].getName());
			}
			Good s2[]={new Good("棉花"),new Good("西服"),new Good("篮球")};
		    shop2.setGood(s2);
		    good1=shop1.getGood();
		    good2=shop2.getGood();
		    System.out.println("目前，shop2中的商品：");
		    for(int i=0;i<good2.length;i++){
				System.out.println(good2[i].getName());
			}
		    System.out.println("目前， shop1中的商品：");
		    for(int i=0;i<good1.length;i++){
				System.out.println(good1[i].getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	

}
