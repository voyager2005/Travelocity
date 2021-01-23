# Travelocity

![GitHub issues](https://img.shields.io/github/issues/voyager2005/travel-accomodation?logo=Github&style=plastic)
![GitHub repo size](https://img.shields.io/github/repo-size/voyager2005/travel-accomodation?logo=Github&style=plastic)
![GitHub language count](https://img.shields.io/github/languages/count/voyager2005/travel-accomodation?logo=Github&style=plastic)

<br />This is a program that I did as my school assignment. This contains 7 classes that are interlinked wiht each other 
<br />I have tried my best to include exception handling for each input. Let me know in the comments if there are any parts of the program that do not have exception handling
<br />
<br />**_Feel free to contact me on my [mail]. Do not forget to ⭐ this repository of you liked it so that more people can benefit from this code._**

[mail]: mailto:voyager2005.github@gmail.com

## Announcements 🔊:
Some updates as of **_4:09pm 20-01-21_**
<br />• based on request from friends and all the mails I will be creating individual code samples of all the above class. Hopefully I can complete that within a few weeks. Thanks
<br />• I have already created one for AirplaneSeatReservation. You can view that repository [here]

[here]: https://github.com/voyager2005/aeroplane-seat-reservation.git

## Key:
[License and copyright]
<br />[Output]
<br />[Exception Handling]
<br />[Thread.sleep(<time_in_millisecods>);]

[Guide in steps]: https://github.com/voyager2005/Travelocity#guide-in-steps
[License and copyright]: https://github.com/voyager2005/Travelocity#license-and-copyright
[Output]: https://github.com/voyager2005/Travelocity#output
[Exception Handling]: https://github.com/voyager2005/Travelocity#exception-handling
[Thread.sleep(<time_in_millisecods>);]: https://github.com/voyager2005/Travelocity#threadsleeptime_in_millisecods

## License and copyright
© Akshat G
<br />Licensed under [MIT license](LICENSE)
## Output
**1. [layout]:**
<br />![image1](https://user-images.githubusercontent.com/76808676/103506037-ce128500-4e81-11eb-9eb1-cf8e0e532bdb.png)
**2. starting the program**:
<br />![image2](https://user-images.githubusercontent.com/76808676/103506038-ceab1b80-4e81-11eb-897d-f911b36a0ec1.png)
<br />![image3](https://user-images.githubusercontent.com/76808676/103506039-ceab1b80-4e81-11eb-9157-9029e37ce97b.png)
<br />
**3. Output**:
![image4](https://user-images.githubusercontent.com/76808676/103506041-cf43b200-4e81-11eb-865b-736b44af785c.png)
![image5](https://user-images.githubusercontent.com/76808676/103506042-cfdc4880-4e81-11eb-858a-01e1bcefbdef.png)
![image6](https://user-images.githubusercontent.com/76808676/103506044-cfdc4880-4e81-11eb-84d1-3bc478f6508c.png)
![image7](https://user-images.githubusercontent.com/76808676/103506045-d074df00-4e81-11eb-9541-bfe58d8da7cc.png)
![image8](https://user-images.githubusercontent.com/76808676/103506047-d10d7580-4e81-11eb-8a17-83aa6135f117.png)
![image9](https://user-images.githubusercontent.com/76808676/103506048-d10d7580-4e81-11eb-9417-4e04ae5370d5.png)
![image10](https://user-images.githubusercontent.com/76808676/103506049-d1a60c00-4e81-11eb-9876-f67ed4917a64.png)

## Exception Handling:
1. while accepting the phone number, phone numbers length should be 10 digits long. the check for that is as follows: 
```
System.out.println("Phone Number: ");
        System.out.println();
        phoneNumber = sc.nextLine().trim(); 
        if( phoneNumber.length() != 10)
        {
            boolean flag = false; 
            while(flag == false)
            {
                System.out.println("Please make sure that the phone number that you have entered is 10 digits long" + 
                "\nThe phone number entered by you was " + phoneNumber.length() + " digits long");
                phoneNumber = sc.nextLine().trim();
                
                if(phoneNumber.length() == 10)
                {
                    flag = true; 
                }
            }
        }
```
2. cannot book the seat that you have already booked in [AirplaneSeatReservation]
<br />There are a 2 sets of arrays that are used to hold the numerical and the character value of the seat, note: variables are not the same as to the program.
lets take that the user had entered 1F which has not been booked 
```
seat = sc.nextLine().trim()
```
now we are using the charAt() method to remove the numerical and character part of the string
```
char numerical = seat.charAt(0); 
char character = seat.charAt(1); 
```
now we check if any of the reserved seats match the numerical and character
```
for( int i = 0 ; i < reservedSeatsNumerical.length; i++)
{
  if(reservedSeatNumerical[i] == numerical && reservedSeatCharacter[i] == character)
  {
    System.out.println(seat + " has already been reserved); 
  }
}
```
To prevent the user from booking that seat again we do this, there are a total of 25 predefined reserved seats in my program, so I have a variable index which stores the total no of reserve seats, ie: index = 24. note: this is in the else part of the above code
```
else
{
  index++; 
  reservedSeatNumerical[index] = numerical;
  reservedSeatCharacter[index] = character; 
}
```
now the user will not be able to book that seat again 
## Thread.sleep(<time_in_millisecods>); 
Thread.sleep(<time_in_milliseconds>) causes errors if used directly. 
To attain an output like someone is typing the code on the terminal you need to use this code:
<br />
1. declare a string that contains the code that you want to print on the terminal
```
String line1 = "what is your name?"; 
```
2. now you need to add a loop to print this word by word.
``` 
for(int i = 0; i < line1.length() ; i++)
{
  char ch = line1.charAt(i); 
  System.out.print(ch)
}
```
Here you are printing word by word but since java is an extremely fast language you will not be able to differentiate directly printing and printing like this so...
<br />now we add a try{ } catch(){ } block to add delays in the loop
```
for(int i = 0; i < line1.length() ; i++)
{
  char ch = line1.charAt(i); 
  System.out.print(ch)
  
  try
  {
    Thread.sleep(25);
  }
  catch(Exception e)
  {
  }
}
```
The updated loop will look something like this ↑.

[AirplaneSeatReservation]: https://github.com/voyager2005/Travelocity/blob/main/AirplaneSeatReservation.java
