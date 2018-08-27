package ru.cryptographer.implement.data.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.springframework.stereotype.Component;

import ru.cryptographer.interfaces.InterfaceDataOutput;

@Component
public class WriteFile implements InterfaceDataOutput {

	@Override
	public void createFile(String filePath, String fileName) {
		File file = new File(filePath, fileName);

		if (file.exists()) {
			System.out.println("File with this name is exists");
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// "C:\\Users\\User\\eclipse-workspace\\Cryptographer\\decrypted" way for
	// creating giles
	// Date date = new Date();
	// System.out.println("Date of creation: " + date + "\n" + "dfsdfssdf");

	@Override
	public void writeFile(String filePath, String text) {

		try (FileOutputStream fos = new FileOutputStream(filePath)) {

			byte[] buffer = text.getBytes();

			fos.write(buffer, 0, buffer.length);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
