package ru.cryptographer.implement.data.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Component;

import ru.cryptographer.interfaces.InterfaceDataInput;

@Component
public class FileReader implements InterfaceDataInput {

	@Override
	public String readFile(String filePath) {
		String content = null;
		try {
			content = Files.lines(Paths.get(filePath)).reduce("", String::concat);
		} catch (IOException e) {
			e.printStackTrace();
			// System.out.println("The name of file is incorrect or file is not exist. ");
			// System.out.println(filePath);
		}
		return content;
	}
}
