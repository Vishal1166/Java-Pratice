import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Registrationui extends JFrame implements ActionListener {
    
	JPanel pn;
	JButton bhome,bsave;
	JLabel lid,lunm,lpass,laddr,lcity,lstate,lmno,lgen;
	JTextField tid,tunm,tmno;
	JPasswordField tpass;
	JComboBox <String> ct;
	JList<String> st;
	JTextArea taddr;
	JRadioButton gn1,gn2;
	
	public Registrationui()
	{
		super("Registration Form");
		setSize(400,500);
		setVisible(true);
		
		pn=new JPanel();
		add(pn);
		pn.setBackground(Color.cyan);
		pn.setLayout(new GridLayout(8,2));
		
		bhome=new JButton("Home");
		bsave=new JButton("Save");
		
		lid=new JLabel("User id :");
		lunm=new JLabel("User name :");
		lgen=new JLabel("Gender :");
		lpass=new JLabel("Password :");
		laddr=new JLabel("Address :");
		lcity=new JLabel("City :");
		lstate=new JLabel("State :");
		lmno=new JLabel("Mobile no :");		
		String strct[]= {"City","Mumbai","Pune","Nasik"};
		String strst[]= {"MH","PU","TN"};

		tid=new JTextField(10);
		tunm=new JTextField(10);
		gn1=new JRadioButton("Male");
		gn2=new JRadioButton("Female");
		ButtonGroup bg=new ButtonGroup();
		bg.add(gn1);
		bg.add(gn2);
		tmno=new JTextField(10);
		tpass=new JPasswordField(10);
		taddr=new JTextArea(3,3);
		ct=new JComboBox(strct);
		st=new JList(strst);
		
		pn.add(lid);
		pn.add(tid);
		pn.add(lunm);
		pn.add(tunm);
	//pn.add(lgen);
	//	pn.add(gn1);
		//pn.add(gn2);
		pn.add(lpass);
		pn.add(tpass);
		pn.add(lmno);
		pn.add(tmno);
		pn.add(laddr);
		pn.add(taddr);
		pn.add(lcity);
		pn.add(ct);
		pn.add(lstate);
		pn.add(st);
		
		pn.add(bsave);
		pn.add(bhome);
		bsave.addActionListener(this);
		bhome.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bhome)
		{
			 Homeui h=new Homeui();
			  this.dispose();	
		}		
	}

}
