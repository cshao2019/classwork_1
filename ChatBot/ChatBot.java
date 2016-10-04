import java.util.Scanner;

/**
 *This project Generates questions for the user to answer and return with a comment until the user enters "Bye" or "bye"
 *@Author: Christine Shao
 *
 */
 public class ChatBot
 {
 
 	/**
	* This is the main method that the java interpret
 	* @param args This is the command line argument
 	*/
 	
 	public static void main(String[] args)
 	{
 		// create/construct a Scanner obj.
 		Scanner kb = new Scanner(System.in); // initializing/ creating a scanner
 		System.out.print("Please enter your name: ");
 		String name = kb.nextLine();
 		System.out.println("Hi " + name + "! How are you doing today?");
 		String input = kb.nextLine(); // recycles input (same type still)
 		System.out.println("Your answer is " + input);
 		System.out.print("How old are you? "); //This is just a print statement
 		int age = kb.nextInt(); // Since nextInt is an int, can't assign to input that is a string. 
 		if(age > 30)
 		{
 			System.out.println(name + ", you are old!");
 		}
 		else
 		{
 			System.out.println("nice");
 		}
 		
 		System.out.print("How tall are you? ");
 		double height = kb.nextDouble();
 		
 		if (height > 6.0)
 		{	
 			System.out.println(name + ", you are tall!");
 		}
 		else if (height > 5.0)
 		{
			System.out.println(name + ", good height");
 		}
 		else
 		{
 			System.out.println(name + ", you are short! :P");
 		}
 		// will get rid of the newLine char from the previous input
 		
 		kb.nextLine();
 		System.out.println("What is your favorit color?: ");
 		String color = kb.nextLine();
 		System.out.println(color + " is you fav!");
 		
 		String food = "";	
 		while (!food.equals("bye") && !food.equals("Bye"))
 		{
 			System.out.println("What is your favorite food? ");
 			food = kb.nextLine();
 			if (food.equals("bye") || food.equals("Bye"))
 			{
 				System.out.println("Bye!");
 			}
 			else
 			{
 				System.out.println(food + ", that sounds good!");	
 			}
 		}
 		

 	}
 
 
 
 
 
 
 
 
 
 
 }