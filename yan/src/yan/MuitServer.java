package yan;
import java.io.*;
import java.net.*;
import java.util.*;

public class MuitServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server=null;
		ServerThread thread;
		Socket you=null;
		while(true){
			try {
				server = new ServerSocket(4331);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("正在监听");
			}
			try {
				you=server.accept();
				System.out.println("客户地址"+you.getInetAddress());
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("正在等待客户");
			}
			if(you!=null)
				new ServerThread(you).start();
			else
				continue;
		}

	}

}
class ServerThread extends Thread{
	Socket socket;
	DataInputStream in=null;
	DataOutputStream out=null;
	String s=null;
    ServerThread(Socket t) {
		// TODO Auto-generated constructor stub
    	socket=t;
    	try {
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
    public void run(){
    	while(true){
    		double a=0,b=0,c=0,root1=0,root2=0;
    		try {
				a=in.readDouble();
				b=in.readDouble();
				c=in.readDouble();
				double disk=b*b-4*a*c;
				root1=(-b+Math.sqrt(disk))/(2*a);
				root2=(-b-Math.sqrt(disk))/(2*a);
				out.writeDouble(root1);
				out.writeDouble(root2);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("客户离开");
			}
    	}
    }
}
