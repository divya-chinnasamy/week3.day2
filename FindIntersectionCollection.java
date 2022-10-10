package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionCollection {

	public static void main(String[] args) {
		//Declaring array
		int[] num = {3,2,11,4,6,7};
			
		//Declare ArrayList of Integer 
		List<Integer>list = new ArrayList<Integer>();
		List<Integer>list1 = new ArrayList<Integer>();
		
		//adding all the numbers in array to list.
		for (int i = 0; i < num.length; i++) {
			list.add(num[i]);
		}
	      System.out.println(list);
		
	      Collections.addAll(list1, 1,2,8,4,9,7);
	      System.out.println(list1);
	      
	      list1.retainAll (list);
	      System.out.println("The Intersection of 2 arrayList are "+ list1);
	}

}
