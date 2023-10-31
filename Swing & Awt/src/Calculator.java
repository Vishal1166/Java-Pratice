import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Calculator implements ActionListener
{
	 JFrame frm;
	   JPanel pn;
	   JLabel lno1,lno2,lans;
	   JTextField tno1,tno2,tans;
	   JButton badd,bsub,bmul,bdiv,breset,bexit;


public Calculator()
{
	frm=new JFrame();
	frm.setSize(400,400);
	frm.setVisible(true);
	
	pn=new JPanel();
	frm.add(pn);
	pn.setBackground(Color.WHITE);
	
	GridLayout gl=new GridLayout(6,2);     // converting screen on 2 colmn & 5 row 
	pn.setLayout(gl);
	
	Font f1=new Font("Times New oman",Font.BOLD,20);
	
	lno1=new JLabel("Number1 :");
	lno2=new JLabel("Number2 :");
	lans=new JLabel("Result :");
	// aplay font on lable & textfield
	lno1.setFont(f1);
	lno2.setFont(f1);
	lans.setFont(f1);
	
	tno1=new JTextField(10);
	tno2=new JTextField(10);
	tans=new JTextField(10);
	
	tno1.setFont(f1);
	tno2.setFont(f1);
	tans.setFont(f1);
	
	badd=new JButton("+");
	bsub=new JButton("-");
	bmul=new JButton("*");
	bdiv=new JButton("/");
	breset=new JButton("Clear");
	bexit=new JButton("Exit");
	
	// adding on panel =  label , textfield , button and other thing 
	
	pn.add(lno1);
	pn.add(tno1);
	pn.add(lno2);
	pn.add(tno2);
	pn.add(lans);
	pn.add(tans);
	    
	pn.add(badd);
	pn.add(bsub);
	pn.add(bmul);
	pn.add(bdiv);
	pn.add(breset);
	pn.add(bexit);	
	
	badd.addActionListener(this);
	bsub.addActionListener(this);
	bmul.addActionListener(this);
	bdiv.addActionListener(this);
	breset.addActionListener(this);
	bexit.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent e)
{
		if(e.getSource()==badd)
		{
			try
			{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int ans=n1+n2;
			tans.setText(Integer.toString(ans));
			}
			catch(Exception ex)
			{
				System.out.println(ex);
				tno1.setText(ex.toString());
			}
		}
		else if(e.getSource()==bsub)
		{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int ans=n1-n2;
			tans.setText(Integer.toString(ans));
		}
		else if(e.getSource()==bmul)
		{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int ans=n1*n2;
			tans.setText(Integer.toString(ans));
		}
		else if(e.getSource()==bdiv)
		{
			int n1=Integer.parseInt(tno1.getText());
			int n2=Integer.parseInt(tno2.getText());
			int ans=n1/n2;
			tans.setText(Integer.toString(ans));
		}
		else if(e.getSource()==breset)
		{
			tno1.setText("");
	     	tno2.setText("");
	    	tans.setText("");
		}
		else if(e.getSource()==bexit)
		{
			System.exit(0);
		}
}  
}