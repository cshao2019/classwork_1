/**
*This project is to simulate the Monty Hall game if it was run 10000 times
*@author: Christine Shao
*
*/

public class MontyHallSimulation
{

	/**
	* This is the main method that the java interpreter looks for
	* @param args. Calls other methods
	*/	
	public static void main(String[] args) // the interpreter is calling the main
	{
		
		String input = args[0];
		
		// System.out.println(args[0]); // need a command line parameter or else there will be index out of range
		
		int numSim = Integer.parseInt(input);
		System.out.println(numSim);
		
		int switchWin = 0;
		
		for (int i = 0; i < numSim; i++)
			switchWin += game();
	
		double percentSwitchWin = format ((double) switchWin / numSim * 100);
		double percentStayWin = format (100 - percentSwitchWin);
		
		System.out.println("% switch_win: " + percentSwitchWin);
		System.out.println("% switch_win: " + percentStayWin);
	}
	
	
	/**
	* This methods takes in a double and truncates it 2 decimal places
	*@param d the double input to be truncated
	*@return double formatted to 2 decimal places
	*/
	
	public static double format(double d)
	{
		int temp = (int) (d * 100);
		return temp / 100.0;
	
	}
	
	/**
	*This method is the simulated game. It generates a random door number and assigns it to the car and to the userPick. 
	* @return int return 1 if switch win, otherwise 0
	*/
	
	public static int game()
	{
		int car = (int) (Math.random() * 3 + 1);
		int userPick = (int) (Math.random() * 3 + 1);
		
		if (car == userPick)
			return 0;
		else
			return 1;
	
	}



	

}