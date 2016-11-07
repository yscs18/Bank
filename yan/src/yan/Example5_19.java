package yan;
class MyException extends Exception{
	String message;
	MyException(int n){
		message=n+"不是正数";
	}
	public String getMessage(){
		return message;
	}
}
class AA{
	public void f(int n)throws MyException{
		if(n<0){
			MyException ex=new MyException(n);
			throw(ex);
		}
		double number=Math.sqrt(n);
		System.out.println(n+"的平方根："+number);
	}
}

public class Example5_19 {
  public  static void main(String args[]){
	  AA a=new AA();
	  try{
		  a.f(28);
		  a.f(-8);
	  }
	  catch(MyException e){
		  System.out.println(e.message);
	  }
  }
}
