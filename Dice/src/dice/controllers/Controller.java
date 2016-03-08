package dice.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dice.models.Model;
import dice.view.View;

public class Controller {
	private Model model;
	private View view;
	private ActionListener actionListener;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	public void control() 
	{
		actionListener = new ActionListener(){	
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{				
			generateRandom();
			int str2 = Integer.parseInt(view.U());
			
			int a = model.getX();
			
			
			if(a == 7 || a == 11){
				JOptionPane.showMessageDialog(null,"You win. The number is:" + a + ", You won £" + str2);
			}
			else{
				JOptionPane.showMessageDialog(null, "You loose. The number is: " + a + ", You lost £ " + str2);
			}
			
		}
		};
	view.getButton().addActionListener(actionListener);
	
	}	

	private void generateRandom() {
		model.randNum(); //calls the method randNum from the class Model
	}
	

}
