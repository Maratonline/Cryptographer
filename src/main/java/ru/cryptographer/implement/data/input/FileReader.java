package ru.cryptographer.implement.data.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import ru.cryptographer.interfaces.InterfaceDataInput;

public class FileReader implements InterfaceDataInput {

	@Override
	public String readFile(String filePath) {
//		String fileName = "C:\\Users\\User\\eclipse-workspace\\testDecoder\\src\\text.txt";
		String content = null;
		try {
			content = Files.lines(Paths.get(filePath)).reduce("", String::concat);
		//	System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
//			System.out.println("The name of file is incorrect or file is not exist. ");
//			System.out.println(filePath);
		}
		return content;
	}

}
