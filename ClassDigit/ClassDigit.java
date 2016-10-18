/**
*This project is about recursion
*@author Christine Shao
*/

/** 
*This is the main method that the java interprets
*@param args Calls other methods
*/
public class ClassDigit
{
	public static void main(String[] args)
	{
		String s = "abcd";
		System.out.println(hasDigit(s));
		
		System.out.println("------");
		
		String s1 = "abc1d3";
		System.out.println(hasDigit(s1));
		
		System.out.println("------");
		
		String s2 = "racecar";
		System.out.println(isPalindrome_recursive(s2));
		
		System.out.println("------");
		
		String s3 = "racecbr";
		System.out.println(isPalindrome_recursive(s3));
		
		System.out.println("------");
		
		System.out.println(isPalindrome_iterative(s2));
		
		System.out.println("------");
		
		System.out.println(isPalindrome_iterative(s3));
		
		System.out.println("------");
		
		System.out.println(isPalindrome_r(s2));
		
		System.out.println("------");
		
		System.out.println(isPalindrome_r(s3));
		
		System.out.println("------");
		
		System.out.println(isPalindrome_i(s2));
		
		System.out.println("------");
		
		System.out.println(isPalindrome_i(s3));
	
	}
	
	/**
	This method takes in String and returns true if it has 
	a digit. It uses ASCII numbers to check whether the given
	String has a digit
	@param s The string to check whether it has a digit
	@return boolean true if the String has a digit, false otherwise.
	*/
	
	public static boolean hasDigit(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(c >= 48 && c <= 57)
				
				return true;			
		}
		return false;
	} 
	
	/**This method takes in a String and returns true if the given String is a palindrome
	*done recursively using charAt
	*@param s the String to check whether it is a palindrome
	*@return boolean true if palindrome, false otherwise
	*/
	public static boolean isPalindrome_recursive(String s)
	{
		if(s.length() <= 1) // always want to check the base case before you call the method again
		{
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length() - 1))
		{
			 return isPalindrome_recursive(s.substring(1,s.length()-1));	
		}
		return false;

	}
	
	/**This method takes takes in a String and returns true if the given String is a 
	*palindrome
	*done iteratively using charAt
	*@param s the String to check whether it is a palindrome
	*@return boolean true if palindrome, false otherwise
	*/
	public static boolean isPalindrome_iterative(String s)
	{		
		while(s.length() > 1)
		{
			int i = 0;
			char c = s.charAt(i);
			char l = s.charAt(s.length() - 1);
			
			if(c == l)
			s = s.substring(1,s.length() - 1);
			else 
			return false;
		}
		return true;
	
	}
	
	/**This method takes in a String and returns true if the given String is a palindrome
	*done recursively without using charAt
	*@param s the String to check whether it is a palindrome
	*@return boolean true if palindrome, false otherwise
	*/	
	public static boolean isPalindrome_r(String s)
	{
		if(s.length() <= 1) // always want to check the base case before you call the method again
		{
			return true;
		}
		if(s.substring(0,1).equals(s.substring(s.length() - 1))) //need to use .equals bc obj ref not primitive(==) !!
		{
			return isPalindrome_r(s.substring(1,s.length() - 1));
			
		}
		return false;
	
	}

	/**This method takes takes in a String and returns true if the given String is a 
	*palindrome
	*done iteratively without using charAt
	*@param s the String to check whether it is a palindrome
	*@return boolean true if palindrome, false otherwise
	*/
	public static boolean isPalindrome_i(String s)
	{
		while(s.length() > 1)
		{
			int i = 0;
			String c = s.substring(0,1);
			String l = s.substring(s.length() - 1);
			
			if(c.equals(l)) //need to use .equals bc obj ref not primitive(==) !
			s = s.substring(1,s.length() - 1);
			else
			return false;
		
		}
		return true;
	
	
	}


}