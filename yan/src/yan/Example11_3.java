package yan;
import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class Example11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WinTwo();

	}

}
class WinTwo extends JFrame implements ActionListener,Runnable{
	JButton button;
	URL url;
	JTextField text;
	JEditorPane editPane;
	byte b[]=new byte[118];
	Thread thread;
	public WinTwo(){
		text=new JTextField(20);
		editPane =new JEditorPane();
		editPane.setEditable(false);
		button=new JButton("确定");
		button.addActionListener(this);
		thread=new Thread(this);
		JPanel p=new JPanel();
		p.add(new JLabel("输入网址"));
		p.add(text);
		p.add(button);
		Container con=getContentPane();
		con.add(new JScrollPane(editPane),BorderLayout.CENTER);
		con.add(p,BorderLayout.NORTH);
		setBounds(60, 60, 360, 300);
		setVisible(true);
		validate();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		editPane.addHyperlinkListener(new HyperlinkListener() {
			
			
			public void hyperlinkUpdate(HyperlinkEvent e) {
				if(e.getEventType()==HyperlinkEvent.EventType.ACTIVATED){
					try {
						editPane.setPage(e.getURL());
					} catch (Exception e2) {
						// TODO: handle exception
						editPane.setText(""+e2);
					}
				}
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void actionPerformed(ActionEvent e){
		if(thread.isAlive()){
			thread=new Thread(this);
			
		}
		try {
			thread.start();
		} catch (Exception e2) {
			
			
			
			// TODO: handle exception
			text.setText("我正在读取"+url);
		}
	}
	public void run(){
		try {
			int n=-1;
			editPane.setText(null);
		} catch (Exception e) {
			// TODO: handle exception
			text.setText(""+e);
		}
	}
}
