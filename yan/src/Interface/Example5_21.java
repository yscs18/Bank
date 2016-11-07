package Interface;
class ×¶<E>{
	double height;
	E bottom;
	public ×¶(E b){
		bottom=b;
	}
   public void computerVolume(){
	   String s=bottom.toString();
	   double area=Double.parseDouble(s);
	   System.out.println("Ìå»ýÊÇ£º"+1.0/3.0*area*height);
   }
}
class Circle{
	double area,radius;
	Circle(double r){
		radius =r;
		
	}
	public String toString(){
		area=radius*radius*Math.PI;
		return ""+area;
	}
}
class Rectangle{
	double sideA,sideB,area;
	Rectangle(double a,double b){
		sideA=a;
		sideB=b;
	}
	public String toString(){
		area=sideA*sideB;
		return ""+area;
	}
}
public class Example5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Circle circle=new Circle(10);
      ×¶<Circle>coneOne=new ×¶<Circle>(circle);
      coneOne.height=30;
      coneOne.computerVolume();
      Rectangle rect=new Rectangle(10,20);
      ×¶<Rectangle> coneTwo=new ×¶<Rectangle>(rect);
      coneTwo.height=10;
      coneTwo.computerVolume();
	}

}
