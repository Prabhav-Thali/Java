package com.fileiobytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		String str = "This is data to be written in file";
		
		//public void write(byte b[]) throws IOException
		byte[] b = str.getBytes();
		
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream("fileout",true);
			fileOutputStream.write(b);
			System.out.println("Data written in file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
