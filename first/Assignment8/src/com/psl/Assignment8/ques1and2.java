package com.psl.Assignment8;

import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ques1and2 {

	public static void displayFolderContents(File path,
			TreeMap<String, String> m) {
String s="";
		File[] files = path.listFiles();

		for (File f : files) {
			if (f.isDirectory())
				displayFolderContents(f, m);

			if (f.isFile()) {
				System.out.println(f.getName());
				s+=f.getName()+" ";
				m.put(f.getParent(), s);
			}

		}
	}

	public static void main(String[] args) {
		TreeMap<String, String> m = new TreeMap<String, String>();

		File f = new File(
				"C:\\Users\\Administrator\\Downloads\\BasicJavaSampleCodesModule7");
		// String path=;
		displayFolderContents(f, m);

		System.out.println("\nMap Contents are"+m);

	}
}
