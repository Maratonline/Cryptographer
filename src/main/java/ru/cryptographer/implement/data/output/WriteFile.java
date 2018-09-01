package ru.cryptographer.implement.data.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import ru.cryptographer.interfaces.InterfaceDataOutput;

public class WriteFile implements InterfaceDataOutput {

	@Override
	public void createFile(String filePath, String fileName, String value) {
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
		try (FileOutputStream fos = new FileOutputStream(file.getAbsolutePath())) {

			byte[] buffer = value.getBytes();

			fos.write(buffer, 0, buffer.length);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
