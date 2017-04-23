
/**
 * Write a description of class Bike here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bike extends Vehicle
{
    private int mpg;

    public Bike()
    {
        super();
    }
    
    public Bike(int n, int m, int x)
    {
        super(n, m);
        mpg = x;
    }
    
       public boolean compareTo(Comparable c)
    {
        return (c instanceof Bike);
    } 
}
