import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class buttonsSwing extends JFrame {
	
	String[] l = {
			"Noob", "Ulta-nOOb", "Legendary Noob"
	};
	buttonsSwing()
	{
		setTitle("New Window");
		JButton btn1 = new JButton("Yes"); // button
		JButton btn2 = new JButton("No"); // button
		JTextField jt = new JTextField(20); // text field(input)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(400, 400);
		add(btn1);
		add(btn2);
		add(jt);
		
		//checkbox
		JCheckBox jc = new JCheckBox("agree");
		add(jc);
		JCheckBox jc1 = new JCheckBox("disagree");
		add(jc1);
		JCheckBox jc2 = new JCheckBox("thinking");
		add(jc2);
		
		//radio buttons
		JRadioButton rb = new JRadioButton("cofee");
		JRadioButton rb1 = new JRadioButton("Tea");
		JRadioButton rb2 = new JRadioButton("Milk");
		add(rb);
		add(rb1);
		add(rb2);
		
		//ComboBox (input fiels + dropdown)
		JComboBox cb = new JComboBox(l);
		add(cb);
		
		//password field
		
		JPasswordField jp = new JPasswordField();
		jp.setBounds(100, 150, 100, 50);
		JLabel jl = new JLabel("Password");
		add(jl);
		add(jp);
		
		//table
		String[][] table_data = {{"1", "Prasad"}, {"2", "Vamshi"}, {"3", "Poorna"}};
		String[] column_data = {"USN", "Name"};
		
		JTable jtt = new JTable(table_data, column_data);
		JScrollPane sp = new JScrollPane(jtt);
		
		add(sp);
 		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new buttonsSwing();
	}
}
