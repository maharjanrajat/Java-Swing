package swing;

import java.awt.event.*;
import javax.swing.*;

public class loginForm extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField usrText, passText;
	
	public void login() {
	    
		JButton btn = new JButton("Login");
		btn.setBounds(150, 108, 75, 25);

		JButton btn2 = new JButton("Register");
		btn2.setBounds(250, 108, 100, 25);
		
		//User Name
		JLabel username = new JLabel();
		username.setText("User Name :");
		username.setBounds(70, 40, 100, 40);
		
		//Password
		JLabel password = new JLabel();
		password.setText("Password :");
		password.setBounds(74, 70, 100, 40);
		
		//User Name Text Field
		 usrText = new JTextField(10);
		 usrText.setBounds(150, 48, 200, 25);
		 
		 //Password Text Field
		 passText = new JPasswordField(20);
		 passText.setBounds(150, 78, 200, 25);
		
		//Add To frame
		add(username);add(usrText);
		add(password);add(passText);
		add(btn);add(btn2);
		
		btn.addActionListener(this);//onclick it will call action perform
		
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		loginForm t = new loginForm();
		t.login();
	}
	
@Override
public void actionPerformed(ActionEvent e) {
	String username = usrText.getText();
	System.out.println("Hello " +username);
}
}