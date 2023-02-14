package SetOperations;

import java.util.ArrayList;

import StandardDeviations.StatsLibrary;

public class SetOperationsTester {

	public static void main(String[] args) {
		
		SetOperations test = new SetOperations();
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> all = new ArrayList<Integer>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.add(7);
		arr1.add(8);
		
		arr2.add(7);
		arr2.add(6);
		arr2.add(5);
		arr2.add(8);
		arr2.add(9);
		arr2.add(10);
		arr2.add(11);
		arr2.add(12);
		arr2.add(13);
		
		all.add(1);
		all.add(2);
		all.add(3);
		all.add(4);
		all.add(5);
		all.add(6);
		all.add(7);
		
		A.add(1);
		A.add(4);
		A.add(5);
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(test.union(arr1,arr2));
		System.out.println(test.intersect(arr1,arr2));
		System.out.println(test.complement(all,A));
		
		

	}

}
