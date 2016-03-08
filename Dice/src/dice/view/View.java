package dice.view;

import java.awt.BorderLayout;

import javax.swing.*;

public class View {
	private JFrame frame;
	private JLabel label;
	private JTextField textBox;
	private JButton button;

	public View(String text) {
		frame = new JFrame("One-Player Dice Game");
		frame.getContentPane().setLayout(new BorderLayout());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		
		//By default the frame is not displayed.  
		frame.setVisible(true);
		
		label = new JLabel(text);
		frame.getContentPane().add(label, BorderLayout.NORTH);
		
		//final JTextField userText = new JTextField(6);
		textBox = new JTextField(20);
		frame.getContentPane().add(textBox, BorderLayout.WEST);
		
		button = new JButton("Roll the dice");
		frame.getContentPane().add(button, BorderLayout.PAGE_END);
	
	}
	
	public JButton getButton() {
		return button;
	}
	
	public void setText(String text){
		label.setText(text);
	}
	
	public String U(){
		String str = textBox.getText();
		return str;
	}

}
