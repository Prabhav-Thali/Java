package com.psl.Ques3;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeueArray {

	String cityId,cityName;
	public DequeueArray(String id,String name) {
		// TODO Auto-generated constructor stub
	cityId=id;
	cityName=name;
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cityId+" "+cityName;
	}
	public static void main(String[] args) {
		
		DequeueArray daq[]=new DequeueArray[3];
		
		daq[0]=new DequeueArray("c1", "Mapusa");
		daq[1]=new DequeueArray("c2", "Panjim");
		daq[2]=new DequeueArray("c2", "Vasco");
		ArrayDeque<DequeueArray> da=new ArrayDeque<DequeueArray>();
	    
		for (int i = 0; i < daq.length; i++) {
			da.add(daq[i]);
		}
		
		System.out.println("whole deque is:");
		System.out.println(da);
		
		System.out.println("first element is:");
		System.out.println(da.element());
		
		System.out.println("last element is:");
		System.out.println(da.getLast());
		da.removeLast();
		
		
		
		da.clear();
		System.out.println("after clearing:");
		System.out.println(da);
	}
	
}
