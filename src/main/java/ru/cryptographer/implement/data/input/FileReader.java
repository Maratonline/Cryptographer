package ru.cryptographer.implement.data.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import ru.cryptographer.interfaces.InterfaceDataInput;

public class FileReader implements InterfaceDataInput {

	@Override
	public String readFile(String filePath) {
		String content = null;
		try {
			content = Files.lines(Paths.get(filePath)).reduce("", String::concat);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}
}
