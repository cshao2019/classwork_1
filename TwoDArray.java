/**
*2D Array File
*Purpose: Familiarize with arrays and printing out arrays. 
*Important methods: 
*This file contains the 2 printArray methods(string and int) to print out the content of a 2D array
*This file also contains a modified printArray method that prints out the content in 
*a neat fashion. 
*@author: Christine Shao
*11/29/16
*/
public class TwoDArray
{

	/**
	*Main method
	*Calling printArray to print out various different kinds of array
	*/
	public static void main(String[] args)
	{
	
		int [][] arr = new int[3][4]; // 3 (row) x 4 (column)
		printArray(arr);
		
		String [][] arr1 = new String [3][3];
		printArray(arr1);
		
		printArray(create2D(5));
				
		
	}
	
	
	/**
	*Method to print an int type 2D array
	*@param a 
	*a = array 
	*Algorithm:
	*Use a nested for loop to access the space to the corresponding row and column. 
	*/
/*	public static void printArray(int [][] a)
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				//a[row][col] = basically offering the coordinates to that space in the array
				System.out.print(a[row][col] + " "); //to print out each specific element in the 2D array. 
			}
			System.out.println();
	
		}
	}
*/
	
	/**
	*Method to print a String type 2D array
	*@param a
	*a = array
	*Algorithm:
	*Use a nested for loop to access the space with the corresponding row and column
	*/
	public static void printArray(String [][] a)
	{
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col ++)
			{
				System.out.print(a[row][col] + " "); //to print out each specific element in the 2D array
			}
			System.out.println();
	
		}
	}
	
	/**
	*1
	*Please write a method that returns a 2D array initialized as follows 
	*1,2,3,4
	*5,6,7,8
	*9,10,11,12
	*@return arr2
	*Algorithm:
	*Initiate a new 2D int array
	*set new changing variable: will place this variable in the spaces of the array
	*nested to forloop to access each space in the array
	*/
/*	public static int [][] create2D()
	{
		int [][] arr2 = new int [3][4];
		int value = 1;
		for(int row = 0; row < arr2.length; row++)
		{
			for(int col = 0; col < arr2[row].length;col++)
			{
				arr2[row][col] = value;
				value++;
			}
	
		}
		return arr2;

	}

	/**
	*2
	*Please modify your previous method so that it takes in the dimension of the gird as a parameter 
	*and returns (nxn) 2D array with the content as described in the previous problem 
	*@param n
	*n = specified dimension
	*@return = arr2;
	*Algorithm:
	*initiated a new int 2D array
	*created a changing variable that will later be added into the spaces of the array
	*nested forloop to access each space of the 2D array
	*For each space that is accessed, the value is added, and then immediately incremented 
	*If you only want to increment when there is a new row, then you increment value 
	*outside of the inner forloop because the outer for loop controls the amount of rows
	*So in each space of the array, the content in each space will always increment by one
	*/
	public static int [][] create2D(int n)
	{
		int [][] arr2 = new int [n][n];
		int value = 1;
		for(int row = 0; row < arr2.length; row++)
		{
			for(int col = 0; col < arr2[row].length;col++)
			{
				arr2[row][col] = value;
				value++;
			}
	
		}
		return arr2;

	}
	
	/**
	*3
	* Please modify your printArray(int [][] a) methed so that it will print the 2D array in a nice format
	*Method to print out an int type 2D array in a nice format
	*@param a 
	*a = array
	*Algorithm:
	*The first forloop is to print out the correct amount of dashes for the very top of the array
	*The nested forloop and if statement is the same as the other printArray methods
	*except the addition of the formatting syntax. 
	*In order to single digits and more than one digit to align with each other, 
	*an if statement is created to determine whether or not a space is needed to correct the 
	*format
	*if the number is less than 10 (single digit) that means a space is needed or else that 
	*space will be shorter and then making the grid uneven. 
	*vise versa if the number is greater than 10
	*The last forloop is for the line that separates each row. The amount of dashes is depends
	*on the length of the array
	*/
	public static void printArray(int [][] a)
	{
		
		for(int count = 0; count < a.length; count++)
		{
			System.out.print(" --");
		}
		System.out.println();
		for(int row = 0; row < a.length; row++)
		{
			System.out.print("|");
			for(int col = 0; col < a[row].length; col++)
			{
				if(a[row][col] < 10)
				{
					System.out.print(a[row][col] + " |");
				}
				else
				{		
					System.out.print(a[row][col] + "|"); //to print out each specific element in the 2D array
				}
			}
			System.out.println();
			for(int count = 0; count < a.length; count++)
			{
				System.out.print(" --");
			}
			System.out.println();
	
		}
	}	

}
