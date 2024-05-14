package swing;
import java.awt.BorderLayout;

import javax.swing.*;

public class swing {

	public static void main(String[] args) {
		JFrame frm = new JFrame();
		
		JButton btn = new JButton("LEFT");
		btn.setBounds(100,50,100,50);
		
		frm.add(btn,BorderLayout.WEST);
		
		JButton btn2 = new JButton("RIGHT");
		btn2.setBounds(250,50,100,50);
		
		frm.add(btn2,BorderLayout.EAST);
		
		JButton btn3 = new JButton("UP");
		btn.setBounds(100,50,100,50);
		
		frm.add(btn3,BorderLayout.NORTH);
		
		JButton btn4 = new JButton("DOWN");
		btn2.setBounds(250,50,100,50);
		
		frm.add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("MIDDLE");
		btn2.setBounds(250,50,100,50);
		
		frm.add(btn5,BorderLayout.CENTER);
		
		frm.setSize(500,500);
		//frm.setLayout(null);
		frm.setVisible(true);
	}
}
