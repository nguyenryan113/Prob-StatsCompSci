/**
 * 
 */
package StandardDeviations;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ryannguyen
 *
 */
public class StatsLibrary {
	

	
	
	public double findMean(ArrayList<Integer> arr) {
		
		double total = 0;
		for (int i = 0; i < arr.size();i++) {
			
			total += arr.get(i);
			
		}
		
		return total / arr.size();
		
	}
	
	
	public double findMedian(ArrayList<Integer> arr) {
		

		double result = 0;
		ArrayList<Integer> tempArr = new ArrayList<Integer>();
		
		
		for (int i = 0; i < arr.size(); i++) {				
			
			tempArr.add(arr.get(i));
		}
		
		//https://www.geeksforgeeks.org/how-to-sort-an-arraylist-in-ascending-order-in-java/
		Collections.sort(tempArr);
		
		System.out.println(tempArr);
		if (tempArr.size()%2 == 1) {
			result = tempArr.get(arr.size()/2);
		}
		else
			result = (((tempArr.get(tempArr.size()/2))+(tempArr.get((tempArr.size()/2)-1)))/2.0);
			//System.out.println(tempArr.get(tempArr.size()/2));
			//System.out.println(tempArr.get((tempArr.size()/2)-1));
			//System.out.println(tempArr.size()%2);
			
		return result;
		
	}
	
	
	//Should return mode, but if there are multiple modes
	//program should return null
	public Integer findMode(ArrayList<Integer> arr) {
		
	
		int highCount = 0;
		Integer result = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			
			int count = 0;
			for (int g = 0; g < arr.size(); g++) {
				if (arr.get(i)==arr.get(g)) {
					count++;
					//System.out.println("The i is: " + i);	
					//System.out.println("The g is: " + g);	
					
				}
				
			}
			//System.out.println("The total count is: " + count + " and value was : " + arr.get(i));
			if (count > highCount) {
				highCount = count;
				result = arr.get(i);
			}
			else if (count == highCount & arr.get(i)!= result) {
				result = null;
			}
			
			//System.out.println("The highCount is: " + highCount);	
			
		}
		
		return result;
		
	}


	public String toString(ArrayList<Integer> arr) {
		return ("The array is " + arr + " Arr.size(): " + arr.size());
	}
	
	
	
	
	
	
	
}
