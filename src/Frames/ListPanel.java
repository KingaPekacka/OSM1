package Frames;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Class.Model;


public class ListPanel extends JPanel //implements 
{

	protected JTable table;
	protected DefaultTableModel tableModel;
	
	public ListPanel()
	{
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		setBorder(BorderFactory.createTitledBorder("Lista pacjentów"));
		
		String columns[] = {"Imie", "Nazwisko"};
		
		String patients[][] = Model.getInstance().getAllPatientsAsArray(); //singleton
		
		tableModel = new DefaultTableModel(patients, columns);
		table = new JTable(tableModel);
		table.setFillsViewportHeight(true);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setPreferredScrollableViewportSize(new Dimension(1200, 600));
		table.setRowSelectionAllowed(true);
		table.setColumnSelectionAllowed(false);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		this.add(scrollPane);
	}
}






	
	 /*
		public  ListFrame(JFrame parentFrame, boolean modal)
		{
		 super (parentFrame, modal);// okro modalne
		 this.setDefaultCloseOperation(DataFrame.DISPOSE_ON_CLOSE);
		 this.setDefaultCloseOperation(ExaminationFrame.DISPOSE_ON_CLOSE);
		}*/

