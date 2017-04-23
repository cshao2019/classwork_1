
/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Truck extends Vehicle
{
    private int cargo; 

    public Truck()
    {
        super();
    }
    
    public Truck(int n, int m, int c)
    {
        super(n, m);
        cargo = c;
    }
    
        public boolean compareTo(Comparable c)
    {
        return (c instanceof Truck);
    }
}
