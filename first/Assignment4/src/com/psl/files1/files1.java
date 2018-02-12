package com.psl.files1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class files1 {
	public static void main(String[] args) {
		File f = new File(args[0]);
		File f1 = new File(args[1]);
		if (f.exists()) {
			FileInputStream fi = null;
			try {
				fi = new FileInputStream(f);
				FileOutputStream fos = null;

				System.out.println("Overwrite? enter y or n");
				Scanner sc = new Scanner(System.in);
				String y = "Y";
				if (sc.next().equalsIgnoreCase(y)) {
					sc.close();

					try {
						int i = 0;
						fos = new FileOutputStream(f1);
						while ((i = fi.read()) != -1)
							fos.write(i);
						System.out.println("File 1 is Copied.");
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {
					System.out.println("File doesnt exist");
					try {
						System.out.println("Creating a New File");
						int i = 0;
						f1.createNewFile();
						fos = new FileOutputStream(f1);
						while ((i = fi.read()) != -1)
							fos.write(i);
						System.out.println("File 1 is Copied to a new file.");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							fos.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				System.out.println("");
			}
		}
		else{
			System.out.println("Enter correct source filename");
		}
	}
}
