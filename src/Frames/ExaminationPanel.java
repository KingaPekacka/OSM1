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
}
