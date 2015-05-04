import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;


public class Calculator_2 extends JFrame{
	private JPanel p;
	double result = 0;
	String number1 = "";
	String number2 = "" ;
	boolean n1 = false;
	boolean n2 = false;
	char action = '$';
	JTextField text = new JTextField(20);

	// digits
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");

	// actions
	JButton sum = new JButton("+");
	JButton sub = new JButton("-");
	JButton multiple = new JButton("*");
	JButton division = new JButton("/");
	JButton equal = new JButton("=");
	JButton clear = new JButton("C");
	JButton point = new JButton(".");

	public Calculator_2() {

		super("Calculator");
		setSize(250, 200);
		p = new JPanel();

		this.getContentPane().add(p);

		addButtons();
		addActionListenersToButtons();
        
		text.setText(String.valueOf(result));
		// text.setSize(150, 50);

	}

	private void addButtons() {
		p.add(text);
		p.add(sum);
		p.add(sub);
		p.add(multiple);
		p.add(division);
		p.add(equal);
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(clear);
		p.add(point);
	}

	private void addActionListenersToButtons() {
		
		b0.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if no action before, then concatenate 0 to result
				if(action == '$'){
				number1 = number1 + "0";
				n1 = true;
				n2 = false;
				text.setText(number1);
				}
				else {
					
					number2 = number2 + "0";
					n2 = true;
					n1 = false;
					text.setText(number2);
					
				}
			}
		});
		b1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if no action before, then concatenate 0 to result
				if(action == '$'){
					number1 = number1 + "1";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "1";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
				
			}
		});
		b2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(action == '$'){
					number1 = number1 + "2";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "2";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
				
			}
		});
		b3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(action == '$'){
					number1 = number1 + "3";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "3";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
				
			}
		});
		b4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(action == '$'){
					number1 = number1 + "4";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "4";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
				
			}
		});
		b5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(action == '$'){
					number1 = number1 + "5";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "5";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
				
			}
		});
		b6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(action == '$'){
					number1 = number1 + "6";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "6";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
				
			}
		});
		b7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(action == '$'){
					number1 = number1 + "7";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "7";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
				
			}
		});
		b8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(action == '$'){
					number1 = number1 + "8";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "8";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
			}
		});
		b9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if(action == '$'){
					number1 = number1 + "9";
					n1 = true;
					n2 = false;
					text.setText(number1);
					}
					else {
						number2 = number2 + "9";
						n2 = true;
						n1 = false;
						text.setText(number2);
					}
				
			}
		});
		
		
		//set action
		sum.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				action = '+';
			}
		});
		sub.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				action = '-';
			}
		});

		multiple.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				action = '*';
			}
		});
		division.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				action = '/';
			}
		});
		equal.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				
				switch (action) {
				case '+':
				 result += Double.parseDouble(number1) + Double.parseDouble(number2);
					break;
				case '-': 
					result -= Double.parseDouble(number1) - Double.parseDouble(number2);
					break;
				case '*':
					result *= Double.parseDouble(number1) * Double.parseDouble(number2);
					break;
				case '/':
					result /= Double.parseDouble(number1) / Double.parseDouble(number2);
				}
				
				text.setText(String.valueOf(result));
				number1 = "0";
				number2 = "";
			}
		});

		clear.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
			//set start values	
			result = 0;
			action = '$';
			number1 = "";
			number2 = "";
			text.setText("0");
			}
		});
		
		point.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
			//if n1= true => we on number1 and set point to it
			if(n1 == true){
				number1 += ".";
				text.setText(number1);
			}
			if(n2 == true){
				number2 += ".";
				text.setText(number2);
			}
			
			}
		});	
}
}
