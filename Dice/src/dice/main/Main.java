package dice.main;

import javax.swing.SwingUtilities;

import dice.controllers.Controller;
import dice.models.*;
import dice.view.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Model model = new Model(0);
				View view = new View("Enter yout bet: ");
				Controller controller = new Controller(model,view);
				controller.control();
			}
		});
		

	}

}
