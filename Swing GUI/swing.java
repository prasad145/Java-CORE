import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class swing 
{
	JFrame jf;
	public swing()
	{
		jf = new JFrame("My Window");
		JButton btn = new JButton("Click Me");
		jf.add(btn);
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400, 400);
		jf.setVisible(true);
		jf.setResizable(true);
	}
	
	public static void main(String[] args)
	{
		new swing();
	}
}
