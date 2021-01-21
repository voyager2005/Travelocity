
/**
 * Write a description of class PreBookMeals here.
 *
 * @author (your obj.name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 
public class PreBookMeals
{
    int       people        =  0 ; 
    int       time          =  0 ; 
    int       bill          =  0 ; 
    int       foodType      =  0 ;  
    String    table         = "" ; 
    String    timeColon     = "" ;
    String    feedback      = "" ;
    String    timeColon2    = "" ;
    String    response      = "" ;

    InputDetails obj = new InputDetails();
    void peopleCapacity(InputDetails obj)
    {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("\n\nHi! " + obj.name + " for how many people do you want to reserve the seat? ") ; 

        people = sc.nextInt(); 
    }

    void peopleCapacityCheck(InputDetails obj)
    {
        if(people < 0 )
        {
            System.out.println("\nOOPS‼ looks like you have entered a negative value for people! "); 
            peopleCapacity(obj);
        }
        if(people >= 50)
        {
            System.out.println("\nOOPS‼ we donot have seats for "+ people +" people today \nYou can contact our manager +91 97*** ***** ☺" ); 
            peopleCapacity(obj); 
        }
    }

    void timeReserve()
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("\nAt what time do you want to reserve the seat for " + people + "\nPlease enter time in 24:00 hour format");  
        timeColon = sc.nextLine().trim(); 

        timeColon2 = timeColon ; 

        timeColon(); 
    }

    void timeColon()
    {
        int count = 0 ; 
        //removes the ':' in the time if there is any present in it
        for(int i = 0 ; i < timeColon.length(); i++)
        {
            char ch = timeColon.charAt(i); 
            if(ch == ':')
            {
                int index = timeColon.indexOf(':');                  
                String firstHalf = timeColon.substring(0,index);      
                String secondHalf = timeColon.substring((index+1));    
                if( Integer.parseInt(secondHalf) >= 60 )
                {
                    System.out.println("\nPlease make sure that you are entering a valid timings"); 
                    timeReserve(); 
                }
                String time = firstHalf.concat(secondHalf);            
                this.time = Integer.parseInt(time);                   
                count++ ; 
                break; 
            }
        }

        if (count == 0)
        {
            this.time = Integer.parseInt(timeColon) ; 
        }

        timeCheck(); 
    }

    void timeCheck()
    {
        if(time >= 800 && time <= 2200)
        {
            vegORnonveg(); 
        }
        else
        {
            System.out.println("\nthe hotel will be closed at that time please select another time for the visit "); 
            timeReserve();  
        }
    }

    void tableReserve()
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("\nWhere do you want to reserve your table for " + people + "\nOption : \n(a) Barbeque \n(b) Pool Facing \n(c) Garden \n(please choose a, b or c)") ;
        table = sc.nextLine().trim();          
    }

    void tableCheck()
    {
        if(table.equalsIgnoreCase("a"))
        {
            table = "Barbeque" ; 
        }
        else if (table.equalsIgnoreCase("b"))
        {
            table = "Pool Facing" ; 
        }
        else if(table.equalsIgnoreCase("c"))
        {
            table = "Garden" ; 
        }
        else
        {
            System.out.println("\nLooks like your table reservation was invalid please check the spelling, case doesnot matter"); 
            tableReserve(); 
        }
    }

    void vegORnonveg()
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("");
        System.out.println("§§§§§§§§§§§§§§§ M E N U §§§§§§§§§§§§§§§"); 
        System.out.println("§                                     §"); 
        System.out.println("§           1. Vegitarian             §"); 
        System.out.println("§           2. Non Vegitarian         §"); 
        System.out.println("§           3. Fast Food              §");
        System.out.println("§                                     §"); 
        System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§"); 

        int foodType = sc.nextInt();
        //checking if it is veg or nonveg 
        switch(foodType)
        {
            case 1: menuDisplay_veg(); 
            break; 

            case 2: menuDisplay_NonVeg(); 
            break; 

            case 3: menuDisplay_FastFood(); 

            default: 
            while( foodType == 1 || foodType == 2)
            {
                System.out.println("\nOOPS!! looks like you have made a wrong choice! \nPlease make your choice"); 
                foodType = sc.nextInt(); 
            }
            break; 
        }
    }

    void menuDisplay_veg()
    {
        System.out.println("\f"); 
        if(time >= 800 && time <= 1200)
        {
            System.out.println("**********♣VEG BREAKFAST MENU♣*********"); 
            System.out.println("ITEM                              PRICE");
            System.out.println("                                       "); 
            System.out.println("1.Idli (2 pcs.)                   ₹ 40"); 
            System.out.println("2.Vada (2 pcs.)                   ₹ 40"); 
            System.out.println("3.Idli Vada                       ₹ 45"); 
            System.out.println("4.Masal Dosa                      ₹ 45"); 
            System.out.println("5.Kesari bath                     ₹ 35"); 
            System.out.println("6.Upma                            ₹ 50"); 
            System.out.println("7.Set Dosa                        ₹ 50"); 
            System.out.println("8.Puri                            ₹ 55");
            System.out.println("                                    ");
            System.out.println("************♣BEVERAGE MENU♣************"); 
            System.out.println("ITEM                             PRICE"); 
            System.out.println("                                    "); 
            System.out.println("9.Coffee                          ₹ 20");
            System.out.println("10.Tea                            ₹ 20");
            System.out.println("11.Cold Coffee                    ₹ 45");
            System.out.println("12.Masala Tea                     ₹ 45");

            //taking line of execution to method billComputeBreakfast()
            billCompute_Breakfast_Veg(); 
        }
        else if(time >= 1200 && time <= 2200)
        {
            System.out.println("************♣VEG LUNCH MENU♣************"); 
            System.out.println("ITEM                              PRICE"); 
            System.out.println("                                    "); 
            System.out.println("1.Roti                             ₹ 40"); 
            System.out.println("2.Paneer Butter Masala             ₹ 60"); 
            System.out.println("3.Dal Makhni                       ₹ 60"); 
            System.out.println("4.South Indian Meal                ₹ 160"); 
            System.out.println("5.North Indian Meal                ₹ 160"); 
            System.out.println("***************♣BEVERAGES♣***************"); 
            System.out.println("ITEM                             PRICE"); 
            System.out.println("                                      "); 
            System.out.println("6.Coffee                          ₹ 20");
            System.out.println("7.Tea                             ₹ 20");
            System.out.println("8.Cold Coffee                     ₹ 45");
            System.out.println("9.Masala Tea                      ₹ 45");
            System.out.println("10.Ice Tea                        ₹ 60");
            System.out.println("11.Milk Shake                     ₹ 60");

            //taking execution of program to billComputeLunch()
            billCompute_Lunch_Veg(); 
        }
    }

    void menuDisplay_NonVeg()
    {
        System.out.println("\f"); 
        System.out.println("*****♣NON VEG BREAKFAST/LUNCH MENU♣****"); 
        System.out.println("                                      "); 
        System.out.println("ITEM                              PRICE"); 
        System.out.println("1.Tandoori Chicken                ₹ 40"); 
        System.out.println("2.Afghani Chicken                 ₹ 40"); 
        System.out.println("3.Chicken Tikka                   ₹ 45"); 
        System.out.println("4.Mutton Sheek Kebab              ₹ 45"); 
        System.out.println("5.Chicken Stuff Kebab             ₹ 50"); 
        System.out.println("6.Chicken Biriyani                ₹ 50"); 
        System.out.println("7.Chicken Noodles                 ₹ 50"); 
        System.out.println("8.Meat Balls                      ₹ 55");
        System.out.println("************♣BEVERAGE MENU♣************"); 
        System.out.println("ITEM                             PRICE"); 
        System.out.println("                                    "); 
        System.out.println("9.Coffee                          ₹ 20");
        System.out.println("10.Tea                            ₹ 20");
        System.out.println("11.Cold Coffee                    ₹ 45");
        System.out.println("12.Masala Tea                     ₹ 45");

        //taking line of execution to method billComputeBreakfast()
        billCompute_NonVeg(); 
    }

    void menuDisplay_FastFood()
    {
        System.out.println("\f"); 
        System.out.println("************♣FAST FOOD MENU♣***********"); 
        System.out.println("ITEM                              PRICE"); 
        System.out.println("                                       "); 
        System.out.println("1.Burger Veg                      ₹ 40"); 
        System.out.println("2.Burger Non Veg                  ₹ 40"); 
        System.out.println("3.Pastry (Egg less)               ₹ 45"); 
        System.out.println("4.Sandwhich                       ₹ 45"); 
        System.out.println("5.Pastry (With egg)               ₹ 50"); 
        System.out.println("6.Pizza                           ₹ 100"); 
        System.out.println("7.Cake                            ₹ 100"); 
        System.out.println("8.Donut (4 pic)                   ₹ 100");
        System.out.println("                                    "); 
        System.out.println("************♣BEVERAGE MENU♣************"); 
        System.out.println("ITEM                             PRICE"); 
        System.out.println("                                    "); 
        System.out.println("9.Coffee                          ₹ 20");
        System.out.println("10.Tea                            ₹ 20");
        System.out.println("11.Cold Coffee                    ₹ 45");
        System.out.println("12.Masala Tea                     ₹ 45");

        //taking line of execution to method billComputeBreakfast()
        billCompute_FastFood(); 
    }

    void billCompute_Breakfast_Veg()
    {   
        //calling Scanner class
        Scanner sc = new Scanner(System.in);

        //declaraton and initialization 
        int n = 1 ; 
        int q = 1 ; 
        int check = 1 ; 

        //display statement
        System.out.println(); 

        //loop to calculate bill
        while( check > 0 )
        {
            //display sttement 
            System.out.println("Please enter serial number "); 
            n = sc.nextInt(); 
            System.out.println("Please enter quantity"); 
            q = sc.nextInt(); 

            if( n == 9 || n == 10 )
            {
                bill = bill + 20 * q ; 
            }
            else if( n == 5)
            {
                bill = bill + 35 * q ; 
            }
            else if( n == 1 || n == 2 )
            {
                bill = bill + 40 * q ; 
            }
            else if( n == 3 || n == 4 || n == 11 || n == 12)
            {
                bill = bill + 45 * q ; 
            }
            else if( n == 6 || n == 7 )
            {
                bill = bill + 50 * q ; 
            }
            else if( n == 8)
            {
                bill = bill + 55 * q ; 
            }

            System.out.println("continue / exit (1/0)"); 
            check = sc.nextInt(); 
        }
    }

    void billCompute_Lunch_Veg()
    {
        //calling Scanner class
        Scanner sc = new Scanner(System.in);

        //declaraton and initialization 
        int n = 1 ;
        int q = 1 ; 
        int check = 1 ; 

        //display statement
        System.out.println(); 

        //loop to calculate bill
        while( check > 0 )
        {
            //display sttement 
            System.out.println("Please enter serial number "); 
            n = sc.nextInt(); 
            System.out.println("Please enter quantity"); 
            q = sc.nextInt(); 

            if( n == 6 || n == 7 )
            {
                bill = bill + 20 * q ; 
            }
            else if( n == 1 )
            {
                bill = bill + 40 * q ; 
            }
            else if( n == 8 || n == 9 )
            {
                bill = bill + 45 * q ; 
            }
            else if(n == 2 || n == 3 || n == 10 || n == 11)
            {
                bill = bill + 60 * q ; 
            }
            else if( n == 4 || n == 5 )
            {
                bill = bill + 160 * q ; 
            }

            System.out.println("continue / exit (1/0)"); 
            check = sc.nextInt(); 
        }
    }

    void billCompute_NonVeg()
    {
        //calling Scanner class
        Scanner sc = new Scanner(System.in);

        //declaraton and initialization 
        int n = 1 ; 
        int q = 1 ; 
        int check = 1 ; 

        //display statement
        System.out.println(); 

        //loop to calculate bill
        while( check > 0 )
        {
            //display sttement 
            System.out.println("Please enter serial number "); 
            n = sc.nextInt(); 
            System.out.println("Please enter quantity"); 
            q = sc.nextInt(); 

            if( n == 9 || n == 10 )
            {
                bill = bill + 20 * q ; 
            }
            else if( n == 5)
            {
                bill = bill + 50 * q ; 
            }
            else if( n == 1 || n == 2 )
            {
                bill = bill + 40 * q ; 
            }
            else if( n == 3 || n == 4 || n == 11 || n == 12)
            {
                bill = bill + 45 * q ; 
            }
            else if( n == 6 || n == 7 )
            {
                bill = bill + 50 * q ; 
            }
            else if( n == 8)
            {
                bill = bill + 55 * q ; 
            }

            System.out.println("continue / exit (1/0)"); 
            check = sc.nextInt(); 
        }
    }

    void billCompute_FastFood()
    {
        //calling Scanner class
        Scanner sc = new Scanner(System.in);

        //declaraton and initialization 
        int n = 1 ; 
        int q = 1 ; 
        int check = 1 ; 

        //display statement
        System.out.println(); 

        //loop to calculate bill
        while( check > 0 )
        {
            //display sttement 
            System.out.println("Please enter serial number "); 
            n = sc.nextInt(); 
            System.out.println("Please enter quantity"); 
            q = sc.nextInt(); 

            if( n == 9 || n == 10 )
            {
                bill = bill + 20 * q ; 
            }
            else if( n == 5)
            {
                bill = bill + 50 * q ; 
            }
            else if( n == 1 || n == 2 )
            {
                bill = bill + 40 * q ; 
            }
            else if( n == 3 || n == 4 || n == 11 || n == 12)
            {
                bill = bill + 45 * q ; 
            }
            else if( n == 6 || n == 7 )
            {
                bill = bill + 100 * q ; 
            }
            else if( n == 8)
            {
                bill = bill + 100 * q ; 
            }

            System.out.println("continue / exit (1/0)"); 
            check = sc.nextInt(); 
        }
    }

    void finalDisplay(InputDetails obj)
    {
        Scanner sc = new Scanner(System.in);  

        System.out.println("\nWelcome " + obj.name + " your seat reservation (" + table + ") at " + timeColon2 + " has been confirmed ☺ ");

        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
        }

        System.out.println(); 

        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
        }
        
        String display = "Processing bill estimates.......";
        for(int i = 0 ;i < display.length() ; i++)
        {
            char ch = display.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(55);
            }
            catch(Exception e)
            {

            }
        }
    }
}
