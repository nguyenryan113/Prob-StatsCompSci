package BirthdayProgram;

import java.util.ArrayList;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author ryannguyen
 * BirthdayMatch finds the percentage of birthday matches between 2 people from an inputted amount
 * of people in a room and an inputted amount of trials to test. After checking if at least 2 people
 * in the room have a matched birthday, it counts as a win to be added to the percentage.
 *
 */

public class BirthdayMatch {

	
	/**
	 * Checks from the birthdayList of people in a trial if at least 2 birthdays
	 * match to return 1 or 0.
	 * @param arr is the arrayList full of all the birthdays in the current trial.
	 * @return returns 1 if any 2 birthdays matches in the array.
	 * and return 0 if none of the birthdays in the array are the same.
	 */
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
	
	/**
	 * Gets the percentage of the room inputted of people's birthday matches vs the total trials inputted
	 * @param people is the amount of people you want to test in the room
	 * @param trials is the amount of times you want to the to see how many birthdays match
	 * depending on the amount of people in the room
	 * @return returns the percentage of matches that have had at least 1 birthday match out of the total trials
	 */
	public double getPercentage(int people, int trials) {
		
		ArrayList<Integer> birthdaysList = new ArrayList<Integer>();
		
		int totalMatches = 0;
		
		//adds birthdays to an array for the amount of people randomly
			
		for(int j = 0 ; j < trials ; j++) {
			
			for(int i = 0 ; i < people; i++) {
					
				int randomBirthday = ThreadLocalRandom.current().nextInt(1,366);
					
				birthdaysList.add(randomBirthday);
				
				
			
			}
			
			//Checks if there is a match in the new trial's list of birthdays
			totalMatches += checkBirthdays(birthdaysList);
			
			//Resets the birthdaylist so that when the trial restarts, it can create a new group of people
			//with different birthdays.
			birthdaysList.removeAll(birthdaysList);
			
		}
		
		//Finds the percentage of total matches that have at least 1 birthday match compared to the total amount of trials
		double percentage = ((double)totalMatches/(double)trials)*100;
	    
		return percentage;
		
	}
	
	
}
