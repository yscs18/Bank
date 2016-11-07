package Awt;
import javax.swing.*;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame frame =new JFrame("第一个窗口");
    JFrame frame1=new JFrame("第二个窗口");
    frame.setBounds(60,100,188,108);
    frame1.setBounds(260,100,188,108);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame1.setVisible(true);
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	}

}
