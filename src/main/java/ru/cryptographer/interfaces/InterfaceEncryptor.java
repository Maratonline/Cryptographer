package ru.cryptographer.interfaces;

public interface InterfaceEncryptor {
	String encryption (String key, String initVector, String value);
}
