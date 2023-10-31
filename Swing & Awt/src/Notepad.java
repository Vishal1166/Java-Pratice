import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JMenuBar;

public class Notepad extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu m1,m2,m3;
	JMenuItem m11,m12,m21,m22,m23;
	JTextArea ta;
	public Notepad() 
	{
		super("Notepad");
		setSize(500,500);
		setVisible(true);
		
		mb=new JMenuBar();
		setJMenuBar(mb);
		ta=new JTextArea(5,5);
		add(ta);
		
		m1=new JMenu("FILE");
		m2=new JMenu("EDIT");
		m3=new JMenu("FORMAT");
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		m11=new JMenuItem("NEW");
		m12=new JMenuItem("Open");
		m21=new JMenuItem("Cute");
		m22=new JMenuItem("Copy");
		m23=new JMenuItem("Paste");
		
		m1.add(m11);
		m1.add(m12);
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		
		m21.addActionListener(this);
		m22.addActionListener(this);
		m23.addActionListener(this);			
	}
	public static void main(String[] args) {
	          new Notepad();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==m21)
		{
			ta.cut();
		}
		if(e.getSource()==m22)
		{
			ta.copy();
		}
		if(e.getSource()==m23)
		{
			ta.paste();			
		}		
	}
}
