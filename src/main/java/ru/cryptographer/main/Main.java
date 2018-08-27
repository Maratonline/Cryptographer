package ru.cryptographer.main;

import org.springframework.stereotype.Component;

import ru.cryptographer.decoder.Decriptor;
import ru.cryptographer.decoder.Encryptor;
import ru.cryptographer.implement.data.input.FileReader;
import ru.cryptographer.interfaces.InterfaceDataInput;
import ru.cryptographer.interfaces.InterfaceDecryptor;
import ru.cryptographer.interfaces.InterfaceEncryptor;

@Component
public class Main {
	private String key = "aDeFaeAA3054864q";
	private String initVector = "RandomInitVector";

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
			System.out.println("Incorrect initVector. The initVector must consist of 16 characters only latin, and the numbers");
		}
	}

	InterfaceDataInput reder = new FileReader();
	InterfaceEncryptor encryptor = new Encryptor();
	InterfaceDecryptor decryptor = new Decriptor();
	String filePath = "C:\\Users\\User\\eclipse-workspace\\testDecoder\\src\\text.txt";

	public void run () {
		
		
		String value = reder.readFile(filePath);
		
//		en.encryption ( key, initVector, value);
		System.out.println(en.encryption ( key, initVector, value));
	}
	
}
