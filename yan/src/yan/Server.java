package yan;
import java.io.*;
import java.net.*;
public class Server {
	public static void main(String args[]){
		ServerSocket server=null;
		Socket you=null;
		DataOutputStream out=null;
		DataInputStream in=null;
		try {
			server=new ServerSocket(4331);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERRO"+e);
		}
		try {
			you=server.accept();
			in =new DataInputStream(you.getInputStream());
			out=new DataOutputStream(you.getOutputStream());
			while(true){
				int m=0;
				m=in.readInt();
				out.writeUTF("��˵������Ӧ���ַ���"+(char)m);
				System.out.println("�������յ�"+m);
				Thread.sleep(500);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(""+e);
		}
	}

}
