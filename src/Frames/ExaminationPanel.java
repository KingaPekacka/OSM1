package Frames;
import javax.swing.*;
import java.awt.*;

public class ExaminationPanel extends JPanel
{
	public ExaminationPanel()
	{
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		setBorder(BorderFactory.createTitledBorder("Badanie"));
		
	}
	
	 /*
		public  ListFrame(JFrame parentFrame, boolean modal)
		{
		 super (parentFrame, modal);// okro modalne
		 this.setDefaultCloseOperation(DataFrame.DISPOSE_ON_CLOSE);
		 this.setDefaultCloseOperation(ExaminationFrame.DISPOSE_ON_CLOSE);
		}*/

}
