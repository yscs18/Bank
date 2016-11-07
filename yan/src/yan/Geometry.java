package yan;
public class Geometry {
       private Rectangle rect;
       private Circle circle;
       Geometry(Rectangle rect,Circle circle){
    	   this.rect=rect;
    	   this.circle=circle;
       }
       public void setCirclePosition(double x,double y){
    	   circle.setX(x);
    	   circle.setY(y);
       }
       public void setCircleRadius(double radius){
    	   circle.setRadius(radius);
       }
       public void setRectanglePosition(double x,double y){
    	   rect.setX(x);
    	   rect.setY(y);
       }
       public void setRectangleWidthandHeight(double w,double h){
    	   rect.setHeight(h);
    	   rect.setWidth(w);
       }
       public void showState(){
    	   double circleX=circle.getX();
    	   double rectX=circle.getX();
    	   if(rectX-circleX==circle.getRadius()*2){
    		   System.out.println("ͼ���еľ�����Բ���Ҳ�");
    	   }
    	   if(circleX-rectX==rect.getWidth()){
    		   System.out.println("ͼ���еľ�����Բ�����");
    	   }
       }
}
