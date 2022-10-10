package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};
//				declaring list
				List<Integer> lst1 = new ArrayList<Integer>();
				
				//Adding data to List
				for (int i = 0; i < data.length; i++) {
					lst1.add(data[i]);
				}
				//Printing List
				System.out.println(lst1);
				
				//Sorting List
				Collections.sort(lst1);
				System.out.println("List after sorting:" +lst1);
				
				//Printing the second largest from the List
				System.out.println("Second Largest number from the List :" + lst1.get(4));

	}

}
