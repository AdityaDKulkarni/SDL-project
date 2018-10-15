//package ui;
package Design;
import javax.swing.*;
//import assets.*;
//import sql.SQLHelper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class page1 {
	
	JFrame frame; 
	JPanel panel,panel1;  
	JLabel labelImg1,labelImg2,labelImg3,labelImg4,labelImg5,labelImg6,labelImg7,labelImg8,lblBday,lblDance,lblWedding;
    JButton btnManage;
  
    JLabel img;
	
	page1() {
	    frame=new JFrame("Work Gallery");
		makeFrameFullSize();
				
		panel=(JPanel)frame.getContentPane();
		panel.setLayout(null);
		
		JLabel labellogo=new JLabel("");
		Image Logo=new ImageIcon(this.getClass().getResource("/Logo.jpg")).getImage();
		labellogo.setIcon(new ImageIcon(Logo));
		labellogo.setBounds(470,10,340,140);
		
		
		JLabel labelImg2=new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/img2.jpg")).getImage();
		labelImg2.setIcon(new ImageIcon(img2));
		labelImg2.setBounds(100,160,226,150);
		
		JLabel labelImg3=new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/img4.jpg")).getImage();
		labelImg3.setIcon(new ImageIcon(img3));
		labelImg3.setBounds(370,160,226,150);
		
		JLabel labelImg4=new JLabel("");
		Image img4=new ImageIcon(this.getClass().getResource("/img5.jpg")).getImage();
		labelImg4.setIcon(new ImageIcon(img4));
		labelImg4.setBounds(650,160,220,150);
		
		JLabel labelImg5=new JLabel("");
		Image img5=new ImageIcon(this.getClass().getResource("/img7.jpg")).getImage();
		labelImg5.setIcon(new ImageIcon(img5));
		labelImg5.setBounds(925,160,225,150);
		
		JLabel labelImg6=new JLabel("");
		Image img6=new ImageIcon(this.getClass().getResource("/img8.jpg")).getImage();
		labelImg6.setIcon(new ImageIcon(img6));
		labelImg6.setBounds(50,350,300,225);
		
		JLabel lblBday=new JLabel("Weddings");
		lblBday.setBounds(50,580,150,15);
		lblBday.setFont(new Font("Arial",Font.BOLD,14));
		lblBday.setForeground(Color.WHITE);
			
		JLabel labelImg7=new JLabel("");
		Image img7=new ImageIcon(this.getClass().getResource("/img3.jpg")).getImage();
		labelImg7.setIcon(new ImageIcon(img7));
		labelImg7.setBounds(850,350,300,225);	
		
		JLabel lblWedding=new JLabel("Birthday Celebration");
		lblWedding.setBounds(850,580,200,15);
		lblWedding.setFont(new Font("Arial",Font.BOLD,14));
		lblWedding.setForeground(Color.WHITE);
		
		
		JLabel labelImg8=new JLabel("");
		Image img8=new ImageIcon(this.getClass().getResource("/img6.jpg")).getImage();
		labelImg8.setIcon(new ImageIcon(img8));
		labelImg8.setBounds(450,350,300,225);	
		
		JLabel lblDance=new JLabel("Classical Events");
		lblDance.setBounds(450,580,150,15);
		lblDance.setFont(new Font("Arial",Font.BOLD,14));
		lblDance.setForeground(Color.WHITE);
		
		JButton btnManage = new JButton("Manage my Event");
		btnManage.setBounds(300, 620, 170, 23);
		btnManage.setFont(new Font("Arial",Font.BOLD,14));
		
		btnManage.setBackground(new Color(200,240,250));
		btnManage.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnManage.setMnemonic('M');
	//	btnManage.addActionListener(this);
		panel.setBackground(new Color(153,255,255));
		
		JButton btnView = new JButton("View Records");
		btnView.setBounds(700, 620, 170, 23);
		btnView.setFont(new Font("Arial",Font.BOLD,14));
		
		btnView.setBackground(new Color(200,240,250));
		btnView.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnView.setMnemonic('V');
	//	btnView.addActionListener(this);
		
		btnManage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Pg2 pg2 = new Pg2();
				frame.dispose();
				//SQLHelper.connect();
			}
		});
		
		
	   
		
		panel.add(labellogo);
		panel.add(labelImg2);
		panel.add(labelImg3);
		panel.add(labelImg4);
		panel.add(labelImg5);
		panel.add(labelImg6);
		panel.add(labelImg7);
		panel.add(labelImg8); 
		panel.add(lblBday);
		panel.add(lblDance);
		panel.add(lblWedding);
		panel.add(btnManage);
		panel.add(btnView);
	
		
		panel.setBackground(new Color(100,130,230));
		
		frame.setVisible(true);
		
	}
	
	
	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

	public static void main(String a[]) {
		 new page1();
		 
	}
	
	
}
