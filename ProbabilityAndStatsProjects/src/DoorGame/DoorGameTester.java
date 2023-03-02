/**
 * 
 */
package DoorGame;

/**
 * @author Ryan Nguyen
 *
 */
public class DoorGameTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DoorGame test = new DoorGame();
		//If the player decides to switch
		System.out.println("If the player decides to switch, their win percentage is: " + test.playGame(true));
		
		//If the player decides to stay
		System.out.println("If the player decides to stay, their win percentage is: " + test.playGame(false));
		
	}

}
