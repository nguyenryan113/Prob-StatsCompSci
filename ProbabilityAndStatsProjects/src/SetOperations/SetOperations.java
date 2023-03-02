package SetOperations;

import java.util.ArrayList;
import java.util.Collections;

public class SetOperations {
	
	/**
	 * Removes the duplicates within an arrayList
	 * @param arr is the arrayList that is being used to remove their duplicates.
	 * @return returns a new arrayList without any duplicates in the array.
	 */
	public ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();

		Collections.sort(arr);
		
		newArr.add(arr.get(0));
		for(int i = 1 ; i < arr.size(); i++) {
			
			if(arr.get(i) != arr.get(i-1)) {
				
				newArr.add(arr.get(i));
				
			}
				
		}
		
		return newArr;
		
	}
	
	/**
	 * Gets the union of 2 arrayList.
	 * @param arr1 Is the first arrayList you want to union together.
	 * @param arr2 Is the second arrayList you want to union together.
	 * @return returns a new arrayList that has both arr1 and arr2, but without any duplicates.
	 */
	public ArrayList<Integer> union(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		newArr.addAll(arr1);
		newArr.addAll(arr2);
		newArr = removeDuplicates(newArr);
		
		return newArr;
		
	}
	/**
	 * Gets the intersection of 2 arrayList.
	 * @param arr1 Is the first arrayList you want to intersect.
	 * @param arr2 Is the second arrayList you want to intersect.
	 * @return returns a new arrayList that has only the elements
	 * that arr1 and arr2 share, but without duplicates.
	 */
	public ArrayList<Integer> intersect(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		
		for(int i = 0 ; i < arr1.size(); i++) {
			
			for(int j = 0 ; j < arr2.size()-1; j++) {
				
				if (arr1.get(j) == arr2.get(i)) {
					
					newArr.add(arr1.get(j));
					
				}
				
			}
		}
		
		newArr = removeDuplicates(newArr);

		return newArr;
		
	}
	/**
	 * Gets the complement of a subset.
	 * @param all is the arrayList set of all elements.
	 * @param A is the arraylist subset that you want to complement.
	 * @return returns a new arrayList with the elements of the all Arraylist,
	 * excluding the elements that were in the A arrayList subset.
	 */
	public ArrayList<Integer> complement(ArrayList<Integer> all, ArrayList<Integer> A){
		
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		tempArr.addAll(all);
		
		for(int i = 0 ; i < A.size(); i++) {
			
			for(int j = 0; j < tempArr.size(); j++) {
				
				if(A.get(i) == tempArr.get(j)) {
					
					tempArr.remove(j);
					
				}
				
			}
			
		}
		
		
		return tempArr;
	}
	/**
	 * Tests all the main methods in the class.
	 * @return confirms that all the tests went through.
	 */
	public String testAll() {
		
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
		System.out.println(union(arr1,arr2));
		System.out.println(intersect(arr1,arr2));
		System.out.println(complement(all,A));
		
		return "Finished Testing";
	}
	
	
}
