package ru.cryptographer.implement.graphics;

import javax.swing.JFrame;

import org.springframework.stereotype.Component;

import ru.cryptographer.interfaces.Graphics;


public class MainWindow extends JFrame implements Graphics{

	JPanelAPP jPanelAPP = new JPanelAPP();
	
	@Override
	public void createMainWindow() {
		setBounds(500, 100, 300, 400);
		setTitle("Decoder");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(jPanelAPP);
		setVisible(true);
		
	}
	@Override
	public String getFilePath() {
		return  jPanelAPP.filePath;
	}
	@Override
	public String getFileName() {
		return  jPanelAPP.fileName;
	}

}
