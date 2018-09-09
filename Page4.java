package ui;

import javax.swing.*;

import global.Globals;

import java.awt.*;
import java.awt.event.*;

class Page4 implements ActionListener
{
	private JFrame frame;
	private JTextField textFieldEntShows;
	private JTextField textFieldCeleb;
	private JTextField textFieldAmount,textFieldDance,textFieldSLang ,textFieldMLang ;
	JButton btnEnd,btnQuit,btnViewSummaryOf;

	JPanel p1;

	Page4()
	{

		frame = new JFrame("Event Details");

		makeFrameFullSize();
		p1=(JPanel)frame.getContentPane();
		p1.setLayout(null);


		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblDetailsOfEvent = new JLabel("Details of Event");
		lblDetailsOfEvent.setBounds(316, 22, 190, 14);
		lblDetailsOfEvent.setFont(new Font("Arial",Font.BOLD,18));
		frame.add(lblDetailsOfEvent);

		JLabel lblTypesOfEntertainment = new JLabel("Types of entertainment shows needed :");
		lblTypesOfEntertainment.setBounds(40, 55, 340, 20);
		lblTypesOfEntertainment.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(lblTypesOfEntertainment);

		textFieldEntShows = new JTextField();
		textFieldEntShows.setBounds(395, 55, 260, 20);
		frame.getContentPane().add(textFieldEntShows);
		textFieldEntShows.setColumns(10);
		textFieldEntShows.setBackground(new Color(245,255,250));

		JCheckBox chckbxDance = new JCheckBox("Dance");
		chckbxDance.setBounds(51, 94, 90, 23);
		chckbxDance.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxDance);
		chckbxDance.setBackground(new Color(215,255,230));

		JComboBox comboBoxDance = new JComboBox();
		comboBoxDance.setBounds(160, 94, 142, 23);
		comboBoxDance.addItem("Classical");
		comboBoxDance.addItem("Bollywood");
		comboBoxDance.addItem("Folk");
		comboBoxDance.addItem("Western");
		comboBoxDance.addItem("None");
		comboBoxDance.setBackground(new Color(215,255,230));
		frame.getContentPane().add(comboBoxDance);
		

		

		JCheckBox chckbxSkit = new JCheckBox("Skit");
		chckbxSkit.setBounds(51, 140, 90, 23);
		chckbxSkit.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxSkit);
		chckbxSkit.setBackground(new Color(215,255,230));

		JComboBox comboBoxSkit = new JComboBox();
		comboBoxSkit.setBounds(160, 140, 142, 23);
		comboBoxSkit.addItem("Mimicry");
		comboBoxSkit.addItem("Funny");
		comboBoxSkit.addItem("Social Awareness");
		comboBoxSkit.addItem("None");
		comboBoxSkit.setBackground(new Color(215,255,230));
		frame.getContentPane().add(comboBoxSkit);

		

		JCheckBox chckbxMusic = new JCheckBox("Music");
		chckbxMusic.setBounds(51,190, 90, 23);
		chckbxMusic.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxMusic);
		chckbxMusic.setBackground(new Color(215,255,230));

		
		JComboBox comboBoxMusic = new JComboBox();
		comboBoxMusic.setBounds(160, 190, 142, 23);
		comboBoxMusic.addItem("Orchestra");
		comboBoxMusic.addItem("Fusion");
		comboBoxMusic.addItem("Instrumental");
		comboBoxMusic.addItem("None");
		comboBoxMusic.setBackground(new Color(215,255,230));
		frame.getContentPane().add(comboBoxMusic);

		
		JLabel lblCelebrityAppointment = new JLabel("Celebrity Preferred:");
		lblCelebrityAppointment.setBounds(40, 256, 190, 14);
		lblCelebrityAppointment.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(lblCelebrityAppointment);

		textFieldCeleb = new JTextField();
		textFieldCeleb.setBounds(245, 256, 200, 20);
		frame.getContentPane().add(textFieldCeleb);
		textFieldCeleb.setColumns(10);
		textFieldCeleb.setBackground(new Color(245,255,250));


		JLabel lblEArrangements = new JLabel("Any extra arrangements needed:");
		lblEArrangements.setBounds(40, 309, 270, 20);
		lblEArrangements.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add( lblEArrangements);

		JTextArea textAreaEArrangement = new JTextArea();
		textAreaEArrangement.setColumns(6);
		textAreaEArrangement.setRows(4);
		textAreaEArrangement.setBounds(360, 309, 300, 53);
		frame.getContentPane().add(textAreaEArrangement);
		textAreaEArrangement.setBackground(new Color(245,255,250));


		JCheckBox chckbxVideoPresentation = new JCheckBox("Video Presentation");
		chckbxVideoPresentation.setBounds(40, 424, 190, 23);
		chckbxVideoPresentation.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxVideoPresentation);
		chckbxVideoPresentation.setBackground(new Color(215,255,230));

		JCheckBox chckbxSpecialArtistsFor = new JCheckBox("Special artists for entertainment shows");
		chckbxSpecialArtistsFor.setBounds(325, 424, 350, 23);
		chckbxSpecialArtistsFor.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxSpecialArtistsFor);
		chckbxSpecialArtistsFor.setBackground(new Color(215,255,230));

		JLabel lblExtraRequirements = new JLabel("Extra requirements");
		lblExtraRequirements.setFont(new Font("Arial",Font.BOLD,14));
		lblExtraRequirements.setBounds(181, 387, 235, 14);
		frame.getContentPane().add(lblExtraRequirements);

		JCheckBox chckbxPhotographer = new JCheckBox("Photographer");
		chckbxPhotographer.setBounds(40, 477, 140, 23);
		chckbxPhotographer.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(chckbxPhotographer);
		chckbxPhotographer.setBackground(new Color(215,255,230));


		/*JLabel lblAmount = new JLabel("Amount");
			lblAmount.setBounds(755, 32, 58, 20);
			lblAmount.setFont(new Font("Arial",Font.BOLD,14));
			frame.getContentPane().add(lblAmount);



			textFieldAmount = new JTextField();
			textFieldAmount.setBounds(730, 60, 108, 20);
			frame.getContentPane().add(textFieldAmount);
			textFieldAmount.setColumns(10);
			textFieldAmount.setEditable(false);
			textFieldAmount.setBackground(new Color(245,255,250));  */


		JButton btnEnd = new JButton("FINISH");
		btnEnd.setBounds(117, 600, 89, 23);
		btnEnd.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(btnEnd);
		btnEnd.setBackground(new Color(30,180,255));
		btnEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnEnd.setMnemonic('F');
		btnEnd.addActionListener(this);

		JButton btnQuit = new JButton("QUIT");
		btnQuit.setBounds(269, 600, 89, 23);
		btnQuit.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(btnQuit);
		btnQuit.setBackground(new Color(30,180,255));
		btnQuit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnQuit.setMnemonic('Q');
		btnQuit.addActionListener(this);

		JButton btnViewSummaryOf = new JButton("View summary of my event");
		btnViewSummaryOf.setBounds(425, 600, 260, 23);
		btnViewSummaryOf.setFont(new Font("Arial",Font.BOLD,14));
		frame.getContentPane().add(btnViewSummaryOf);
		btnViewSummaryOf.setBackground(new Color(30,180,255));
		btnViewSummaryOf.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnViewSummaryOf.setMnemonic('V');
		btnViewSummaryOf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(Globals.details.getEventId());
				System.out.println(Globals.details.getName());
				System.out.println(Globals.details.getPhone());
				System.out.println(Globals.details.getEmail());
				System.out.println(Globals.details.getTypeOfEvent());
				System.out.println(Globals.details.getScale());
				System.out.println(Globals.details.getDate());
				System.out.println(Globals.details.getBudget());
				System.out.println(Globals.details.getAvgNoOfPeople());
				System.out.println(Globals.details.getVenue());
			}
		});


		p1.setBackground(new Color(153,255,255));
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==btnEnd ){

		}/*else{
			System.exit(0);
		}*/
	}

	private void makeFrameFullSize(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
	}
	
	public static void main(String[] args) {
		Page4 page4 = new Page4();
	}
}
