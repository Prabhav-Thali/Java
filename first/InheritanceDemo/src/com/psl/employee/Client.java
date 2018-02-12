package com.psl.employee;

public class Client {
	int sum=0;
 void add(int a,int b){

		 sum=a+b;
		System.out.println("sum");
	}
	 void add(int a,int b,int c){

	 sum=a+b+c;
		System.out.println("sum");
	}
	
	 void add(int...a){
	
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		/*
		 * Employee e=new Employee();
		 * 
		 * e.displayEmployee();
		 */
		// Developer d = new Developer(101,20000,"XYZ",1000,2000,3000);
		Employee d = new Developer(101, 20000, "XYZ", 1000, 2000, 3000);
		d.displayEmployee();
		d.showEmp();
		
		//varargs
		Client c=new Client();
		
		c.add(1,2,3,4,5,5,56,6,6);
		
		// d.displayDeveloper();
	}
}
