package com.psl.Assignment8;

import java.io.File;
import java.util.TreeMap;

public class ques2 {

	public static Boolean searchFile(String path, String filename) {
		int f2 = 0;
		File f = new File(path);
		File[] files = f.listFiles();

		for (File f1 : files) {
			if (f1.isDirectory() && searchFile(f1.getPath(), filename))
				return true;

			if (f1.isFile()) {
				System.out.println(f1.getName());

				if (f1.getName().equals(filename)) {

					f2 = 1;
					break;
				} else
					f2 = 0;
			}
		}
		if (f2 == 1)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		String filename = "gs.txt";
		boolean b = searchFile("C:\\Users\\Administrator\\Downloads", filename);

		if (b == true)
			System.out.println("file is present");
		else
			System.out.println("file is absent");

	}
}
