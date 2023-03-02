package BirthdayProgram;

import java.util.ArrayList;

import java.util.concurrent.ThreadLocalRandom;

public class BirthdayMatch {

	
	
	public int checkBirthdays(ArrayList<Integer> arr) {
		
		
		//compares birthdays of amount of people
		for(int j = 0; j < arr.size(); j++) {
			
			for(int k = j+1; k < arr.size(); k++) {
				
				
				if (arr.get(j).equals(arr.get(k))) 
				{
					return 1;
					
				}
				
			}

		}
		
		return 0;
	}
	
	
	public double getPercentage(int people, int trials) {
		
		ArrayList<Integer> birthdaysList = new ArrayList<Integer>();
		
		int totalMatches = 0;
		
		//adds birthdays to an array for the amount of people randomly
			
		for(int j = 0 ; j < trials ; j++) {
			
			for(int i = 0 ; i < people; i++) {
					
				int randomBirthday = ThreadLocalRandom.current().nextInt(1,366);
					
				birthdaysList.add(randomBirthday);
				
				
			
			}
			
			totalMatches += checkBirthdays(birthdaysList);
			birthdaysList.removeAll(birthdaysList);
			
		}
		
		
		double percentage = ((double)totalMatches/(double)trials)*100;
	    
		return percentage;
		
	}
	
	
}
