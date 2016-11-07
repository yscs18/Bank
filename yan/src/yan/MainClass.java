package yan;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1=new Rectangle(),rect2=new Rectangle();
		Circle circle1 =new Circle(),circle2=new Circle();
		Geometry geometryone,geometrytwo;
		geometryone=new Geometry(rect1, circle1);
		geometryone.setCirclePosition(150, 30);
		geometryone.setRectangleWidthandHeight(120,80);
		geometryone.setRectanglePosition(30, 40);
		geometryone.setCircleRadius(60);
		geometrytwo=new Geometry(rect2, circle2);
		geometrytwo.setCirclePosition(40,30);
		geometrytwo.setRectangleWidthandHeight(120,80);
		geometrytwo.setRectanglePosition(160, 160);
		geometrytwo.setCircleRadius(60);
		geometryone.showState();
		geometrytwo.showState();
	}
}
