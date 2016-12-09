import java.util.ArrayList; // when using array list, always have to import array list

public class ArrayListEx
{
	public static void main(String[] args)
	{
	
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(a.size()); //how many elements in the array
		a.add(3); // what you put in needs to be object. Integer is okay through auto box
		//will internalize the primitive literal and change it to its class ie. Integer
		//now it is reference
		//when it is already created, then it will no go through the auto box, follow 
		//established reference
		a.add(4);
		System.out.println(a.size());
		System.out.println(a); 
		
		//ie
		// Class of j : Integer
		//5 is a primitive --> auto box --> class = Integer
		Integer j = new Integer(5);
		
		//default: adds new value at the end of the array/array list
		a.add(j);
		System.out.println(a);
		j = 6;
		System.out.println(j);
		System.out.println(a);
		a.add(0,-3); //inserting -3 at position 0. Push everything by back one starting from beginning
		System.out.println(a);
		a.set(a.size()-1, 6); //.set is replacing //a.size() - 1 to get the last element
		System.out.println(a);
		
		a.add(a.size(), 1);
		System.out.println(a);
		
		a.set(1,-2);
		
		System.out.println(a.size());
		System.out.println(a);
		
		a.remove(0); //changes the size and index
		
		System.out.println(a.size());
		System.out.println(a);
		
		
		
//		a.add(9, 1); // index out of range error. .add is inserting inserting at place. // dependent on size of arraylist
//		runtime error
// 		.set() can only replace when there was something formerly there in that space in the array list
//		.remove(index where you want to remove) also overloaded. If that index does not exist --> runtime error
		
	}
	
	
}