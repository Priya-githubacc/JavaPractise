package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingArraysUtilityClass {

	public static void main(String[] args) {
		
		int[] a={100,100,10,11,1};
		
		List l=Arrays.asList(a);
		List l1=new ArrayList(25);
		
 		
		System.out.println("Before sorting.... ");

		for(int a1:a) {
			System.out.println(a1);
		}
		
		Arrays.sort(a);
		System.out.println("After sorting.... ");

		for(int a1:a) {
			System.out.println(a1);
		

	  }
	}
}
