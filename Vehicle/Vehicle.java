
/**
 * Abstract class Vehicle - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Vehicle implements Comparable<Vehicle>
{
    private int numWheels;
    private int maxSpeed;
    private int mpg;
    public Vehicle()
    {
        numWheels = 0;
        maxSpeed = 0;
    }
    
    public Vehicle( int n, int m)
    {
        numWheels = n;
        maxSpeed = m;
    }
    
    public int getNumWheels()
    {
        return numWheels;
    }
    
    public int maxSpeed()
    {
        return maxSpeed;
    }
    
    public int CompareTo(Vehicle v)
    {
        return this.mpg - v.mpg;
    }
    
}
