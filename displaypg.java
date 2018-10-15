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
		panel.setBackground(new Color(100,130,230));
		
		JLabel lblSearch=new JLabel("Search your Record");
		lblSearch.setFont(new Font("Arial",Font.PLAIN,16));
		lblSearch.setBounds(70,50,150,20);
		lblSearch.setForeground(Color.WHITE);
		panel.add(lblSearch);
		
	    records=new JComboBox<Integer>();
		records.addItem(null);	
		records.setFont(new Font("Arial",Font.PLAIN,14));
		records.setBounds(70,100,150,20);
		records.setBackground(new Color(205,255,250));
		
		name=new JLabel("Name");
	    name.setFont(new Font("Arial",Font.BOLD,14));
		name.setBounds(400,70,100,20);
		name.setForeground(Color.WHITE);
		
		tfname=new JTextField(60);
		tfname.setBounds(560,70,230,20);
		tfname.setFont(new Font("Arial",Font.BOLD,14));
		tfname.setBackground(new Color(205,255,250));
		
		Cause=new JLabel("Cause of Event");
	    Cause.setFont(new Font("Arial",Font.BOLD,14));
		Cause.setBounds(400,110,120,20);
		Cause.setForeground(Color.WHITE);
		
		tfcause=new JTextField(60);
		tfcause.setBounds(560,110,230,20);
		tfcause.setFont(new Font("Arial",Font.BOLD,14));
		tfcause.setBackground(new Color(205,255,250));
		
		venue=new JLabel("Venue of Event");
	    venue.setFont(new Font("Arial",Font.BOLD,14));
		venue.setBounds(400,150,140,20);
		venue.setForeground(Color.WHITE);
		
		tfvenue=new JTextArea();
		tfvenue.setBounds(560,150,230,120);
		tfvenue.setFont(new Font("Arial",Font.BOLD,14));
		tfvenue.setBackground(new Color(205,255,250));
		
		date=new JLabel("Date of Event");
	    date.setFont(new Font("Arial",Font.BOLD,14));
		date.setBounds(400,300,120,20);
		date.setForeground(Color.WHITE);
		
		tfdate=new JTextField(60);
		tfdate.setBounds(560,300,230,20);
		tfdate.setFont(new Font("Arial",Font.BOLD,14));
		tfdate.setBackground(new Color(205,255,250));
		
		time=new JLabel("Time of Event");
	    time.setFont(new Font("Arial",Font.BOLD,14));
		time.setBounds(400,340,120,20);
		time.setForeground(Color.WHITE);
		
		tftime=new JTextField(60);
		tftime.setBounds(560,340,230,20);
		tftime.setFont(new Font("Arial",Font.BOLD,14));
		tftime.setBackground(new Color(205,255,250));
		
		budgetplate=new JLabel("Budged per plate");
		budgetplate.setFont(new Font("Arial",Font.BOLD,14));
		budgetplate.setBounds(400,420,140,20);
		budgetplate.setForeground(Color.WHITE);
		
		
		tfbudgetplate=new JTextField(60);
		tfbudgetplate.setBounds(560,420,230,20);
		tfbudgetplate.setFont(new Font("Arial",Font.BOLD,14));
		tfbudgetplate.setBackground(new Color(205,255,250));
		
		totalbudget=new JLabel("Total Budget");
		totalbudget.setFont(new Font("Arial",Font.BOLD,14));
		totalbudget.setBounds(400,380,140,20);
		totalbudget.setForeground(Color.WHITE);
		
		tftotalbudget=new JTextField(60);
		tftotalbudget.setBounds(560,380,230,20);
		tftotalbudget.setFont(new Font("Arial",Font.BOLD,14));
		tftotalbudget.setBackground(new Color(205,255,250));
		
		entertainment=new JLabel("Entertainment");
		entertainment.setFont(new Font("Arial",Font.BOLD,14));
		entertainment.setBounds(400,460,120,20);
		entertainment.setForeground(Color.WHITE);
		
		tfentertainment=new JTextField(60);
		tfentertainment.setBounds(560,460,230,20);
		tfentertainment.setFont(new Font("Arial",Font.BOLD,14));
		tfentertainment.setBackground(new Color(205,255,250));
		
		back=new JButton("Back");
		back.setMnemonic('B');
		back.setToolTipText("Click Here");
		back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		back.setFont(new Font("Arial",Font.BOLD,14));
        back.setBounds(450,550,70,20);
		back.setBackground(new Color(200,240,250));
		back.addActionListener(this);
		
		JLabel labelimg=new JLabel("");
		Image pic=new ImageIcon(this.getClass().getResource("/p12.png")).getImage();
		labelimg.setIcon(new ImageIcon(pic));
		labelimg.setBounds(850,30,370,470);
		panel.add(labelimg);
		
		JLabel labelimg1=new JLabel("");
		Image pic1=new ImageIcon(this.getClass().getResource("/p13.jpg")).getImage();
		labelimg1.setIcon(new ImageIcon(pic1));
		labelimg1.setBounds(50,330,300,230);
		panel.add(labelimg1);
		
		
		
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
