package ru.cryptographer.main;

import ru.cryptographer.decoder.Decriptor;
import ru.cryptographer.decoder.Encryptor;
import ru.cryptographer.implement.data.input.FileReader;
import ru.cryptographer.implement.data.output.WriteFile;
import ru.cryptographer.implement.graphics.MainWindow;
import ru.cryptographer.interfaces.*;

public class Main {
	private static String key = "aDeFaeAA3054864q";
	private static String initVector = "RandomInitVector";

	public Main() {

	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		if (key.length() == 16) {
			this.key = key;
		} else {
			System.out.println("Incorrect key. The key must consist of 16 characters only latin, and the numbers");
		}
	}

	public String getInitVector() {
		return initVector;
	}

	public void setInitVector(String initVector) {
		if (key.length() == 16) {
			this.initVector = initVector;
		} else {
			System.out.println(
					"Incorrect initVector. The initVector must consist of 16 characters only latin, and the numbers");
		}
	}

	static InterfaceDataInput reder = new FileReader();
	static InterfaceDataOutput writer = new WriteFile();
	static InterfaceEncryptor encryptor = new Encryptor();
	static InterfaceDecryptor decryptor = new Decriptor();
	static Graphics mainWindow = new MainWindow();

	private static String encryptedFilePath = "C:\\Users\\User\\eclipse-workspace\\Cryptographer\\encrypted";
	private static String decryptedFilePath = "C:\\Users\\User\\eclipse-workspace\\Cryptographer\\decrypted";

	public void run() {
		mainWindow.createMainWindow();
	}

	public static void crypt() {

		String txt = encryptor.encryption(key, initVector, reder.readFile(mainWindow.getFilePath()));
		writer.createFile(encryptedFilePath, mainWindow.getFileName(), txt);
	}

	public static void decrypt() {
		String txt = decryptor.decryptor(key, initVector, reder.readFile(mainWindow.getFilePath()));
		writer.createFile(decryptedFilePath, mainWindow.getFileName(), txt);
	}

}
