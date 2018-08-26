package ru.cryptographer.decoder;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import ru.cryptographer.interfaces.InterfaceEncryptor;

public class Encryptor implements InterfaceEncryptor {

	@Override
	public String encryption(String key, String initVector, String value) {
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));

			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

			byte[] encrypted = cipher.doFinal(value.getBytes());

			String s = new String(Base64.getEncoder().encode(encrypted));
			return s;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
