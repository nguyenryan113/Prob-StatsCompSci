/**
 * 
 */
package DoorGame;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ryan Nguyen
 * DoorGame proves that the Monty Hall problem gives you a
 * 2/3 chance of winning every time you switch doors.
 */
public class DoorGame {

	/**
	 * 
	 * @param switchChoice: true being you would like to switch, 
	 * false being you choose to stay with your initial choice
	 * @return the amount of times you win after 10000 plays
	 * 
	 */
	public double playGame(boolean switchChoice) {
		
		//total win count for current game
		int winCount = 0;
		
		//10000 plays
		for (int i = 0; i < 10000; i++) {
			
			//Where the car is placed randomly
			int carSpot = ThreadLocalRandom.current().nextInt(0,3);
			
			
			ArrayList<Integer> doors = new ArrayList<Integer>();
			
			
			//entering placement of the car
			for(int j = 0; j < 3; j++) {
				
				if (j == carSpot) {
					
					doors.add(1);
					
				}
				
				else {
					
					doors.add(0);
					
				}	
				
			}
			
			//the door you choose initially
			int randomChoice = ThreadLocalRandom.current().nextInt(0,3);

			
			//if initial choice was the car's spot
			if (randomChoice == carSpot) {
				//And you decide to stay, you win
				if(switchChoice == false) {
					
					winCount++;
					
				}
				
				
			}
			//if the initial choice was not the car spot
			else {
				
				//and you decide to stay, you win
				if(switchChoice == true) {
					
					winCount++;
					
				}
				
			}
			
			
			
		}
		
		//Solving for the percentage
		double percentage = ((double)winCount/10000)*100;
		return percentage;
		
	}
	
	
	
	
	
}
