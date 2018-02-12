package com.psl.EA91;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileP {
public static void main(String[] args) {
	String name="file.txt";
	File f= new File(name);
	if(!f.exists()){
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	else
	{
		FileInputStream fis;
		System.out.println(f.getAbsolutePath());
		if(f.canRead()&&f.canWrite()){
			System.out.println("Readable & writable");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the sentence");
		String str=sc.nextLine();
			
			try {
				FileOutputStream fio=new FileOutputStream(f);
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(fio));
				bw.write(str);
				System.out.println("done");
				System.out.println("enter the string to be appeneded");
				String app=sc.nextLine();
				bw.append(app);
				sc.close();bw.close();
				System.out.println("Appended");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(f.canWrite())
			System.out.println("Writable");
		
		else if(f.canRead())
			System.out.println("Readable");
		else
			System.out.println("neither readable nor writable");
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the sentence");
//		sc.next();
//		
//		FileOutputStream fio=new FileOutputStream(f);
		
		
		
	}
	
	
	
	
	
}
}
