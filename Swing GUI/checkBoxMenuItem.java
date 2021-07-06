import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class checkBoxMenuItem extends JFrame
{
	JFrame jf;
	checkBoxMenuItem()
	{
		jf = new JFrame("Check Box Menu");
		jf.setSize(400, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menu_bar = new JMenuBar();
		
		JMenu file_menu = new JMenu("File");
		file_menu.setMnemonic(KeyEvent.VK_F);
		
		menu_bar.add(file_menu);
		
		JMenuItem item1 = new JMenuItem("Open", KeyEvent.VK_N);
		file_menu.add(item1);
		file_menu.addSeparator();
		JCheckBoxMenuItem item2 = new JCheckBoxMenuItem("Option_1");
		item2.setMnemonic(KeyEvent.VK_C);
		file_menu.add(item2);
		
		ActionListener checkboxAction = new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				AbstractButton btn = (AbstractButton) e.getSource();
				boolean selected = btn.getModel().isSelected();
				
				String s;
				if(selected)
				{
					s = "Value-1";
				}
				else
				{
					s = "Value-2";
				}
				btn.setText(s);
			}
		};
		
		item2.addActionListener(checkboxAction);
		jf.setJMenuBar(menu_bar);	
	}
	
	public static void main(String[] args)
	{
		new checkBoxMenuItem();
	}
}
