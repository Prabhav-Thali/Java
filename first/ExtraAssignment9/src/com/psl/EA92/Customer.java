package com.psl.EA92;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

	int CustomerId;
	String CustomerName;

	long ISDcalldura;
	Float ISDperMin;
	long STDcalldura;
	Float STDperMin;
	long Localcallduration;
	Float LocalperMin;

	public Customer(int CustomerId, String CustomerName, long ISDcalldura,
			Float ISDperMin, long STDcalldura, Float STDperMin,
			long Localcallduration, Float LocalperMin) {
		this.CustomerId = CustomerId;
		this.CustomerName = CustomerName;
		this.ISDcalldura = ISDcalldura;
		this.ISDperMin = ISDperMin;
		this.Localcallduration = Localcallduration;
		this.LocalperMin = LocalperMin;
		this.STDcalldura = STDcalldura;
		this.STDperMin = STDperMin;

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		File f = new File("Billing.csv");
		FileInputStream fis = null;Customer c[]=new Customer[5];int i=0;
		if (f.exists()) {
			try {
				fis = new FileInputStream(f);	
				BufferedReader br = new BufferedReader(new InputStreamReader(fis));

				br.readLine();String temp,str[];
				
				while((temp=br.readLine())!=null){
					str=temp.split(",");
					c[i++]=new Customer(Integer.parseInt(str[0]),str[1],Long.parseLong(str[2]),Float.parseFloat(str[3]),Long.parseLong(str[4]),Float.parseFloat(str[5]),Long.parseLong(str[6]),Float.parseFloat(str[7]));
				}
				for(i=0;i<c.length;i++){float total=0;
					System.out.print("Bill for"+c[i].CustomerName);
					System.out.print(":- "+(total+=((c[i].ISDcalldura/60)*c[i].ISDperMin)+((c[i].STDcalldura/60)*c[i].STDperMin)+((c[i].Localcallduration/60)*c[i].LocalperMin))+"\n");
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
}
