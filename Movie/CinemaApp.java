import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 * ComplexApp holds the main function. 
 */
public class CinemaApp

{
    public static void main(String [] args )
    {
        Scanner s = new Scanner(System.in);
        String input;
        int pick; 
        int reserve; 
        int age; 
        char choice; 
        int ticket = 7; 
        int movie3D = 2; 
        int total =0; 

        Movie movie1 = new Movie("Titanic", "Leonardo Dicaprio", true, 120); 
        Movie movie2 = new Movie("Mean Girls", "Lindsey Lohan", false, 75); 
        Movie movie3 = new Movie("The Notebook", "Ryan Gosling", false, 80);
        Movie selectedMovie; 

        Theater t1 = new Theater (180, true, movie1); 
        Theater t2 = new Theater(180, true, movie2); 
        Theater t3 = new Theater(180, false, movie3); 
        Theater selectedTheater; 

        Cinema smg = new Cinema (t1, t2, t3); 

        while(true)
        {
            System.out.println("=========================================================");
            System.out.println("Welcome to SMG! ");
            System.out.println("Please select one of the following:");
            System.out.println("Press 'd' to display movies playing at SMG.");
            System.out.println("Press 's' to select a movie and make a reservation.");
            System.out.println("Press 'e' to exit the program.");
            System.out.print("Your choice: "); 

            input = s.nextLine(); 
            System.out.println("=========================================================");
           
          
            choice = input.trim().toLowerCase().charAt(0);

            switch(choice)
            {
                case 'd':
                System.out.println();
                smg.display();
                break;

                case 's':
                do 
                { 
                    System.out.println("Pick Movie (1, 2, or 3): "); 
                    input = s.nextLine(); 
                    System.out.println(); 
                    pick = Integer.parseInt(input); 
                    smg.getSelected(pick);
                    System.out.println(); 

                    System.out.println("How many seats would you like to reserve?"); 
                    input= s.nextLine(); 
                    reserve = Integer.parseInt(input);

                    if (pick ==1) 
                    {
                        t1.reservation(reserve);  
                        if(t1.reservation(reserve) == false)
                        {
                            System.out.println("Sorry this reservation is not possible."); 
                            System.exit(0); 
                            break; 
                        }

                        selectedMovie = movie1;  
                        selectedTheater = t1;  

                        if(selectedMovie.getRating() == true)
                        {   System.out.println(); 
                            System.out.println("What is your age?"); 
                            input=s.nextLine(); 
                            age = Integer.parseInt(input); 
                            System.out.println(); 
                            if(age<18)
                            {
                                System.out.println("Sorry you are too young. This reservation will be cancelled.");
                                System.out.println(); 
                                break; 
                            }
                        }

                        if( selectedTheater.is3D() == true)
                        {
                            total = (ticket*reserve) + (movie3D*reserve);
                            System.out.println( "Your total is " +total + " euros."); 

                        }
                        else
                        {
                            total =ticket*reserve;
                            System.out.println( "Your total is " +total + " euros."); 
                        }

                    }
                    else if (pick ==2)
                    {
                        t2.reservation(reserve); 
                        if(t1.reservation(reserve) == false)
                        {
                            System.out.println("Sorry this reservation is not possible."); 
                            System.exit(0); 
                            break;
                        }
                        selectedMovie = movie2; 
                        selectedTheater =t2; 
                        if(selectedMovie.getRating() == true)
                        {   
                            System.out.println(); 
                            System.out.println("What is your age?"); 
                            System.out.println(); 
                            input=s.nextLine(); 
                            age = Integer.parseInt(input); 
                            System.out.println(); 
                            if(age<18)
                            {System.out.println("Sorry you are too young, This reservation will be cancelled. ");
                                System.out.println();
                                break; }
                        }

                        if( selectedTheater.is3D() == true)
                        {
                            total =(ticket*reserve) + (reserve*movie3D);
                            System.out.println( "Your total is " +total + " euros."); 

                        }
                        else
                        {
                            total =ticket*reserve;
                            System.out.println( "Your total is " +total + " euros."); 
                        }

                    }
                    else if (pick==3)
                    {
                        t3.reservation(reserve); 
                        if(t1.reservation(reserve) == false)
                        {
                            System.out.println("Sorry this reservation is not possible."); 
                            System.exit(0); 
                            break;
                        }
                        selectedMovie = movie3; 
                        selectedTheater = t3; 
                        if(selectedMovie.getRating() == true)
                        {   System.out.println(); 
                            System.out.println("What is your age?"); 
                            input=s.nextLine(); 
                            age = Integer.parseInt(input); 
                            System.out.println(); 
                            if(age<18)
                            {System.out.println("Sorry you are too young. This reservation will be cancelled."); 
                                System.out.println();
                                break;
                            }
                        }

                        if( selectedTheater.is3D() == true)
                        {
                            total =(ticket*reserve) + (reserve*movie3D);
                            System.out.println( "Your total is " +total + " euros."); 

                        }
                        else
                        {
                            total =ticket*reserve;
                            System.out.println( "Your total is " +total + " euros."); 
                        }

                    }

                }
                while( pick <=0 || pick >3);
                break; 

                case 'e':
                {
                    System.exit(0); 
                    break; 
                }

                default:
                System.out.println("Please choose one of the options");
                break;	

            }
        }

    }
}
