package ru.cryptographer.main;



import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import ru.cryptographer.implement.data.input.FileReader;
import ru.cryptographer.implement.data.output.WriteFile;
import ru.cryptographer.interfaces.InterfaceDataInput;
import ru.cryptographer.interfaces.InterfaceDataOutput;

@Component
public class Launcher {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
//		Main m = new Main();
//		m.run();
		
//		String path = "C://www12.txt";
		
//		InterfaceDataOutput out = new WriteFile();
//		out.writeFile(path);
		
		Date date = new Date();
		
		System.out.println("Date of creation: " + date + "\n" + "dfsdfssdf");
		
		WriteFile f = new WriteFile();
		f.createFile("C:\\Users\\User\\eclipse-workspace\\Cryptographer\\decrypted", "test1.txt");
		

	}

}
