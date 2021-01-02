// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class AarogyaSetuApplication
{
    // instance variables 
    public String response    = "" ; 
    public   int   counter    =  0 ;
    boolean arogyaSetu = false; 

    String text1 = "Please note that information from this chat will be used for monitoring & management of the current health crisis ";
    String text1_1 = "and research in the fight against COVID-19 ";
    String text2 = "Please answer with a yes/no";

    String text3 = "Are you experiencing any of the following symptoms? ";
    String text3_1 = "Cough, Fever, Difficulty in breathing, loss of senses and taste ";

    String text4 = "Have you ever had any of the following: ";
    String text4_1 = "Diabetes, Hypertension, Lung disease, Heart Disease, Kidney Disorder";

    String text5 = "Have you travelled anywhere internationally in the last 28-45 days?"; 

String text6 = "Do any of the following apply to you?";
    String text6_1 = "I have recently interacted or lived with someone who has tested positive for COVID -19 ";
    String text6_2 = "I am a healthcare worker and I examined a COVID-19 confirmed case without protective gear";

void ArogyaSetuApplication()
    {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0 ;i < text1.length() ; i++)
        {
            char ch = text1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }

        for(int i = 0 ;i < text1_1.length() ; i++)
        {
            char ch = text1_1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();
        System.out.println();

        for(int i = 0 ;i < text2.length() ; i++)
        {
            char ch = text2.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();
        System.out.println();
        
        
        //Question 1
        
        for(int i = 0 ;i < text3.length() ; i++)
        {
            char ch = text3.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();

        for(int i = 0 ;i < text3_1.length() ; i++)
        {
            char ch = text3_1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();

        response = sc.nextLine().trim(); 
        if(response.equalsIgnoreCase("yes"))
        {
            counter++; 
        }
        response = "" ; 

        System.out.println();
        System.out.println();
        
        //Question 2
        
        for(int i = 0 ;i < text4.length() ; i++)
        {
            char ch = text4.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();

        for(int i = 0 ;i < text4_1.length() ; i++)
        {
            char ch = text4_1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }
        System.out.println();

        response = sc.nextLine().trim(); 
        if(response.equalsIgnoreCase("yes"))
        {
            counter++; 
        }
        response = "" ;

        System.out.println();
        System.out.println();
        
        //Question 3
        
        for(int i = 0 ;i < text5.length() ; i++)
        {
            char ch = text5.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();

        response = sc.nextLine().trim(); 
        if(response.equalsIgnoreCase("yes"))
        {
            counter++; 
        }
        response = "" ;

        System.out.println();
        System.out.println();
        
        //Question 4
        
        for(int i = 0 ;i < text6.length() ; i++)
        {
            char ch = text6.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(60);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();

        for(int i = 0 ;i < text6_1.length() ; i++)
        {
            char ch = text6_1.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {

            }
        }

        System.out.println();

        for(int i = 0 ;i < text6_2.length() ; i++)
        {
            char ch = text6_2.charAt(i);
            System.out.print(ch);

            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {

            }
        }

        response = sc.nextLine().trim(); 
        if(response.equalsIgnoreCase("yes"))
        {
            counter++; 
        }
        response = "" ;

        System.out.println();
        System.out.println();

        if(counter == 0)
        {
            System.out.println("Your infection risk is low.");  
            arogyaSetu = true  ;
        }
        else if(counter == 1)
        {
            System.out.println("Your infection risk is moderate. We would advise you to stay at home");
        }
        else
        {
            System.out.println("Your infection risk is high. Please stay at home!!");
            System.out.println("Quarantine yourself for 14 days\nWe would prefer you to take a test for COVID-19");
        }
    }
}
