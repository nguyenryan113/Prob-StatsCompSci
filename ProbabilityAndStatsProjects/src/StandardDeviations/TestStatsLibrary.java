package StandardDeviations;

import java.util.ArrayList;

public class TestStatsLibrary {

	
	public static void main(String[] args) {
		
		StatsLibrary test = new StatsLibrary();
		ArrayList<Integer> someNumbers = new ArrayList<>();
		
		

		
		someNumbers.add(5);
		someNumbers.add(2);
		someNumbers.add(2);
		someNumbers.add(20);
		someNumbers.add(4);
		someNumbers.add(10);
		someNumbers.add(3);
		someNumbers.add(17);
		someNumbers.add(8);
		someNumbers.add(8);
		
		double result = test.findMean(someNumbers);
		
		System.out.println(test.toString(someNumbers));
		
		System.out.println("Average of input: " + result);
	
		System.out.println("The median is: " + test.findMedian(someNumbers));
		System.out.println("The mode is: " + test.findMode(someNumbers));
		double meanOfTest = test.findMean(someNumbers);
		System.out.println("The standard deviation is: " + test.standardDeviation(someNumbers, meanOfTest));
		
		StatsLibrary test2 = new StatsLibrary();
		
		System.out.println("The factorial of 15 is: " + test2.findFactorial(15));
		System.out.println("The permutation is: " + test2.findPermutation(2,3));
		System.out.println("The combination is: " + test2.findCombination(9,7));

	}
	
	
	
	
	
	
	
	
	
	
}
