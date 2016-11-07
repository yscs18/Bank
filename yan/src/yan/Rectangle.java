package yan;

public class Rectangle {
	private double x,y,width,height;
	public void setX(double x){
		this.x=x;
	}
	public double  getX(double x){
		return x;
	}
	public void setY(double x){
		this.y=y;
	}
	public double getY(double y){
		return y;
	}
	public void setWidth(double width){
		if(width<=0){
			width=0;
		}
		else
			this.width=width;
	}
	public double getWidth(){
		return width;
	}
	public void setHeight(double height){
		if(height<=0)
			height=0;
		else this.height=height;
	}
    public double getHeight(){
    	return height;
    }
}
