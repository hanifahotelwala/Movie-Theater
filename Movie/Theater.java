
/**
 * Each theater shows a movie
 */
public class Theater
{
    
    private int capacity; 
    private int reservedSeats; 
    private boolean is3D; 
    Movie movieShowing; 

    /**
     * Constructor for objects of class Theater
     */
    public Theater(int capacity, boolean is3D, Movie movieShowing)
    {
        this.capacity = capacity; 
        this.is3D = is3D; 
        this.movieShowing = movieShowing; 
        reservedSeats =0; 
    }

    public void display()
    {

        movieShowing.displayMovie(); 
        System.out.println("Capacity: "+capacity); 
        System.out.println("Seats reserved: "+reservedSeats); 
        System.out.println("is3D? : " +is3D + "\n"); 


    }

    public int getCapacity()
    {
        return capacity; 
    }

    public int reservedSeats()
    {
        return reservedSeats;
    }

    public boolean is3D()
    {
        return is3D;
    }

    public String movieShowing()
    {
        return movieShowing.getTitle(); 
    }

    public void changeCapacity(int nCapacity)
    {
        capacity = nCapacity; 
    }

    private void changeReservedSeats (int newReservation)
    {
        reservedSeats=newReservation; 
    }

    public void changeIs3D( boolean is3D)
    {
        if (3D == 1)
            is3D = false; 
        else
            is3D=true; 
    }

    public void changeMovieShowing(Movie newMovie )
    {

        movieShowing = newMovie; 
    }

    public boolean reservation(int seats)
    {
        if (seats > capacity-reservedSeats)
        { 

            return false; 
        }
        else
        {
            reservedSeats+=seats; 
            return true; 
        }
    }

}
