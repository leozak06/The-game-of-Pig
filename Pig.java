/* Leoza Kabir V00840048
*Pig.java
*
*Program Description: The user/player and computer take turns rolling a die a number of times. The computer will stop after 4 times. 
*However, if the die rolls one, the turn is over and no points are scored for that turn. 
*If the die rolls any other number, it is added to the current total score. Each turn lasts until the user/player passes on a roll. 
*The process is then repeated until someone reaches a 100.
*/


import java.util.*;
public class Pig{
	public static void main(String[]args){
		gameLoop();
			/*Random rand = new Random();
			for(int i=1; i<=20 ;i++){
				int dice = diceRoll(rand);
				System.out.println("Rolled a " + dice);
			}
			*/
			
			/*Random rand = new Random();
			Scanner input = new Scanner(System.in);
			playerTurn(input, rand);
			computerTurn(rand);*/
	}
	public static int diceRoll(Random rand){
		int roll = rand.nextInt(6)+1;
			return roll;
	}
	public static int playerTurn(Scanner input,Random rand){
		int scoreP = 0;
		int roll;
		String yesOrNo;
		do{
			roll = diceRoll(rand);
			if(roll ==1){
				scoreP=0;
				System.out.println("Uh oh, you rolled a 1!");
				System.out.println("Your turn is over and you get 0 points this round");
				System.out.println();
			return scoreP;
			
			}else{
				System.out.print("You rolled a "+ roll+("."));
				scoreP += roll;
				System.out.println("Your score so far is " + scoreP +("."));
			}
			System.out.println("Do you want to roll again?(yes or no)");
			yesOrNo = input.next();
			if(yesOrNo.equalsIgnoreCase("yes")){
			}else if(yesOrNo.equalsIgnoreCase("no")){ //not working
			System.out.println("Ending your score with " + scoreP);
			return scoreP;
			}else{
			System.out.println("You did not type yes or no.");
			}
		//return scoreP;
		}while(true);
	}
	public static int computerTurn(Random rand){
		int roll;
		int scoreC=0;
		for(int i=1;i<=4; i++){
			roll=diceRoll(rand);
			if(roll ==1){
			scoreC = 0;
			System.out.println("The computer rolled a 1, ending its turn with a score of 0 this round");
			}else{
			scoreC+=roll;
			System.out.println("The computer rolled a "+ roll+". Its total score this turn is "+ scoreC);
			}
		}
		
		System.out.println("Enging computer's turn with a score of " + scoreC);
		
		return scoreC;
	}
	public static void gameLoop(){
		int playerScore = 0;
		int computerScore = 0;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the game of Pig. Begininning the game...");
		do{
		playerScore= playerScore + playerTurn(input,rand);
		computerScore =computerScore + computerTurn(rand);
		System.out.println("The scores at the end of the current round are:");
		System.out.println("Player: " + playerScore + 	"\tComputer: " + computerScore);
		}while(playerScore<100 & computerScore <100);
		if(playerScore>=100){
			System.out.println("CONGRATULATIONS! YOU WIN");
		}
		if(computerScore>=100){
		System.out.println("The computer wins!");
		}
	}
}

