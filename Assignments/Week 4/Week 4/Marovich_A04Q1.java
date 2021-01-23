//Sources:
//https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
//http://stackoverflow.com/questions/7008189/calculate-average-in-java
//Chapter 10 slides

import java.util.*;
import java.io.InputStreamReader;

public class Marovich_A04Q1 {
   
    //-----------------------------------------------------------------
    //Reads a series of 5 doubles from user and prints their average.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        
        //create a variable for the amount of numbers we want to add
        final int MAXnum = 5;
        
        //variable that keeps track of how many numbers have succesfully been entered
        int numcount = 0;
        
        //creates a place to store the total from the numbers
        double total = 0.0;
        
        //variable for the average
        double average = 0.0;
        
        //variable for the users input to be stored as string
        String stringnum;
        
        //variable for the users input to be converted to double
        double d_number;
        
        //create scanner object
        Scanner scan = new Scanner(System.in);
        
        //run a loop until the number of numbers added up is equal to maxnumbers
        while (numcount <  MAXnum) {
            System.out.print("Please enter a number: ");
            
            //scans the object as text!!!!!!!!!!!!!!!!!!!
            stringnum = scan.next();
            
            //tries for exceptions, if parsing the string to a double gives error
            try {
                //parses double from string and assigns to d_number
                d_number = Double.parseDouble(stringnum);
                
                //adds d_number to the total sum
                total += d_number;
                
                //adds 1 to numcount
                numcount++;
                System.out.println();
            }

            //catches our error for invalid numbers
            catch (NumberFormatException exception) {
                System.out.println("\nPlease enter a valid number.\n");
            }
        }  
        
        //calculates our average by dividing the sume by the number count
        average = total / numcount;  
        
        //our output, huzzah!
        System.out.print("The average is: " + average);
    }
}
