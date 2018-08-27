package ru.cryptographer.main;

import ru.cryptographer.implement.data.input.FileReader;
import ru.cryptographer.implement.data.output.WriteFile;
import ru.cryptographer.interfaces.InterfaceDataInput;
import ru.cryptographer.interfaces.InterfaceDataOutput;

public class Launcher {

	public static void main(String[] args) {
		
//		Main m = new Main();
//		m.run();
		
		String path = "C://www12.txt";
		
		InterfaceDataOutput out = new WriteFile();
		out.writeFile(path);
	


	}

}
