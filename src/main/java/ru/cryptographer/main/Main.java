package ru.cryptographer.main;

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

}
