package com.psl.Movies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;

public class Movies {
	public static void main(String[] args) {

		File f = new File("movies.txt");
		FileInputStream fi = null;
		if (f.exists()) {
			System.out.println("File Exists...!");
		} else {
			System.out.println("doesnt exist");

		}

		try {
			fi = new FileInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(fi));
			int c1 = 0;
			String s = "";
			Language[] l = Language.values();

			while ((s = br.readLine()) != null) {
				String temp = s;
				while (temp.contains(",")) {

					int k = temp.indexOf(",");
					c1++;

					temp = temp.substring(k + 1);
				
				if (c1 == 2) {
					String[] str = s.split(",");
					int i, flag = 0;
					for (i = 0; i < l.length; i++) {
						if (str[2].equals(l[i].toString()))
							flag = 1;
					}
					if (flag == 0)
						try {
							throw new invalidLanguage(s);
						} catch (invalidLanguage e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

				}}if (c1 == 3) {
					System.out.println("valid line " + s);
					c1 = 0;
					try {
						char c = s.charAt(0);
						if (!(Character.isDigit(c))) {
							throw new InvalidId(s);
						}
					} catch (InvalidId i) {

						i.printStackTrace();
					}

				} else {
					System.out.println("not valid " + s);
					c1 = 0;
					try {
						throw new InvalidValues(s);
					} catch (InvalidValues e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
