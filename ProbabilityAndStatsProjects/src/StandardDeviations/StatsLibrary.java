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
	

	
	/**
	 * Calculates the mean from a given ArrayList of integers
	 * @param arr a given array list
	 * @return the mean as a double
	 */
	public double findMean(ArrayList<Integer> arr) {
		
		double total = 0;
		for (int i = 0; i < arr.size();i++) {
			
			total += arr.get(i);
			
		}
		
		return total / arr.size();
		
	}
	
	/**
	 * Finds the median of a given array list
	 * @param arr a given array list
	 * @return the median
	 */
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
	
	/**
	 * Finds the mode of a given array list
	 * @param arr a given arraylist
	 * @return the mode
	 */
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
	
	/**
	 * Calculates the standard deviation of a given array list
	 * @param arr the given array list
	 * @param mean the mean of the array list
	 * @return the standard deviation
	 */
	public double standardDeviation(ArrayList<Integer> arr, double mean) {
		
		double count = 0.0;

		
		for(int i = 0; i < arr.size(); i++) {
			
			count += (Math.pow(arr.get(i)-mean, 2));
			
		}
		
		count = count/arr.size();
		count = Math.sqrt(count);
		
		return count;
		
	}
	
	/**
	 * Calculates the factorial of a number
	 * @param number is the inputed number that we want to find the factorial of
	 * @return the factorial of the number
	 */
	public double findFactorial (int number) {
		
		int count = 1;
		for (int i = 1; i <= number; i++) {
			
			count = count * i;
			
		}
		
		return count;
	
	}
	
	/**
	 * Calculates the permutation
	 * @param n
	 * @param r
	 * @return
	 */
	public double findPermutation(int n, int r){
		
		double total = (findFactorial(n))/(findFactorial(n-r));
				
		return total;
	}
	
	/**
	 * Calculates the combination
	 * @param n
	 * @param r
	 * @return
	 */
	public double findCombination(int n, int r){
		
		double total = (findFactorial(n))/((findFactorial(r))*(findFactorial(n-r)));
		
		return total;
		
	}

	/**
	 * 
	 * @param arr
	 * @return
	 */
	public String toString(ArrayList<Integer> arr) {
		
		return ("The array is " + arr + " Arr.size(): " + arr.size());
		
	}
	
	
	
	
	
	
	
}
