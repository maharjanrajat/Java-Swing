import java.awt.*;
import javax.swing.*;

public class PanelDemo {

	public static void main(String[] args) {
		JFrame f = new JFrame("Panel Demo");
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 80, 200, 100);
		
		panel.setBackground(Color.gray);
		
		JButton b1 = new JButton("Save");
		b1.setBounds(50,100,80,30);
		b1.setBackground(Color.green);
		
		JButton b2 = new JButton("Cancel");
		b2.setBounds(100,100,80,30);
		b2.setBackground(Color.red);
		
		panel.add(b1);
		panel.add(b2);
		
		f.add(panel);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
