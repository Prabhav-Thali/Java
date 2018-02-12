package com.tac.Services;

public class Test extends Service {

	public Test(char[] s1) {
		super(s1);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Service s[] = new Service[3];

		for (int i = 0, k = 0; i < 3; i++) {
			s[i] = new Service();
			for (int j = 0; j < 5; j++)
				s[i].userServices[j] = Integer.parseInt(args[k++]);

			s[i].Services();
		}
	}
	// Service s= new Service(s1);Service s= new Service(s3);

}
