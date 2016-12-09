import java.util.ArrayList;

/**
*ArrayListPractive File
*Purpose of ArrayListPractive: To practice mainpulating array lists with .set, .remove, .get, .add
*@author Christine Shao
*12/9/16
*/

public class ArrayListPractive
{

	
	/**
	*Main Method
	*Creates a random Integer Array List 
	*Calls removeNumber and replaceLetter method
	*/
	public static void main(String[] args)
	{
		//creating a random Integer Array List
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int count = 0; count < 10; count++)
		{
			int random = (int)(Math.random() * ((10 - 1) + 1));
			a.add(random);
			
		}
		System.out.println(a);
		
		//Method 1
		removeNumber(a, 2);
		
		//creating a String Array List
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("eye");
		a1.add("abc");
		a1.add("elephant");
		
		//Method 2
		replaceLetter(a1, "x");
		
	}
	
	/**
	*Q1:
	*Please write a method that takes in an Array List of Integer and an int as 
	*parameter and remove all occurence of that int from the ArrayList
	*Algorithm: goes through the array list via a while loop while the indicator is within
	*the size of the loop
	*use a if loop to compare if the number in the array list is equal to n
	*if it equals, then simply remove it, otherwise don't change anything
	*@param a Integer array list
	*@param n Looking for this number in the array list to remove
	*/
	public static void removeNumber(ArrayList <Integer> a, int n)
	{
		int index = 0;
		while(index < a.size())
		{
			if(a.get(index) == n)
			{
				a.remove(index);
				
			}
			else
			{
				index++;
			}
		}
		System.out.println(a);
	
	}
	
	/**
	*Q2:
	*Please write a method that takes in an Array List of Strngs and replaces 
	*all occurence of the character "e" with "x" in the strings in the given arrayList
	*eg. ["eye","abc", "elephant"] --> ["xyx", "abc", "xlxphant"]
	*Algorithm: Use a nester for loop to access each character within the strings of the array list
	*Check if the character is equal to e, if so, then want to replace it with s. 
	*the updated string will be placed in the variable and by the end of the for loop 
	*it will be updated in the new array list by replacing the old string with the updated
	*word
	*@param a1 String ArrayList
	*@param s String that is going to replace all "e"
	*/
	public static void replaceLetter(ArrayList <String> a1, String s)
	{
		String updatedWord = "";
		String word = "";
		for(int count = 0; count < a1.size(); count++)
		{
			word = a1.get(count);
	
			for(int letter = 0; letter < word.length(); letter++)
			{
				
				if(word.substring(letter, letter + 1).equals("e"))
				{
					updatedWord += s;
				}
				else
				{
					updatedWord += word.substring(letter, letter + 1);
				}
			}
			a1.set(count,updatedWord);
			updatedWord = "";
		}
		System.out.println(a1);
	}
	


}









