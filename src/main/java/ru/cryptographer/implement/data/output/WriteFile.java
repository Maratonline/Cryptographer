package ru.cryptographer.implement.data.output;

import java.io.FileOutputStream;
import java.io.IOException;

import ru.cryptographer.interfaces.InterfaceDataOutput;

public class WriteFile implements InterfaceDataOutput {

	@Override
	public void createFile(String filePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeFile(String filePath) {
		 String text = "Please work!"; // строка для записи
	        try(FileOutputStream fos=new FileOutputStream(filePath))
	        {
	            // перевод строки в байты
	            byte[] buffer = text.getBytes();
	              
	            fos.write(buffer, 0, buffer.length);
	        }
	        catch(IOException ex){
	              
	            System.out.println(ex.getMessage());
	        }
	        System.out.println("The file has been written");
	    }
	

}
