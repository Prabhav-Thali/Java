package com.psl.files1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Files2 {
	public static void main(String[] args) {
		File f = new File("io.txt");
		String str = "";

		int i = 0;
		while (i < args.length) {
			str += args[i];
			i++;
			str += " ";

		}

		FileInputStream fi = null;
		FileOutputStream fo;
		try {
			fo = new FileOutputStream(f);
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
			bw.write(str);
			bw.close();
			System.out.println("File Size is:" + f.length() + " Bytes");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			fi = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fi));

			String str1 = br.readLine();
			System.out.println("Contents of the file are:" + str1);
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("file has been deleted");
			f.delete();
		}

	}
}
