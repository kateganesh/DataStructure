package com.ganesh.ds.arrayAndString;

import java.util.ArrayList;
import java.util.List;

public class IntegerInList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("HEllo");
		list.add("25");
		list.add("rwe55");
		list.add("30");
		list.add("pqr");
		int sum = addIntegerFromList(list);
		System.out.println("The sum is:"+sum);

	}
	
	public static int addIntegerFromList(List list) {
		
		int sum = 0;
		for(int i=0;i<list.size();i++){
		    try{
		        sum+=Integer.parseInt((String) list.get(i));
		    }
		    catch( Exception e ) {
		      //Just in case, the element in the array is not parse-able into Integer, Ignore it
		    }
		}
		
		return sum;
	}
	
}

