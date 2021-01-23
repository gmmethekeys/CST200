//Source:
//http://www.tutorialspoint.com/javaexamples/arrays_insert.htm
//https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html
//http://stackoverflow.com/questions/16623154/adding-number-in-a-list-using-java
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Marovich_A02Q3 {
    
    public static void main(String[] args) {
        
        //create our needed variables
        int num_of_die, added_num;
        int roll_total = 0;
        
        //create our scanner object
        Scanner scan = new Scanner(System.in);
        
        //prompt the user for how many dice and use input for num_of_die
        System.out.print("How many dice would you like to roll? ");
        num_of_die = scan.nextInt();

        //create integer list to store die results in
        ArrayList<Integer> die_list = new ArrayList<Integer>();
        
        //promt the user for what to be added to result
        System.out.print("What should be added to the result? ");
        added_num = scan.nextInt();
        
        //loops the number of times given by user
        //variable i adds 1 each loop
        for (int i = 0; i < num_of_die; i++ ) {
            
            //creates a random number object
            Random ran_num = new Random();
            
            //creates the die
            int die1;
            
            /*calls ran_rum object using nextInt method
            the 7 is the number it stops at and the +1
            starts the counting at 1. Assigns the result
            to die1*/
            die1 = ran_num.nextInt(7)+1;
            
            //adds the result of the die roll to the die list
            die_list.add(die1);
            
            //adds the die roll to the total for all rolls
            roll_total += die_list.get(i);
        }
        
        //adds the total for all rolls and the user number
        roll_total += added_num;
        
        //Tells the user their results
        System.out.print("The result of rolling " + num_of_die + "D6 + " + added_num +
                            " is " + roll_total);
    }
    
}