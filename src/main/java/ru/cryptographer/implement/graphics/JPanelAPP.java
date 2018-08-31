package ru.cryptographer.implement.graphics;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ru.cryptographer.main.*;


public class JPanelAPP extends JPanel{

	
	String filePath;
	String fileName;
	
	public JPanelAPP() {
		setLayout(null);
		JLabel label1 = new JLabel("Enter the path of the file");
		label1.setBounds(10, 10, 235, 25);
		final TextField txt1 = new TextField();
		txt1.setBounds(10, 50, 235, 25);
		
		JButton crypt = new JButton("ENCRYPT");
		crypt.setBounds(10, 100, 100, 50);
		JButton decrypt = new JButton("DECRYPT");
		decrypt.setBounds(150, 100, 100, 50);
		setLayout(null);
		
		JLabel label2 = new JLabel("Please give the name of the file");
		label2.setBounds(10, 160, 235, 25);
		final TextField txt2 = new TextField();
		txt2.setBounds(10, 195, 235, 25);

		add(label1);
		add(txt1);
		
		add(crypt);
		add(decrypt);
		
		add(label2);
		add(txt2);

		crypt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg1) {
				filePath = txt1.getText();
				fileName = txt2.getText();
				Main.crypt();
				System.out.println("CLIC WORCK " + filePath);
			}
		});
		decrypt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg1) {
				filePath = txt1.getText();
				fileName = txt2.getText();
				Main.decrypt();
				System.out.println("CLIC WORCK " + Main.state + fileName );
			}
		});

	}


}
