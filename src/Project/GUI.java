package Project;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calendar");
		frame.setBounds(100, 100, 500, 255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		JLabel label1 = new JLabel("Mon");
		label1.setBounds(18, 5, 30, 20);
		frame.add(label1);
		JLabel label2 = new JLabel("Tue");
		label2.setBounds(88, 5, 30, 20);
		frame.add(label2);
		JLabel label3 = new JLabel("Wed");
		label3.setBounds(158, 5, 30, 20);
		frame.add(label3);
		JLabel label4 = new JLabel("Thu");
		label4.setBounds(228, 5, 30, 20);
		frame.add(label4);
		JLabel label5 = new JLabel("Fri");
		label5.setBounds(298, 5, 30, 20);
		frame.add(label5);
		JLabel label6 = new JLabel("Sat");
		label6.setBounds(368, 5, 30, 20);
		frame.add(label6);
		JLabel label7 = new JLabel("Sun");
		label7.setBounds(438, 5, 30, 20);
		frame.add(label7);
		
		
		JPanel[][] WorkWeekPanels = new JPanel[5][6];
		
		int x = 5;
		
		for(int i = 0; i < WorkWeekPanels.length; i++)
		{
			int y = 30;
			
			for(int j = 0; j < WorkWeekPanels[i].length; j++)
			{
				WorkWeekPanels[i][j] = new JPanel();
				WorkWeekPanels[i][j].setBounds(x, y, 50, 20);
				WorkWeekPanels[i][j].setBackground(Color.white);
				frame.add(WorkWeekPanels[i][j]);
				y += 30;
			}
			x += 70;
		}
		frame.repaint();
		
		JPanel[][] WeekendPanels = new JPanel[2][6];
		
		int a = 355;
		
		for(int i = 0; i < WeekendPanels.length; i++)
		{
			int y = 30;
			
			for(int j = 0; j < WeekendPanels[i].length; j++)
			{
				WeekendPanels[i][j] = new JPanel();
				WeekendPanels[i][j].setBounds(a, y, 50, 20);
				WeekendPanels[i][j].setBackground(Color.black);
				frame.add(WeekendPanels[i][j]);
				y += 30;
			}
			a += 70;
		}
		frame.repaint();
	}
}
