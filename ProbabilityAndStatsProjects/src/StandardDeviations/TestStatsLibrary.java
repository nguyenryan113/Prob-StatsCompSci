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
		
		double result = test.findMean(someNumbers);
		
		System.out.println(test.toString(someNumbers));
		
		System.out.println("Average of input: " + result);
	
		System.out.println(test.findMedian(someNumbers));
		System.out.println(test.findMode(someNumbers));
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
