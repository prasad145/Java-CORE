import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class changeBackgroundColor extends JFrame implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton b1, b2, b3, b4, b5;
	JLabel jl;
	
	changeBackgroundColor()
	{
		frame = new JFrame("Colors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jl = new JLabel("Select the Background Color");
		jl.setBounds(50,100, 200,30);
		frame.add(jl);
		panel = new JPanel();
		panel.setSize(1000, 100);
		
		b1 = new JButton("BLUE");
		b1.addActionListener(this);
		
		b2 = new JButton("RED");
		b2.addActionListener(this);
		
		b3 = new JButton("CYAN");
		b3.addActionListener(this);
		
		b4 = new JButton("PINK");
		b4.addActionListener(this);
		
		b5 = new JButton("MAGENTA");
		b5.addActionListener(this);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		
		JTextArea ja = new JTextArea("Enter Something");
		ja.setBounds(10, 20, 200, 200);
		
		frame.add(ja);
		
		frame.getContentPane().add(panel);
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object o = e.getSource();
		if(o == b1)
		{
			frame.getContentPane().setBackground(java.awt.Color.BLUE);
		}
		
		if(o == b2)
		{
			frame.getContentPane().setBackground(java.awt.Color.RED);
		}
		
		if(o == b3)
		{
			frame.getContentPane().setBackground(java.awt.Color.CYAN);
		}
		
		if(o == b4)
		{
			frame.getContentPane().setBackground(java.awt.Color.PINK);
		}
		
		if(o == b5)
		{
			frame.getContentPane().setBackground(java.awt.Color.MAGENTA);
		}
	}
	
	public static void main(String[] args)
	{
		new changeBackgroundColor();
	}
}
