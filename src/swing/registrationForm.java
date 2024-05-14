package swing;
import java.awt.event.*;
import javax.swing.*;

public class registrationForm extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nameText, addText, phonText, usrText, passText, cPassText;
	JCheckBox c1, c2, c3;
	JRadioButton m, f, o;
	
	JButton b;
	public void registeration() {
		JButton btn = new JButton("Register");
		//UserName
		JLabel username = new JLabel();
		username.setText("User Name :");
		username.setBounds(170, 35, 100, 40);
		
		//Name
		JLabel name = new JLabel();
		name.setText("Name :");
		name.setBounds(200, 65,100,40);
		
		//Date of Birth
		JLabel dob = new JLabel();
		dob.setText("Date of Birth :");
		dob.setBounds(164, 95, 100, 40);
		
		//Address
		JLabel address = new JLabel();
		address.setText("Address :");
		address.setBounds(184, 125, 100, 40);
		
		//Gender
		JLabel gender = new JLabel();
		gender.setText("Gender :");
		gender.setBounds(192, 155, 100, 40);
		
		//Phone
		JLabel phone = new JLabel();
		phone.setText("Contact :");
		phone.setBounds(185, 185, 100, 40);
		
		//Password
		JLabel password = new JLabel();
		password.setText("Password :");
		password.setBounds(172, 215, 100, 40);
		
		JLabel c_password = new JLabel();
		c_password.setText("Confirm Password :");
		c_password.setBounds(125, 245, 150, 40);
		
		JLabel faculty = new JLabel();
		faculty.setText("Faculty :");
		faculty.setBounds(190, 275, 150, 40);

		c1 = new JCheckBox("BCA");
		c1.setBounds(250,285,55,20);
		c2 = new JCheckBox("BSc.CSIT");
		c2.setBounds(310,285,90,20);
		c3 = new JCheckBox("BBM");
		c3.setBounds(400,285,100,20);
		
		m = new JRadioButton("Male");
		m.setBounds(250,165,65,20);
		
		f = new JRadioButton("Female");
		f.setBounds(312,165,70,20);
		
		o = new JRadioButton("Other");
		o.setBounds(380,165,65,20);
		ButtonGroup bg = new ButtonGroup();
		bg.add(m);bg.add(f);bg.add(o);
		
		
		 nameText = new JTextField(15);
		 nameText.setBounds(250, 45,200,25);
		 usrText = new JTextField(10);
		 usrText.setBounds(250, 75,200,25);
		 addText = new JTextField(20);
		 addText.setBounds(250, 135, 200, 25);
		 phonText = new JTextField(10);
		 phonText.setBounds(250, 195, 200, 25);
		 passText = new JPasswordField(20);
		 passText.setBounds(250, 225, 200, 25);
		 cPassText = new JPasswordField(20);
		 cPassText.setBounds(250, 255, 200, 25);
		
		 btn.setBounds(284, 320, 100, 20);
		
		//Add To frame
		add(name);add(nameText);
		add(username);add(usrText);
		add(gender);add(m);add(f);add(o);
		add(address);add(addText);
		add(dob);
		add(phone);add(phonText);
		add(password);add(passText);
		add(c_password);add(cPassText);
		add(faculty);add(c1);add(c2);add(c3);
		add(btn);
		
		btn.addActionListener(this);//onclick it will call action perform
		setLayout(null);
		setSize(1000,1000);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		registrationForm rf = new registrationForm();
		rf.registeration();
	}
	
@Override
public void actionPerformed(ActionEvent e) {
	String name = nameText.getText();
	String username = usrText.getText();
	String address = addText.getText();
	String phone = phonText.getText();
	System.out.println("User Name : "+name+"\nName : "+username+"\nAddress : "+address+"\nContact : "+phone);
}
}