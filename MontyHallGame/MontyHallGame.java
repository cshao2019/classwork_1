import java.util.Scanner;
/**
*This project is a game of the Monty hall Game
*@author: Christine Shao
*
*/
public class MontyHallGame
{
	/**
	* This is the main method that the java interpreter looks for
	* @param args. Call other methods
	*/	
	public static void main(String[] args)
	{
		// welcome message (call)
		welcome();
		
		// game call
		game();
	
	}
	
	/**
	*This method welcomes the player and explains how to play the game
	*/
	public static void welcome()
	{
		System.out.println("Monty Hall Game");
		System.out.println("Pick a door number first. ");
		System.out.println("You will have a chance to switch ");
		System.out.println("after a door has been revealed. ");
	
	}
	/**
	*This method is the game. Asks user to choose door and calls other methods. Provides parameter for other methods 
	*Formats the returns of the method into an understandable format 
	*/
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		int car = (int)(Math.random() * 3 + 1);
		
		//testing
		System.out.println("car = " + car); 
		
		System.out.print("Please choose a door (1, 2, or 3) ");
		int user_pick = keyboard.nextInt();
		// get rid of the newLine from the buffer
		keyboard.nextLine();
		
		// testing
		System.out.println("You chose door # " + user_pick);
		
		int reveal = doorToReveal(car, user_pick);
		
		//testing
		System.out.println("Open door #: " + reveal);
		
		//ask the user if they want to switch
		System.out.println("Do you want to switch?: ");
		String answer = keyboard.nextLine();
		
		//testing 
		System.out.println("The user wants to switch " + answer);
		
		if(answer.equals("yes")
		{
			user_pick = doorToReveal1(user_pick, reveal);
		
		}
		
		if ( car == user_pick )
			System.out.print("You win!!");
		else
			System.out.println("Sorry! You lose !!!");
	
	}
	
	/**
	* This method reveals the door that is neither the one with the car or the one that the user chose. 
	*use a for loop to go through every door and compared whether or not if the car door number equals to the number that 
	*the user chose. If so, it continues in the for loop. It also compares if the 
	*@param c,u. Both are ints. c is the door the car is in and u is the door that the user picked. 
	*@return int i, the door that is not chosen by the user nor the one that has the car. Returns -1 so there will not be a error
	*/
	
	public static int doorToReveal(int c, int u)
	{
		for(int i = 1; i < 4; i ++)
		{
			if (i != c && i != u)
			{
				return i;
			
			}
		}
		return -1;
	
	}
	
	
	/**
	* This method reveals the door that is neither the one with the car or the one that the user chose.
	*use a while loop to go through every door and compared whether or not if the car door number equals to the number that
	*the user chose. If so, it continues in the for loop. It also compares if the 
	*@param c,u. Both are ints. c is the door the car is in and u is the door that the user picked.
	*@return r the door that is not chosen by the user nor the one that has the car. 
	*/
	
	public static int doorToReveal1(int c, int u)
	{
		int r = (int) (Math.random() * 3 + 1);
		while (r == c || r == u)
		{
			r = (int) (Math.random() * 3 + 1);
		
		}
		return r;
	
	
	}
	




}