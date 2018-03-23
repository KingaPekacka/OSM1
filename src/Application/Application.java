package Application;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Frames.DataFrame;
import Frames.DataPanel;
import Frames.ExaminationPanel;
import Frames.ListPanel;

public class Application extends JFrame //implements ActionListener 
{
	static final long serialVersionUID = 1L;
	public Application () 
	{
		//initialize GUI
		
		this.setTitle("Rejestracja wyników badañ");
		//add exit 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add size
		this.setSize(1000,1000);
		this.setMenu();
		
		//bananie = new ExaminationPanel();
		getContentPane().add(new ListPanel());
		
		
		//srodek aplikacji
//		JPanel applicationPanel= new JPanel();
//		applicationPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
//		
//		GroupLayout applicationGroupLayout = new GroupLayout(applicationPanel);
//		applicationPanel.setLayout(applicationGroupLayout);
//		
//		this.getContentPane().add(applicationPanel); //dodanie panelu glownego do okna aplikacji
//		
//		applicationGroupLayout.setAutoCreateGaps(true);
//		//
//		applicationGroupLayout.setHorizontalGroup(applicationGroupLayout.createSequentialGroup()
//				.addGroup(applicationGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//						.addComponent(new DataPanel())           //?????????????????????????????????????
//						.addComponent(new ExaminationPanel()))
//				.addGroup(applicationGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//						.addComponent(new ListPanel())));
//		applicationGroupLayout.setVerticalGroup(applicationGroupLayout.createSequentialGroup()
//				.addGroup(applicationGroupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
//						.addComponent(dataPanel)
//						.addComponent(ListPanel)));
		
				
						
	//	getContentPane().add(new DataFrame());  
		
		
		
		
	}
/*	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getActionCommand().equals("Zamknij"))
		{
			JoptionPane.
		}*/
	
	//metoda dodajaca ramkê dane pacjenta do glównej aplikacji
/*	private void setDataFrame()
	{}
	
	//metoda dodaj¹ca ramkê badanie do g³ownej aplikacji
	private void setExaminationFrame()
	{}
	
	//metoda dodaj¹ca listê pacjentów do g³ownej aplikacji
	private void setListFrame()
	{}*/
	private void setMenu()
	{
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		menuBar.setVisible(true);
		
		//dodanie menu "Aplikacja"
		JMenu menu = new JMenu ("Aplikacja");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Zamknij");
		//menuItem.addActionListener(this);
		menu.add(menuItem);
		
	}
	
	public static void main(String[] args) 
	{
		Runnable thread = new Runnable()
		{
			public void run ()
			{
				//crate GUI
				Application app = new Application();
				//show GUI
				app.setVisible(true);
			}
		};
		SwingUtilities.invokeLater(thread);
		
	}
}



