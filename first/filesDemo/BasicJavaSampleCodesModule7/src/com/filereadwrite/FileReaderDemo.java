package com.filereadwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader("file");
			int data; 
			while((data = fileReader.read()) != -1){
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
