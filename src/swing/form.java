package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class form implements ActionListener{

    JTextField usrText, passText;

    public void login() {
        JFrame frm = new JFrame();


		//creating indivisual buttons
		JButton btn = new JButton("Login");
		
		JLabel username = new JLabel();
		JLabel password = new JLabel();
		
		username.setText("Username");
		password.setText("Password");
		
		usrText = new JTextField(10);
		passText = new JPasswordField(10);
			
        //adding buttons to the frame
		frm.add(username);
		frm.add(usrText);
		frm.add(password);
		frm.add(passText);
		frm.add(btn);

        btn.addActionListener(this); //onclick it will call actionPerformed()
		
		
		
		//setting layout
		frm.setLayout(new FlowLayout());
		frm.setSize(500,500);
		frm.setVisible(true);
	}

    public static void main(String[] args) {

        form f = new form();
        f.login();
    }
    
    public void actionPerformed(ActionEvent e) {

        String username = usrText.getText();
        System.out.println("Hello " + username);
    }
}
