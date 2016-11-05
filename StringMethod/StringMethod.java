/**
*This project is about String Method
*@author Christine Shao
*/
public class StringMethod
{

	public static void main(String[] args)
	{
		String s1 = "racecar";
		String s2 = "car";
		String s3 = "ef";
		String s4 = "abcfabc";
		String s5 = "abc";
		int start = 0;
		String s6 = "This is _very_ good.";
		
		System.out.println();
		
		System.out.println("FindString method Test Cases: ");
		System.out.println(findString(s1,s2,start));
		System.out.println("---------");
		System.out.println(findString(s1,s3,start));
		
		System.out.println();
		
		System.out.println("CountString method Test Cases: ");
		System.out.println(countStrings(s4, s5));
		System.out.println("---------");
		System.out.println(countStrings(s1, s2));

		System.out.println();

		System.out.println("CountString method Test Cases: ");
		System.out.println(convertItalics(s6));

		
		
	
		
		
		
	}
	
	/**
 	* Finds the first instance of s in line,
 	* starting at the position start
 	* @param o the orignal string 
 	* @param s the string to find 
 	* @param start the position to start searching.
	* Guaranteed to be in the string line. (precondition)
	* @return the index of the first single instance of
	* s if the string is found OR -1 if it is not found.
	*/
	public static int findString(String o, String s, int start)
	{
		o = o.substring(start,o.length());
		int index = o.indexOf(s);	
		return index + start;
	
	}

	/**
	*Count the number of times instances of s appear in the line.
	*@param o the original string
	*@return the number of times the string appears in the line
	*/
	
	public static int countStrings(String o, String s)
	{
		int count = 0;
		int start = 0;
		while(start < o.length())
		{
			int index = findString(o, s, start); 
		
			if(index != -1)
			{
				count++;
				start = index + s.length();
			}
			else
				return count;
		}
		return count;
	
	}


/**
 * Replace all instances of underscores in the line given by
 * line with italics tags.  There must be an even number of underscores
 * in the line, and they will be replaced by <I>, </I>, alternating.
 * @param line a string with 0 or more underscores
 * @return the line that has underscores replaced with <I> </I> tags or 
 * the original line if there are not an even number of underscores.
 */
	 public static String convertItalics(String line)
	 {
	
	 	String dash = "_";
	 	int start = 0;
	 	int counter = 1;
	 	String s = "";
	 	
	 	System.out.println(line);
	 	
	 
	 	int count = countStrings(line, dash);
	 	
	 	System.out.println(count);
	 	
	 	if (count % 2 != 0) //odd number of dashes
	 		return line;
	 
	 	else 
	 	{
	 		int index = findString(line, dash, start);
	 		while( count > line.length())
	 		{
	 			if (line.substring(index + 1, index + 2).equals(dash)) //double dashes //need to implement into while loop
	 				count -= 2;
	 				findString(line, dash, count);
	 		
	 			index = findString(line, dash, start);
	 			//count -= 2 //to bypass the two dashes
	 			if(index != -1);
	 			{
	 				if (counter % 2 != 0)
	 				{	
	 					s = s.substring(0,index) + "<I>" + s.substring(index + 1);
	 					System.out.println(s);
	 				}
	 				else
	 				{
	 					s = s.substring(0,index) + "</I>" + s.substring(index + 1);
						System.out.println(s);
					}
	 			counter++;
	 			
	 			}
	 		}
	 		return line;

	 	}

	 			
	 		
 
	}
	
	
	
	
}

