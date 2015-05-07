import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Calculator_2 extends JFrame {
	private JPanel p;
	Double result = null;
	String number1 = "";
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

		text.setText("");
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
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "0";
				text.setText(number1);

			}
		});
		b1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "1";
				text.setText(number1);

			}
		});
		b2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "2";
				text.setText(number1);
			}
		});
		b3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "3";
				text.setText(number1);
			}
		});
		b4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "4";
				text.setText(number1);
			}
		});
		b5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "5";
				text.setText(number1);
			}
		});
		b6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "6";
				text.setText(number1);
			}
		});
		b7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "7";
				text.setText(number1);
			}
		});
		b8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "8";
				text.setText(number1);
			}
		});
		b9.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if after "=" is typed a digit, then restart all:
				if (action == '=') {
					result = null;
				}
				number1 = number1 + "9";
				text.setText(number1);
			}
		});

		// set action
		sum.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				action = '+';
				if (number1 == "") {
					return;
				}
				// if point on tail
				if (number1.indexOf(".") == number1.length() - 1) {
					// then concatenate to it 0
					number1 += "0";
				}
				// and continue
				if (result == null) {
					result = Double.parseDouble(number1);
					number1 = "";
				} else {
					result += Double.parseDouble(number1);
					number1 = "";
					// if 0 after point then type casted to integer
					if (result - result.intValue() == 0.0) {
						text.setText(String.valueOf(result.intValue()));
					} else {
						text.setText(String.valueOf(result));
					}
				}

			}
		});
		sub.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				action = '-';
				if (number1 == "") {
					return;
				}
				// if point on tail
				if (number1.indexOf(".") == number1.length() - 1) {
					// then concatenate to it 0
					number1 += "0";
				}
				// and continue
				if (result == null) {
					result = Double.parseDouble(number1);
					number1 = "";
				} else {
					result -= Double.parseDouble(number1);
					number1 = "";
					// if 0 after point then type casted to integer
					if (result - result.intValue() == 0.0) {
						text.setText(String.valueOf(result.intValue()));
					} else {
						text.setText(String.valueOf(result));
					}
				}
			}
		});

		multiple.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				action = '*';
				if (number1 == "") {
					return;
				}
				// if point on tail
				if (number1.indexOf(".") == number1.length() - 1) {
					// then concatenate to it 0
					number1 += "0";
				}
				// and continue
				if (result == null) {
					result = Double.parseDouble(number1);
					number1 = "";
				} else {
					result += Double.parseDouble(number1);
					number1 = "";
					// if 0 after point then type casted to integer
					if (result - result.intValue() == 0.0) {
						text.setText(String.valueOf(result.intValue()));
					} else {
						text.setText(String.valueOf(result));
					}
				}

			}
		});
		division.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				action = '/';
				if (number1 == "") {
					return;
				}
				// if point on tail
				if (number1.indexOf(".") == number1.length() - 1) {
					// then concatenate to it 0
					number1 += "0";
				}
				// and continue
				if (result == null) {
					result = Double.parseDouble(number1);
					number1 = "";
				} else {
					result += Double.parseDouble(number1);
					number1 = "";
					// if 0 after point then type casted to integer
					if (result - result.intValue() == 0.0) {
						text.setText(String.valueOf(result.intValue()));
					} else {
						text.setText(String.valueOf(result));
					}
				}

			}
		});
		equal.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				if (number1 == "") {
					action = '=';
					return;
				}
				// if point on tail
				if (number1.indexOf(".") == number1.length() - 1) {
					// then concatenate to it 0
					number1 += "0";
				}
				// and continue
				switch (action) {
				case '+':
					result += Double.parseDouble(number1);
					break;
				case '-':
					result -= Double.parseDouble(number1);
					break;
				case '*':
					result *= Double.parseDouble(number1);
					break;
				case '/':
					result /= Double.parseDouble(number1);
				}

				// if 0 after point then type casted to integer
				if (result - result.intValue() == 0.0) {
					text.setText(String.valueOf(result.intValue()));
				} else {
					text.setText(String.valueOf(result));
				}
				number1 = "";
				action = '=';
			}
		});

		clear.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// set start values
				result = null;
				action = '=';
				number1 = "";
				text.setText("");
			}
		});

		point.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// if it is the first clicked button
				if (action == '$' && number1 == "") {
					number1 = "0.";
					text.setText(number1);
					return;
				}
				// if is not first, but number1 is empty because '.' clicked
				// after any action
				if (number1 == "") {
					return;
				}
				// if number is already rational
				if (number1.indexOf(".") != -1) {
					return;
				}
				// else concatenate a point to number1
				number1 += ".";
				text.setText(number1);

			}
		});
	}

}
