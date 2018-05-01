import java.io.*;
import java.util.*;

/**
 *This class presents all the needed details for a featuring movie
 */
public class Movie
{
    
    private String title; 
    private String actor; 
    private boolean rated18; 
    private int length; 

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String title, String actor, boolean rated18, int length)
    {
        this.title = title; 
        this.actor = actor; 
        this.rated18= rated18; 
        this.length = length; 
    }

    public void displayMovie()
    {
        System.out.println( title);
      System.out.println("Featuring: "+ actor);
       System.out.println("Rated18? " +rated18);
        System.out.println("Length: " +length); 
    }

    public String getTitle()
    {
        return title; 
    }

    public String getActor()
    {
        return actor; 
    }

    public boolean getRating()
    {
        return rated18; 
    }

    public int getLength()
    {
        return length;
    }

    public void changeTitle(String nTitle)
    {
        title = nTitle; 
    }

    public void changeActor (String nActor)
    {
        actor = nActor; 
    }

    public void changeRating(boolean nRating)
    {
        rated18 = nRating; 
    }

    public void changeLength (int nLength)
    {
        length = nLength; 
    }

}
