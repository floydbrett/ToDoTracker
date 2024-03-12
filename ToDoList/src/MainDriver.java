import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainDriver {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		JPanel topPanel = new JPanel();
		JLabel title = new JLabel();
		
		topPanel.setBackground(Color.DARK_GRAY);
		topPanel.setPreferredSize(new Dimension(150, 80));
		
		title.setText("To Do List");
		title.setForeground(Color.white);
		title.setFont(new Font("Times New Roman", Font.BOLD, 45));
		topPanel.add(title);
		
		frame.add(topPanel, BorderLayout.NORTH);
		
		JPanel bodyPanel = new JPanel();
		
		bodyPanel.setBackground(Color.lightGray);
		bodyPanel.setPreferredSize(new Dimension(750,500));
		
		frame.add(bodyPanel);
		
		frame.pack();
		

	}

}
