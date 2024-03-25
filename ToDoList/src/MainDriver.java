import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainDriver {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		
		JPanel topPanel = new JPanel();
		JLabel title = new JLabel();
		
		topPanel.setBackground(Color.DARK_GRAY);
		topPanel.setPreferredSize(new Dimension(150, 65));
		
		title.setText("To Do List");
		title.setForeground(Color.white);
		title.setFont(new Font("Times New Roman", Font.BOLD, 45));
		topPanel.add(title);
		
		frame.add(topPanel, BorderLayout.NORTH);
		
		JPanel bodyPanel = new JPanel();
		
		bodyPanel.setLayout(new BorderLayout());
		bodyPanel.setBackground(Color.lightGray);
		bodyPanel.setPreferredSize(new Dimension(750,500));
		
		JLabel enter = new JLabel();
		enter.setLayout(new FlowLayout());
		enter.setBackground(Color.DARK_GRAY);
		enter.setPreferredSize(new Dimension(600, 100));
		
		bodyPanel.add(enter, BorderLayout.CENTER);
		
		ImageIcon check = new ImageIcon("check.jpg");
		
		JButton button = new JButton();
		button.setPreferredSize(new Dimension(50, 50));

		
		/*
		JLabel instruction = new JLabel();
		instruction.setText("Input task names");
		instruction.setFont(new Font("Times New Roman", Font.BOLD, 25));
		bodyPanel.add(instruction, BorderLayout.NORTH);
		*/
		
		JTextField taskName = new JTextField();
		taskName.setPreferredSize(new Dimension(200, 50));	
		taskName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		enter.add(taskName);
		enter.add(button);
		
		frame.add(bodyPanel);
		
		frame.pack();
		
		frame.setVisible(true);
		

	}

}
