/**
* This is a project about loops
* There are 4 different kinds of loops
* @author: Christine Shao
*
*/

public class Loops 
{
 	/**
	* This is the main method that the java interpret
 	* @param args Calls other methods
 	*/
 	
	public static void main(String[] args)
	{
		// call the whileLoop
		whileLoop();
		
		System.out.println("---------------------");
		
		// call to forLoop
		forLoop();
		
		System.out.println("---------------------");
		
		//call to nestedwhileLoop with n = 4
		nestedWhileLoop(4);
		
		System.out.println("---------------------");
		
		int var = 9;
		nestWhileLoop(var);
		
		System.out.println("---------------------");
		
		int variable = 5;
		staircaseLoop(variable);
		
		System.out.println("---------------------");
		
		int variabler = 4;
		reverseStaircaseLoop(variabler);
		
		System.out.println("--------------------");
		

	
	}

	/**
	*This method uses a while loop to increment a variable by 1 until it does not satisfy the while loop condition
	*/
	
	public static void whileLoop()
	{
		int counter = 1;
		while (counter <= 10)
		{
			System.out.println(counter);
			counter ++; // ++ increment by one. if want to add more than one --> counter += 1		
		
		}
	}
	
	/**
	*This method uses a for loop to increment a variable by 1 until it does not satisfy the while loop condition
	*/
	public static void forLoop()
	{
		//int i; // can define the variable here as well. 
		for(int i = 1; i <=10; i ++)
		{
			System.out.println(i);
		
		}
	}
	
	/**
	*This method uses a nested while loop to print out a "*" grid with dimensions determined by the parameter of the method
	*@param n. An int variable. It is set in the main method
	*/
	public static void nestedWhileLoop(int n)
	{
		int row = 0;
		
		while (row < n)
		{
			int col = 0;
			while ( col < n)
			{
				System.out.print("*");
				col ++;
			}
			System.out.println();
			row ++;
		
		}
		
			
	
	
	}
	
	/**
	*This method uses a nested for loop to print out a "*" grid with dimensions determines by the parameter of the method
	*@param n. An int variable. It is set in the main method
	*/
	public static void nestWhileLoop(int n)
	{
		for(int i = 0; i < n; i ++)
		{
			for(int j = 0; j < n; j ++)
			{
				System.out.print("*");
			}
			System.out.println();
		
		
		}
	
	
	
	}
	/**
	*This method uses a while loop to print out a "*" staircase with the last row of the staircase equal to the parameter of the method
	*@param s. It is set in the main method before staircaseLoop method is called
	*/
	public static void staircaseLoop(int s)
	{
		int row = 0;
		
		while (row < s)
		{
			int col = 0;
			while (col <= row)
			{
				System.out.print("*");
				col ++;
			
			}
			System.out.println();
			row ++;
		
		}
	
	
	}
	/**
	*This method uses a while loop to print out an reverse "*" staircase with the top row of the staircase equal to the parameter of the method
	*@param r. It is set in the main method before reverseStaircaseLoop method is called 
	*/
	public static void reverseStaircaseLoop(int r)
	{
		int row = 0;
		while (row < r)
		{
			int col = r - row;
			while (col > 0)
			{
				System.out.print("*");
				col --;
			
			}
			System.out.println();
			row ++;
		
		
		
		}
	
	
	
	
	}
	
	

	
		
		
	
}