package com.psl.EA93;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFile {

	public static void main(String[] args) {
		// String filename =
		// "C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg";

		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		FileChannel source = null;
		FileChannel desti = null;
		if (f1.exists()) {

			try {
				source = new FileInputStream(f1).getChannel();

				desti = new FileOutputStream(f2).getChannel();

				desti.transferFrom(source, 0, source.size());

				System.out.println("copied");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

			}
		} else {
			System.out.println("please enter the correct path of the file");
		}
	}
}
