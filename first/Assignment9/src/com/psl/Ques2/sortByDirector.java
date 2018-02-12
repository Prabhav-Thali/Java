package com.psl.Ques2;

import java.util.Comparator;

public class sortByDirector implements Comparator<Movies>{


	@Override
	public int compare(Movies arg0, Movies arg1) {
		return arg0.director.compareTo(arg1.director);
		// TODO Auto-generated method stub
		
	}

	
}
