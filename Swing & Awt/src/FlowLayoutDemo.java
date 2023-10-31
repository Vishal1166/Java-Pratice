
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo
{
	JFrame frm;
	JPanel pn;
	JButton bt1,bt2,bt3;
	
	public FlowLayoutDemo()
	{
		frm=new JFrame("Flow Layout");
		frm.setSize(400,400);
		frm.setVisible(true);
		
		bt1=new JButton("first");
		bt2=new JButton("second");
		bt3=new JButton("third");
		
		FlowLayout fl=new FlowLayout();
		frm.setLayout( fl);
		
		frm.add(bt1);
		frm.add(bt2);
		frm.add(bt3);
	}

	public static void main(String[] args) 
	{		
      new FlowLayoutDemo();
	}

}