import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;

public class componentsOfSwing extends JFrame
{
	JFrame jf;
	JMenu m_menu, m_submenu;
	JMenuItem i_item1, i_item2, i_item3, i_item4, i_item5;
	componentsOfSwing()
	{
		jf = new JFrame("components");
		jf.setSize(400, 400);
		jf.setVisible(true);
		jf.setLayout(null);
		
		//Messege Dialog Box
		JOptionPane.showMessageDialog(jf, "Hello, Welcome!");
		
		//input dialog box
		JOptionPane.showInputDialog(jf, "Enter Your Name");
		
		//scroll bar
		JScrollBar sb = new JScrollBar();
		
		
		sb.setBounds(100, 100, 200, 200);
		jf.add(sb);
		
		//Menu
		JMenuBar m_bar = new JMenuBar();
		m_menu = new JMenu("Menu");
		m_submenu = new JMenu("Sub Menu");
		
		i_item1 = new JMenuItem("Red");
		i_item2 = new JMenuItem("blue");
		i_item3 = new JMenuItem("Cyan");
		i_item4 = new JMenuItem("yello");
		i_item5 = new JMenuItem("pink");
		
		m_menu.add(i_item1);
		m_menu.add(i_item2);
		m_menu.add(i_item3);
		
		m_submenu.add(i_item4);
		m_submenu.add(i_item5);
		
		m_menu.add(m_submenu);
		
		m_bar.add(m_menu);
		
		jf.setJMenuBar(m_bar);
		
		//pop-up menu
		JPopupMenu pop = new JPopupMenu();
		JMenuItem item1 = new JMenuItem("Red");
		JMenuItem item2 = new JMenuItem("white");
		JMenuItem item3 = new JMenuItem("black");
		JMenuItem item4 = new JMenuItem("Cyan");
		
		pop.add(item1);
		pop.add(item2);
		pop.add(item3);
		pop.add(item4);
		
		jf.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent a) {
				pop.show(jf, a.getX(), a.getY());
			}
		});
		
		jf.add(pop);
		jf.setLayout(null);
	}
	
	public static void main(String[] args)
	{
		new componentsOfSwing();
	}
}
