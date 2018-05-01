
/**
 * Contains multiple cinema theaters
 */
public class Cinema
{
    
    Theater t1; 
    Theater t2;
    Theater t3; 
    Theater selected; 

    /**
     * Constructor for objects of class Complex
     */
    public Cinema(Theater t1, Theater t2, Theater t3)
    {
        this.t1 = t1; 
        this.t2 = t2; 
        this.t3 = t3; 
    }

    public void display()
    {
        t1.display();
        t2.display(); 
        t3.display();

    }

    public Theater getT1()
    {
        return t1;
    }

    public Theater getT2()
    {
        return t2;
    }

    public Theater getT3()
    {
        return t3; 
    }

    public void getSelected(int select)
    {
        if (select <0 || select > 3)
        {
            System.out.println("Not possible, choose again"); 
            System.exit(0);
        }

        else if(select ==1)
        { selected = t1; 
            selected.display(); }
        else if(select ==2)
        { selected = t2; 
            selected.display();}
        else
        {
            selected = t3; 
            selected.display();
        }
    }

}
