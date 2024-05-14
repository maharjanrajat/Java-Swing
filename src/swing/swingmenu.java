package swing;
import javax.swing.*;

public class swingmenu {
	
	JMenu menu, submenu;
	JMenuItem i1, i2, i3, s1, s2, s3;
	
	
	swingmenu(){
		
		JFrame f = new JFrame("Swing Menu");
		
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Menu");
		
		submenu = new JMenu("Sub Menu");
		
		i1 = new JMenuItem("Item 1");
		i2 = new JMenuItem("Item 2");
		i3 = new JMenuItem("Item 3");
		
		s1 = new JMenuItem("sub i1");
		s2 = new JMenuItem("sub i2");
		s3 = new JMenuItem("sub i3");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		
		submenu.add(s1);
		submenu.add(s2);
		submenu.add(s3);
		
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new swingmenu();
	}

}
