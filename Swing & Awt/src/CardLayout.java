import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayout implements ActionListener
{
	JButton b1,b2,b3;
	JPanel p1,p2,p3;
	JFrame frm;
	CardLayout c;
	public CardLayout()
	{
		frm=new JFrame("CardLayout");
		frm.setSize(400,400);
		frm.setVisible(true);
		
		c=new CardLayout();
	//	p1.add(c);
		
		p1=new JPanel();
	//	p2=new JPanel();
		//p3=new JPanel();
		
	  frm.add(p1);
		
	//	frm.add(p2);
	//	frm.add(p3);
		
	//	p2.setLayout((LayoutManager) c);
		//p3.setLayout((LayoutManager) c);
		
		b1.setBackground(Color.CYAN);
		b2.setBackground(Color.black);
		b3.setBackground(Color.gray);
		
		b1=new JButton("first");
		b2=new JButton("second");
		b3=new JButton("third");
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public static void main(String[] args) {
		new CardLayout();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			c.next(p1);
		}	
	}

	private void next(JPanel p1) {
	
		
	}

}
