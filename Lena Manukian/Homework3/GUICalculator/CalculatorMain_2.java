import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class CalculatorMain_2 {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				Calculator_2 calc = new Calculator_2();
		
		           calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		           calc.setLocation(200,200);
		           //calc.setResizable(false);
		           calc.setVisible(true);

		}
		
	});
	}

}
