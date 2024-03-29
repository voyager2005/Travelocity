import java.util.Scanner; 
public class HotelRoomReservation
{
    int[] singleBed = {1,2,3,4,5};
    int[] doubleBed = {6,7,8,9,10};
    double cost = 0.0 ; 

    void hotelRoomRerservation(InputDetails obj1)
    {
        Scanner sc = new Scanner(System.in);

        boolean contd = true ;
        int[] finalRoomNumber = {1,3,2,6,5} ;
        int counter = 0 ; 

        System.out.println("\f");
        System.out.println("Welcome to Hotel Room Reservation");
        System.out.println("");
        System.out.println("Do you want to book a room with");
        System.out.println("(a) 1 King Size Bed");
        System.out.println("(b) 2 King Size Beds");
        System.out.println("(c) 1 Queen Size Bed");
        System.out.println("(d) 2 Queen Size Beds");
        System.out.println("(e) dormantry");

        while( contd = true)
        {
            System.out.println("Your choice please: ");
            String room = sc.nextLine().trim();

            if( room.equalsIgnoreCase("a"))
            {
                System.out.println("your room has been booked on " + obj1.date + " from 12:00noon for 23 hours ");
                System.out.println("Your Room Number is 10"+finalRoomNumber[counter]);

                //adding the cost 
                this.cost = this.cost + 8499 ;

                //dislpay 
                System.out.println("Room Specifications ");
                System.out.println("Room Service: YES");
                System.out.println("AC: +599 (optional) (extra amount to be paid at hotel) ");
                System.out.println("Meals: (optional) (extra amount to be paid at hotel) ");
            }
            else if( room.equalsIgnoreCase("b"))
            {
                System.out.println("your room has been booked on " + obj1.date + " from 12:00noon for 23 hours ");
                System.out.println("Your Room Number is 11"+finalRoomNumber[counter]);

                //adding the cost 
                this.cost = this.cost + 14999;

                //dislpay 
                System.out.println("Room Specifications ");
                System.out.println("Room Service: YES ");
                System.out.println("AC: +599 (optional) (extra amount to be paid at hotel) ");
                System.out.println("Meals: (optional) (extra amount to be paid at hotel) ");
            }
            else if( room.equalsIgnoreCase("c"))
            {
                System.out.println("your room has been booked on " + obj1.date + " from 12:00noon for 23 hours ");
                System.out.println("Your Room Number is 20"+finalRoomNumber[counter]);

                //adding the cost 
                this.cost = this.cost + 4499 ;

                //dislpay 
                System.out.println("Room Specifications ");
                System.out.println("Room Service: NO");
                System.out.println("AC: +599 (optional) (extra amount to be paid at hotel) ");
                System.out.println("Meals: (optional) (extra amount to be paid at hotel) ");
            }
            else if( room.equalsIgnoreCase("d"))
            {
                System.out.println("your room has been booked on " + obj1.date + " from 12:00noon for 23 hours ");
                System.out.println("Your Room Number is 21"+finalRoomNumber[counter]);

                //adding the cost 
                this.cost = this.cost + 8999 ;

                //dislpay 
                System.out.println("Room Specifications ");
                System.out.println("Room Service: YES ");
                System.out.println("AC: +599 (optional) (extra amount to be paid at hotel) ");
                System.out.println("Meals: (optional) (extra amount to be paid at hotel) ");
            }
            else if( room.equalsIgnoreCase("e"))
            {
                System.out.println("your room has been booked on " + obj1.date + " from 12:00noon for 23 hours ");
                System.out.println("Your Room Number is #0"+finalRoomNumber[counter]);

                //adding the cost 
                this.cost = this.cost +  7499 ;

                //dislpay 
                System.out.println("Room Specifications ");
                System.out.println("Room Service: NO");
                System.out.println("AC: +599 (optional) (extra amount to be paid at hotel) ");
                System.out.println("Meals: (optional) (extra amount to be paid at hotel) ");
            }
            else
            {
                System.err.println("ROOM NOT SPECIFICATIONS NOT FOUND!! \n you can do the following and try again \n1. check the spelling Ex. 2 King Size Bed insted of 2 King Size Bed(s)  ");
            }

            counter++ ;

            System.out.println("\nDo you want to Book Another Room (yes/no)");
            String ans = sc.nextLine().trim();

            if(counter<5 && ans.equalsIgnoreCase("yes"))
            {
                contd = true; 
            }
            else if ( counter == 5)
            {
                System.err.println("\n UNFORTUNATELY ALL THE ROOMS ARE BOOKED :(");
                break;
            }
            else if ( ans.equalsIgnoreCase("no"))
            {
                break;
            }
        }

    }
}

