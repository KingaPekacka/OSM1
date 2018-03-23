package Frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DataFrame extends JPanel implements ActionListener
{
	public DataFrame() 
	{
		//panel dane pacjenta
		JPanel dataPanel = new JPanel();
		
		dataPanel.setLayout(new BorderLayout());
		dataPanel.setBackground(Color.WHITE);
		dataPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		dataPanel.setBorder(BorderFactory.createTitledBorder("Dane Pacjenta"));
		dataPanel.setLayout(new BoxLayout(dataPanel,BoxLayout.Y_AXIS));

		//this.getContentPane().add(dataPanel); //dodanie panelu glownego do okna aplikacji
		
		//panel imie
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new BoxLayout (namePanel, BoxLayout.X_AXIS));
		dataPanel.add(namePanel);
		
		//napis imie
		JLabel nameLabel = new JLabel("Imiê:");
		nameLabel.setPreferredSize(new Dimension(90,25));
		nameLabel.setMaximumSize(new Dimension(90,25));
		nameLabel.setMinimumSize(new Dimension(90,25));
		namePanel.add(nameLabel);
		
		namePanel.add(Box.createHorizontalGlue());
		
		//pole tekstowe
		JTextField nameTextField = new JTextField();
		nameTextField.setPreferredSize(new Dimension(180,20));
		nameTextField.setMaximumSize(new Dimension(180,20));
		nameTextField.setMinimumSize(new Dimension(180,20));
		namePanel.add(nameTextField);

		//panel nazwisko
		JPanel surnamePanel = new JPanel();
		surnamePanel.setLayout(new BoxLayout(surnamePanel, BoxLayout.X_AXIS));
		dataPanel.add(surnamePanel);
		
		//napis naziwsko
	    JLabel surnameLabel = new JLabel( "Nazwisko:" );
	    surnameLabel.setPreferredSize(new Dimension(90,25));
	    surnameLabel.setMinimumSize(new Dimension(90,25));	    
	    surnameLabel.setMaximumSize(new Dimension(90,25));
	    surnamePanel.add(surnameLabel);
	    
	    //pole tekstowe
	    
	    JTextField surnameTextField = new JTextField();
	    surnameTextField.setPreferredSize(new Dimension(180,20));
	    surnameTextField.setMinimumSize(new Dimension(180,20));
	    surnameTextField.setMaximumSize(new Dimension(180,20));
	    surnamePanel.add(surnameTextField);
		
		//panel PESEL
		JPanel peselPanel = new JPanel();
		peselPanel.setLayout(new BoxLayout(peselPanel, BoxLayout.X_AXIS));
		dataPanel.add(peselPanel);
		
		//napis pesel
	    JLabel peselLabel = new JLabel( "PESEL:" );
	    peselLabel.setPreferredSize(new Dimension(90,25));
	    peselLabel.setMinimumSize(new Dimension(90,25));	    
	    peselLabel.setMaximumSize(new Dimension(90,25));
	    peselPanel.add(peselLabel);
	    
	    //pole tekstowe
	    
	    JTextField peselTextField = new JTextField();
	    peselTextField.setPreferredSize(new Dimension(180,20));
	    peselTextField.setMinimumSize(new Dimension(180,20));
	    peselTextField.setMaximumSize(new Dimension(180,20));
	    peselPanel.add(peselTextField);
	    
	    
	    //panel P³eæ:
	    JPanel malePanel = new JPanel();
	    malePanel.setLayout(new BoxLayout(malePanel, BoxLayout.X_AXIS));
	    dataPanel.add(malePanel);
	    malePanel.add(Box.createHorizontalGlue());
	    
	    //napis P³eæ
	    JLabel maleLabel = new JLabel( "P³eæ:" );
	    maleLabel.setPreferredSize(new Dimension(90,25));
	    maleLabel.setMinimumSize(new Dimension(90,25));	    
	    maleLabel.setMaximumSize(new Dimension(90,25));
	    malePanel.add(maleLabel);
	    
	    //wybór p³ci
		JRadioButton femaleButton = new JRadioButton("Kobieta");
		malePanel.add(femaleButton);
		JRadioButton maleButton = new JRadioButton("Mê¿czyzna");
		malePanel.add(maleButton);
	    
		//panel Ubezpieczenie:
		JPanel insurancePanel = new JPanel();
	    insurancePanel.setLayout(new BoxLayout(insurancePanel, BoxLayout.X_AXIS));
	    dataPanel.add(insurancePanel);
	    insurancePanel.add(Box.createHorizontalGlue());
	    
	    //napis ubezpieczenie:
	    JLabel insuranceLabel = new JLabel( "Ubezpieczenie:" );
	    insuranceLabel.setPreferredSize(new Dimension(90,25));
	    insuranceLabel.setMinimumSize(new Dimension(90,25));	    
	    insuranceLabel.setMaximumSize(new Dimension(90,25));
	    //insuranceLabel.setHorizontalAlignment(JLabel.LEFT);
	    insurancePanel.add(insuranceLabel);
	    
	    //wybór ubezpieczenia:
		String[] insuranceString = {"NFZ", "Prywanie", "Brak"};
		JComboBox insuranceComboBox= new JComboBox(insuranceString);
		insuranceComboBox.setPreferredSize(new Dimension(90,25));
		insuranceComboBox.setMaximumSize(new Dimension(90,25));
		insuranceComboBox.setMinimumSize(new Dimension(90,25));
		insurancePanel.add(insuranceComboBox);
		
		//zapisz anuluj
		JPanel saveandcancelPanel = new JPanel();
		saveandcancelPanel.setLayout(new BoxLayout(saveandcancelPanel, BoxLayout.X_AXIS));
	   // saveandcancelPanel.add(Box.createHorizontalGlue());
		saveandcancelPanel.add(new JButton("Zapisz"));
		saveandcancelPanel.add(new JButton("Anuluj"));
		dataPanel.add(saveandcancelPanel);
		

		//title 
		//this.setTitle("Dane pacjenta");
		//add exit 
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add size
		//this.pack(); //dostosowanie rozmiaru okna do jego komponentow

	}
	public static void startDataPanel()
	{
		Runnable thread = new Runnable()
		{
			public void run ()
			{
				//crate GUI
				DataFrame app = new DataFrame();
				//show GUI
				app.setVisible(true);
			}
		};
		SwingUtilities.invokeLater(thread);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
