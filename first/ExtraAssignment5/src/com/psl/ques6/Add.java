package com.psl.ques6;

public class Add{
	protected static int add(int...a) {int sum=0;
	// TODO Auto-generated method stub
	for (int i = 0; i < a.length; i++) {
		sum +=a[i];
	}
	return sum;
}
	public static void main(String[] args) {
		int[] a1=new int[args.length];
		for(int j=0;j<a1.length;j++)
			a1[j]=Integer.parseInt(args[j]);

		System.out.println("Sum is "+add(a1));
	}

}
