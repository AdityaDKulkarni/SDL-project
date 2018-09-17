package Design;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class displaypg implements ActionListener {

	JLabel name,Cause,budgetplate,date,time,venue,totalbudget,entertainment;
	JComboBox<Integer> records;
	JTextField tfname,tfcause,tfbudgetplate,tfdate,tftime,tftotalbudget,tfentertainment;
	JTextArea tfvenue;
	JFrame frame;
	JPanel panel;
	JButton back;
	
	displaypg()
	{
		frame=new JFrame("SHOW ALL ADDED RECORDS");
		makeFrameFullSize();
		panel=(JPanel)frame.getContentPane();
		panel.setLayout(null);
		
	    records=new JComboBox<Integer>();
		records.addItem(null);	
		records.setFont(new Font("Arial",Font.PLAIN,14));
		records.setBounds(70,100,150,20);
		
		name=new JLabel("Name");
	    name.setFont(new Font("Arial",Font.BOLD,14));
		name.setBounds(440,70,100,20);
		
		tfname=new JTextField(60);
		tfname.setBounds(600,70,230,20);
		tfname.setFont(new Font("Arial",Font.BOLD,14));
		tfname.setBackground(new Color(245,255,250));
		
		Cause=new JLabel("Cause of Event");
	    Cause.setFont(new Font("Arial",Font.BOLD,14));
		Cause.setBounds(440,110,120,20);
		
		tfcause=new JTextField(60);
		tfcause.setBounds(600,110,230,20);
		tfcause.setFont(new Font("Arial",Font.BOLD,14));
		tfcause.setBackground(new Color(245,255,250));
		
		venue=new JLabel("Venue of Event");
	    venue.setFont(new Font("Arial",Font.BOLD,14));
		venue.setBounds(440,150,140,20);
		
		tfvenue=new JTextArea();
		tfvenue.setBounds(600,150,230,120);
		tfvenue.setFont(new Font("Arial",Font.BOLD,14));
		tfvenue.setBackground(new Color(245,255,250));
		
		date=new JLabel("Date of Event");
	    date.setFont(new Font("Arial",Font.BOLD,14));
		date.setBounds(440,300,120,20);
		
		tfdate=new JTextField(60);
		tfdate.setBounds(600,300,230,20);
		tfdate.setFont(new Font("Arial",Font.BOLD,14));
		tfdate.setBackground(new Color(245,255,250));
		
		time=new JLabel("Time of Event");
	    time.setFont(new Font("Arial",Font.BOLD,14));
		time.setBounds(440,340,120,20);
		
		tftime=new JTextField(60);
		tftime.setBounds(600,340,230,20);
		tftime.setFont(new Font("Arial",Font.BOLD,14));
		tftime.setBackground(new Color(245,255,250));
		
		budgetplate=new JLabel("Budged per plate");
		budgetplate.setFont(new Font("Arial",Font.BOLD,14));
		budgetplate.setBounds(440,420,140,20);
		
		tfbudgetplate=new JTextField(60);
		tfbudgetplate.setBounds(600,420,230,20);
		tfbudgetplate.setFont(new Font("Arial",Font.BOLD,14));
		tfbudgetplate.setBackground(new Color(245,255,250));
		
		totalbudget=new JLabel("Total Budget");
		totalbudget.setFont(new Font("Arial",Font.BOLD,14));
		totalbudget.setBounds(440,380,140,20);
		
		tftotalbudget=new JTextField(60);
		tftotalbudget.setBounds(600,380,230,20);
		tftotalbudget.setFont(new Font("Arial",Font.BOLD,14));
		tftotalbudget.setBackground(new Color(245,255,250));
		
		entertainment=new JLabel("Entertainment");
		entertainment.setFont(new Font("Arial",Font.BOLD,14));
		entertainment.setBounds(440,460,120,20);
		
		tfentertainment=new JTextField(60);
		tfentertainment.setBounds(600,460,230,20);
		tfentertainment.setFont(new Font("Arial",Font.BOLD,14));
		tfentertainment.setBackground(new Color(245,255,250));
		
		back=new JButton("Back");
		back.setMnemonic('B');
		back.setToolTipText("Click Here");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setFont(new Font("Arial",Font.BOLD,14));
        back.setBounds(450,550,70,20);
		back.setBackground(new Color(30,180,255));
		back.addActionListener(this);
		
		panel.setBackground(new Color(153,255,255));
		
		panel.add(venue);
		panel.add(tfvenue);
		panel.add(name);
		panel.add(tfname);
		panel.add(records);
		panel.add(Cause);
		panel.add(tfcause);
		panel.add(budgetplate);
	    panel.add(tfbudgetplate);
	    panel.add(totalbudget);
	    panel.add(tftotalbudget);
	    panel.add(date);
	    panel.add(tfdate);
	    panel.add(time);
	    panel.add(tftime);
	    panel.add(entertainment);
	    panel.add(tfentertainment);
	    panel.add(back);
	   
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		new page1();
		frame.dispose();
		
	}
	
	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}
	
			
	public static void main(String[] args) {
		new displaypg();
	}

	
}
