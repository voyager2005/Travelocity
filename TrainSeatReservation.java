// This code was contributed by https://github.com/voyager2005

import java.util.Scanner;
public class TrainSeatReservation 
{
    //instance variables
    String coach; 
    double amt; 
    double cost = 0.0 ;
    
    //default Constructor 
    TrainSeatReservation()
    {
        this.coach = " "; 
        this.amt = 0.0 ; 
        this.cost = 0.0 ;
    }
    
    //member mothods 
    void accept()
    {
        //Declaration 
        Scanner input = new Scanner(System.in);
        InputDetails obj1 = new InputDetails(); 
        
        //prompt and accept the values
        System.out.println("Coach: \n(a) First_AC \n(b) Second_AC \n(c) Third_Ac \n(d) Sleeper");
        this.coach = input.nextLine().trim();
        
        System.out.println("Your coach's base amount: ");
        this.amt = input.nextDouble();
    }
    
    void update()
    {
        if(this.coach.equalsIgnoreCase("a"))
        {
            this.cost = this.amt + 700;
        }
        else if(this.coach.equalsIgnoreCase("b"))
        {
            this.cost = this.amt + 500;
        }
        else if(this.coach.equalsIgnoreCase("c"))
        {
            this.cost = this.amt + 250;
        }
        else
        {
            this.cost = this.amt;
        }
    }
    
    void display(InputDetails obj1)
    {   
        System.out.println("Name: " + obj1.name);
        System.out.println("Date of Travel: " + obj1.date);
        System.out.println("Coarch: " + this.coach);
    }
}
