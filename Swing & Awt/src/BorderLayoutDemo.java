import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class BorderLayoutDemo implements ActionListener
{
	JFrame frm;
	JPanel pn1,pn2,pn3,pn4;
	JTextArea Tarea;
	JLabel lbl;
	JButton bt1,bt2;
	
	public BorderLayoutDemo()
	{
		// by default frame have a border layout 
		frm=new JFrame("Border Layout");
		frm.setSize(400,400);
		frm.setVisible(true);
		
		pn1=new JPanel();
		pn2=new JPanel();
		pn3=new JPanel();
		pn4=new JPanel();
		Tarea=new JTextArea(5,5);
		
	    lbl=new JLabel("Online Bank");
	    lbl.setFont(new Font("Times new Roman",Font.BOLD,24));
	    pn1.add(lbl);
	    
	    bt1=new JButton("Recharge");
	    bt2=new JButton("Logout");
	    pn2.add(bt1);
	    pn2.add(bt2);
		
		pn1.setBackground(Color.LIGHT_GRAY);
		pn2.setBackground(Color.yellow);
		pn3.setBackground(Color.green);
		pn4.setBackground(Color.orange);
		
		BorderLayout f1=new BorderLayout();
		frm.setLayout(f1);
		
		pn3.setLayout(new GridLayout(3,3,5,5));
		JButton btarr[]=new JButton[9];
		for(int i=0;i<9;i++)
		{
			btarr[i]=new JButton(Integer.toString(i));
			pn3.add(btarr[i]);
			btarr[i].addActionListener(this);
			
		}
		
		frm.add(BorderLayout.NORTH,pn1);
		frm.add(BorderLayout.SOUTH,pn2);
		frm.add(BorderLayout.EAST,pn3);
		frm.add(BorderLayout.WEST,pn4);
		frm.add(BorderLayout.CENTER,Tarea);
	}

	public static void main(String[] args)
	{	
       new BorderLayoutDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
	       String str=e.getActionCommand();
	       if(str.equals("1"))
	       {
	    	   Tarea.setText(str);
	       }		
	}

}
