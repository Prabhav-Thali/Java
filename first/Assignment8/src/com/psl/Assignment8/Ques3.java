package com.psl.Assignment8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ques3 {
	
	public static int countWords(String filePath)
	{int i=0,j=0;
		File f=new File(filePath);
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			BufferedReader br= new BufferedReader(new InputStreamReader(fis));
			char c;
			while((j=br.read())!=-1){c=(char)j;
				if(c==' '){
					++i;
				}
				
				
			}
			return i+1;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return 0;
		
	}
public static void main(String[] args) {
	
	String path="C:\\Users\\Administrator\\Downloads\\a21\\New folder\\gs.txt";
	int i=countWords(path);
	System.out.println(i);
}
}
