import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Mobilerech implements ActionListener
{
	JFrame frm;
	JPanel pn1;
	JLabel lmno,lsr,lmnt;
	JTextField tmno,tmnt;
	JComboBox <String> tsr;
	JButton bt1,bt2;
	
	public Mobilerech()
	{
	frm=new JFrame("Recharge");
	frm.setSize(400,400);
	frm.setVisible(true);
	
	pn1=new JPanel();
	frm.add(pn1);
	pn1.setBackground(Color.CYAN);
	pn1.setLayout(new GridLayout(4,2));
	
	bt1=new JButton("recharge");
	bt2=new JButton("Back");
	
	String strtsr[]= {"company","Jio","Airtel","VI"};
	
	lmno=new JLabel("Mobile no :");
	lsr=new JLabel("Service :");
	lmnt=new JLabel("Amount :");
	
	tmno=new JTextField(10);
	
	tmnt=new JTextField(10);
	tsr=new JComboBox(strtsr);
	
	pn1.add(lmno);
	pn1.add(tmno);
	pn1.add(lsr);
	pn1.add(tsr);
	pn1.add(lmnt);
	pn1.add(tmnt);
	pn1.add(bt1);
	pn1.add(bt2);
	
	bt2.addActionListener(this);	
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==bt2)
	{
		Dashbordui d=new Dashbordui();
		frm.setVisible(false);
	}
	/*if(e.getSource()==bt1)
	{
		Dashbordui d=new Dashbordui();
		
	}*/
	}
}
