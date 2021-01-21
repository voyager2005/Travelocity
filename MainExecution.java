import java.util.Scanner; 
public class MainExecution
{
    String hotel = "" ; 
    double cost = 0.0  ;

    public void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 

        //creating the objects 
        InputDetails            obj1 = new InputDetails(); 
        AirplaneSeatReservation obj2 = new AirplaneSeatReservation();
        TrainSeatReservation    obj3 = new TrainSeatReservation(); 
        AarogyaSetuApplication  obj4 = new AarogyaSetuApplication();
        HotelRoomReservation    obj5 = new HotelRoomReservation(); 
        PreBookMeals            obj6 = new PreBookMeals(); 

        //member methods of InputDetails
        obj1.displayWelcome();
        obj1.name(); 
        obj1.nameCapital();
        obj1.OtherDetails(); 

        //member method of AarogyaSetuApplication
        obj4.ArogyaSetuApplication(); 

        if(obj4.arogyaSetu == true)
        {
            //displaying the details for transportation 
            System.out.println("\f");
            System.out.println("We would like to display a few modes of transportaion options for your travel");
            System.out.println("Please select your mode of transportation: ");
            System.out.println("(1) for Aeroplane \n(2) for railways \n(3) for private transport");
            int ans = sc.nextInt();

            if( ans == 1)
            {
                //member methods of AirplaneSeatReservation
                obj2.displayAirplaneSeats(); 
                obj2.Choose(obj1);
            }
            else if ( ans == 2)
            {
                //member methods of TrainSeatReservation
                obj3.accept();
                obj3.update();
                obj3.display(obj1);
            }
            else
            {
                //nothing is to be done 
            }

            //displaying the details for hotel reservation 
            sc.nextLine().trim();
            System.out.println("\n\nDo you want to reserve a room?");

            if(sc.nextLine().equalsIgnoreCase("yes"))
            {

                //member methods of HotelRoomReservation 
                obj5.hotelRoomRerservation(obj1);

                //display the details for Prebook meals 
                System.out.println("Do you want to prebook meals? (yes/no)");

                if(sc.nextLine().trim().equalsIgnoreCase("yes"))
                {
                    //member methods of PreBookMeals
                    obj6.peopleCapacity(obj1); 
                    obj6.peopleCapacityCheck(obj1); 
                    obj6.timeReserve();
                    obj6.tableReserve(); 
                    obj6.tableCheck(); 
                    obj6.finalDisplay(obj1); 
                }
            }

            //displaying the estimates for the trip 
            cost = obj2.cost + obj3.cost + obj5.cost + obj6.bill;
            
            System.out.println();
            
            // displaying name 
            System.out.println("Name: " + obj1.name);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }

            //displaying date of travel
            System.out.println("Date of travel: " + obj1.date);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }

            //displaying phone number 
            System.out.println("Phone Number: " + obj1.phoneNumber );
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }

            //displaying current location 
            System.out.println("Current Location: " + obj1.currentLocation);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }

            //displaying destination 
            System.out.println("Destination: " + obj1.destination);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            }

            //displaying cost of flights
            if(obj2.cost > 0)
                System.out.println("Cost for Flight: " + obj2.cost);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }

            //Displaying the cost of train 
            if( obj3.cost > 0 )
                System.out.println("Cost for Train: " + obj3.cost);
            else
                System.out.print("");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }

            //displaying the cost of room
            if( obj5.cost > 0)
                System.out.println("Cost for Room: " + obj5.cost);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }

            //displaying the cost of meals 
            if ( obj6.bill > 0)
                System.out.println("Cost of Meals: " + obj6.bill);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }

            //displaying the total cost of the trip 
            System.out.println("\nCost of your Trip: " + cost);
            finalDisplay();
        }
    }

    String finalDisplay = "Thank You Hoping To See You Soon ☺" ;

    void finalDisplay()
    {
        for(int i = 0 ;i < finalDisplay.length() ; i++)
        {
            char ch = finalDisplay.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(150);
            }
            catch(Exception e)
            {

            }
        }
    }
}
