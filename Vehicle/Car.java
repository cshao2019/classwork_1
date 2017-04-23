
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Car extends Vehicle 
{
    private int passengers;
    
    public Car()
    {
        super();
    }
    
    public Car(int n, int m, int p)
    {
        super(n, m);
        passengers = p;
    }
    
    public boolean compareTo(Comparable c)
    {
        return (c instanceof Car);
    } 

}
