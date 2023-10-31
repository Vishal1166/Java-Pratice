import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JPanel;

public class Loginui extends JFrame implements ActionListener
{
	JPanel pn;
	JButton blogin,bhome;
	JLabel lid,lpass;
	JTextField tid;
	JPasswordField tpass;
	
	public Loginui()
	{
       super("Login Page");
       setSize(400,400);
       setVisible(true);
   
       pn=new JPanel();
       add(pn);
       pn.setBackground(Color.GREEN);
       pn.setLayout(new GridLayout(3,2));
       
       lid=new JLabel("User Name :");
       lpass=new JLabel("Password :");
    	
    	tid=new JTextField(10);
    	tpass=new JPasswordField(10);
   
   blogin=new JButton("Login");
   bhome=new JButton("Home");
   pn.add(lid);
   pn.add(tid);
   pn.add(lpass);
   pn.add(tpass);
   pn.add(blogin);
   pn.add(bhome);
   
   blogin.addActionListener(this);
   bhome.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==blogin)
		{
			if(tid.getText().equals("admin"))
			{
				if(tpass.getText().equals("pass"))
				{
					Dashbordui d=new Dashbordui();
					this.dispose();
				}
				else
				{
				JOptionPane.showMessageDialog(this,new String("Invalid Password..."));
				}
			}				
		
		else
		{
		JOptionPane.showMessageDialog(this,new String("Invalid User Name..."));
		}
	}
		if(e.getSource()==bhome)
		{
		  Homeui h=new Homeui();
		  this.dispose();
		}
		
	}
   
}
