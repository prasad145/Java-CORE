import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class treeStructure {
	JFrame jf;
	treeStructure()
	{
		jf = new JFrame("Tree Structure");  
	    jf.setSize(200,200);  
	    jf.setVisible(true);
	    
	    DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Style");
	    DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Color");
	    DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Font");
	    node1.add(node2);
	    node1.add(node3);
	    
	    DefaultMutableTreeNode node4 = new DefaultMutableTreeNode("red");  
	    DefaultMutableTreeNode node5 = new DefaultMutableTreeNode("blue");  
	    DefaultMutableTreeNode node6 = new DefaultMutableTreeNode("black");  
	    DefaultMutableTreeNode node7 = new DefaultMutableTreeNode("green");  
	    node2.add(node4); 
	    node2.add(node5); 
	    node2.add(node6); 
	    node2.add(node7);
	    
	    JTree jt = new JTree(node1);
	    jf.add(jt);
	}
	
	public static void main(String[] args)
	{
		new treeStructure();
	}
}
