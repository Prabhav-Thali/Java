	package com.fileiobytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("file");
			//public int read() throws IOException
			int data;
			while((data = fileInputStream.read()) != -1){
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
