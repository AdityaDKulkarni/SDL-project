package Design;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
/*import assets.*;
import custom.HintTextArea;
import global.Globals;
import sql.SQLHelper; */

import java.io.IOException;

public class page3 extends JFrame {

	JFrame frame;
	JPanel panel;  
	JLabel lblCause,lblAvgAge,lblBudget,lblFoodPrefer,lblMenu,lblExtraItem,lblApproxCost;
	JTextField tfPurposeCause,tfAge,tfBudget,TextFieldApprox;
	JTextArea taMenu;
	JComboBox<String> comboFoodPref;
	JCheckBox chkSweets,chkDrinks,chkCake;
	JButton btnNext;

	public page3()
	{
		frame=new JFrame("Event details");
		makeFrameFullSize();
		panel=(JPanel)frame.getContentPane();
		panel.setLayout(null);
		panel.setBackground(new Color(100,130,230));

		JLabel labelimg=new JLabel("");
		Image pic3=new ImageIcon(this.getClass().getResource("/p3.jpg")).getImage();
		labelimg.setIcon(new ImageIcon(pic3));
		labelimg.setBounds(20,10,1230,230);
		
		lblCause=new JLabel("Cause of the event");
		lblCause.setFont(new Font("Arial",Font.BOLD,14));
		lblCause.setBounds(50,270,200,20);
		lblCause.setForeground(Color.WHITE);

		tfPurposeCause=new JTextField(60);
		tfPurposeCause.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfPurposeCause.setBounds(300,270,220,20);
		tfPurposeCause.setFont(new Font("Arial",Font.PLAIN,14));
		tfPurposeCause.setBackground(new Color(205,255,250));

		lblAvgAge=new JLabel("Average age group of people");
		lblAvgAge.setFont(new Font("Arial",Font.BOLD,14));
		lblAvgAge.setBounds(50,320,250,20);
		lblAvgAge.setForeground(Color.WHITE);
		
		tfAge=new JTextField(60);
		tfAge.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfAge.setBounds(300,320,90,20);
		tfAge.setFont(new Font("Arial",Font.PLAIN,14));
		tfAge.setBackground(new Color(205,255,250));

		lblBudget=new JLabel("Budget per plate:");
		lblBudget.setFont(new Font("Arial",Font.BOLD,14));
		lblBudget.setBounds(50,370,150,20);
		lblBudget.setForeground(Color.WHITE);

		tfBudget=new JTextField(60);
		tfBudget.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfBudget.setBounds(300,370,90,20);
		tfBudget.setFont(new Font("Arial",Font.PLAIN,14));
		tfBudget.setBackground(new Color(205,255,250));

		lblFoodPrefer=new JLabel("Food preference:");
		lblFoodPrefer.setFont(new Font("Arial",Font.BOLD,14));
		lblFoodPrefer.setBounds(50,420,160,20);
		lblFoodPrefer.setForeground(Color.WHITE);
		
		comboFoodPref=new JComboBox<String>();

		comboFoodPref.addItem("Indian Cuisine");
		comboFoodPref.addItem("Chinese");
		comboFoodPref.addItem("Continental");
		comboFoodPref.addItem("Mexican");
		comboFoodPref.setFont(new Font("Arial",Font.PLAIN,14));
		comboFoodPref.setBounds(300,420,130,20);

		lblMenu=new JLabel("Menu:");
		lblMenu.setFont(new Font("Arial",Font.BOLD,14));
		lblMenu.setBounds(50,470,50,20);
		lblMenu.setForeground(Color.WHITE);

		//taMenu=new HintTextArea("Enter menu items seperated by comma");
		taMenu=new JTextArea("Enter Menu Items seperated by comma");
		taMenu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		taMenu.setFont(new Font("Arial",Font.PLAIN,14));
		taMenu.setBounds(300,470,300,70);
		taMenu.setBackground(new Color(205,255,250));

		btnNext=new JButton("Next");
		btnNext.setMnemonic('N');
		btnNext.setToolTipText("Click Here");
		btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNext.setFont(new Font("Arial",Font.BOLD,14));
		btnNext.setBounds(250,590,170,23);
		btnNext.setBackground(new Color(200,240,250));
		btnNext.setForeground(Color.BLACK);
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			/*	try {
					Globals.details.setPurpose(tfPurposeCause.getText().toString());
					Globals.details.setAgeGroup(Integer.parseInt(tfAge.getText().toString()));
					Globals.details.setPlateBudget(tfBudget.getText().toString());
					Globals.details.setFoodPreference(comboFoodPref.getSelectedItem().toString());
					Globals.details.setMenu(taMenu.getText().toString());
					frame.dispose();
					Page4 name = new Page4();
				}catch(Exception e1) {
					e1.printStackTrace();
					Page4 name = new Page4();
				} */
				
				new Pg4();
			}
		});

		panel.add(labelimg);
		panel.add(lblCause);
		panel.add(lblAvgAge);
		panel.add(lblBudget);
		panel.add(tfPurposeCause);
		panel.add(tfAge);
		panel.add(tfBudget);
		panel.add(comboFoodPref);
		panel.add(lblFoodPrefer);
		panel.add(lblMenu);
		panel.add(taMenu);
		panel.add(btnNext);

		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);

	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}

	public static void main(String[] args) {
		page3 page3 = new page3();
	}
}
