import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dashbordui implements ActionListener
{
	JFrame frm;
	JPanel pn1,pn2,pn3,pn4;
	JLabel lbl,lbal;
	JButton bt1,bt2,bt3,bt4,bt5,bt6;
	int bal=1000;
	public Dashbordui()
	{
		// by default frame have a border layout 
		frm=new JFrame("Dashbord");
		frm.setSize(400,400);
		frm.setVisible(true);
		
		
		pn1=new JPanel();
		pn1.setLayout(new FlowLayout());
		pn2=new JPanel();
		pn3=new JPanel();
		pn4=new JPanel();
		
	    lbl=new JLabel("Online Bank");
	    lbl.setFont(new Font("Times new Roman",Font.BOLD,24));
	    pn1.add(lbl);
	        
	    String str=Integer.toString(bal);
	    lbal=new JLabel(str);
     lbal.setFont(new Font("Times new Roman",Font.BOLD,20));
	    pn1.add(lbal);
	 lbl.setForeground(Color.WHITE);
	  /* lbal.setBackground(Color.black);
	    lbal.setBounds(390,10, 30, 30);*/
	    
	    bt1=new JButton("Recharge");
	    bt2=new JButton("Logout");
	    bt3=new JButton("Save");
	    bt4=new JButton("Delete");
	    bt5=new JButton("Update");
	    bt6=new JButton("Search");
	    
	    pn4.add(bt1);
	    pn4.add(bt2);
	    
	    pn2.add(bt3);
	    pn2.add(bt6);
	    pn2.add(bt5);
	    pn2.add(bt4);
	    
		
		pn1.setBackground(Color.darkGray);
		pn2.setBackground(Color.yellow);
		pn3.setBackground(Color.green);
		pn4.setBackground(Color.orange);
		
		BorderLayout f1=new BorderLayout();
		frm.setLayout(f1);
		
		
		frm.add(BorderLayout.NORTH,pn1);
		frm.add(BorderLayout.SOUTH,pn2);
		frm.add(BorderLayout.EAST,pn3);
		frm.add(BorderLayout.WEST,pn4);	
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt2) {			
			Homeui h=new Homeui();
			frm.setVisible(false);
		}
		if(e.getSource()==bt1)
		{
			new Mobilerech();
			frm.setVisible(false);
		}
	}	
}