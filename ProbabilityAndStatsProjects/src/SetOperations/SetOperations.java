package SetOperations;

import java.util.ArrayList;
import java.util.Collections;

public class SetOperations {
	
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
	
	public ArrayList<Integer> union(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		newArr.addAll(arr1);
		newArr.addAll(arr2);
		newArr = removeDuplicates(newArr);
		
		return newArr;
		
	}
	
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
	
	
	
}
