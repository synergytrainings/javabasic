package com.example;

import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame("Calculator");
		frame.setSize(377, 350);

		JPanel content = new JPanel(new GridLayout(1, 0));
		JPanel buttonarea = new JPanel();
		JPanel textarea = new JPanel(new GridLayout(1, 0));
		content.add(textarea);

		content.add(buttonarea);

		final JTextField enterhere = new JTextField();
		enterhere.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textarea.add(enterhere);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				enterhere
						.setText(enterhere.getText() + arg0.getActionCommand());

			}
		};

		JButton b0 = new JButton("0");
		b0.addActionListener(actionListener);
		buttonarea.add(b0);

		JButton b1 = new JButton("1");
		b1.addActionListener(actionListener);
		buttonarea.add(b1);

		JButton b2 = new JButton("2");
		b2.addActionListener(actionListener);
		buttonarea.add(b2);

		JButton b3 = new JButton("3");
		b3.addActionListener(actionListener);
		buttonarea.add(b3);

		JButton b4 = new JButton("4");
		b4.addActionListener(actionListener);
		buttonarea.add(b4);

		JButton b5 = new JButton("5");
		b5.addActionListener(actionListener);
		buttonarea.add(b5);

		JButton b6 = new JButton("6");
		b6.addActionListener(actionListener);
		buttonarea.add(b6);

		JButton b7 = new JButton("7");
		b7.addActionListener(actionListener);
		buttonarea.add(b7);

		JButton b8 = new JButton("8");
		b8.addActionListener(actionListener);
		buttonarea.add(b8);

		JButton b9 = new JButton("9");
		b9.addActionListener(actionListener);
		buttonarea.add(b9);

		JButton b10 = new JButton(" * ");
		b10.addActionListener(actionListener);
		buttonarea.add(b10);

		JButton b11 = new JButton(" + ");
		b11.addActionListener(actionListener);
		buttonarea.add(b11);

		JButton b12 = new JButton(" - ");
		b12.addActionListener(actionListener);
		buttonarea.add(b12);

		JButton b13 = new JButton(" / ");
		b13.addActionListener(actionListener);
		buttonarea.add(b13);

		JButton b14 = new JButton("=");
		b14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String[] a = enterhere.getText().trim().split(" ");
				double a0 = Double.parseDouble(a[0]);
				double a2 = Double.parseDouble(a[2]);
				if (a[1].equals("+")) {
					enterhere.setText("" + (a0 + a2));
				} else if (a[1].equals("-")) {
					enterhere.setText("" + (a0 - a2));
				} else if (a[1].equals("*")) {
					enterhere.setText("" + (a0 * a2));
				} else if (a[1].equals("/")) {
					enterhere.setText("" + (a0 / a2));
				}
				String result = enterhere.getText();
				int length = result.length();
				if (result.substring(length - 2, length).equals(".0")) {
					enterhere.setText(result.substring(0, length - 2));
				}

			}
		});

		buttonarea.add(b14);

		frame.getContentPane().add(content);

		frame.setVisible(true);
	}

}
