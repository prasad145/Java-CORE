import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progressBar extends JFrame
{
	int i = 0;
	JProgressBar pb = new JProgressBar();
	progressBar()
	{
		pb = new JProgressBar(0, 2000);
		pb.setBounds(40, 40, 180, 30);
		pb.setSize(400, 40);
		pb.setValue(0);
		pb.setStringPainted(true);
		
		add(pb);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	
	public void iterate()
	{
		while(i <= 2000)
		{
			pb.setValue(i);
			i += 10;
			
			try 
			{
				Thread.sleep(150);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		progressBar p = new progressBar();
//		p.setVisible(true);
		p.iterate();
	}
}
