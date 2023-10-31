import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Homeui extends JFrame implements ActionListener
{
	JPanel pn;
	JButton blogin,breg;
	
	public Homeui()
	{
       super("Home Page");
       setSize(400,400);
       setVisible(true);
       
       pn=new JPanel();
       add(pn);
       pn.setBackground(Color.yellow);
   
   blogin=new JButton("Login");
   breg=new JButton("Register");
   
   pn.add(blogin);
   pn.add(breg);
   
   blogin.addActionListener(this);
   breg.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==blogin)
		{
			Loginui l=new Loginui();
			this.dispose();
		}
		if(e.getSource()==breg)
		{
			Registrationui r=new Registrationui();
			this.dispose();
		}
		
	}
   
}
