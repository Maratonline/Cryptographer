package ru.cryptographer.implement.graphics;

import javax.swing.JFrame;

import org.springframework.stereotype.Component;

@Component
public class MainWindow extends JFrame {
	public MainWindow() {
		setBounds(100, 100, 265, 380);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JPanelAPP());
		setVisible(true);
	}

}
