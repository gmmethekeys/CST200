//Sources:
//http://www.tutorialspoint.com/java/util/java_util_scanner.htm
//http://www.tutorialspoint.com/java/number_sqrt.htm

import java.util.Scanner;

public class Marovich_A02Q1 {
    //Computes and displays the distance between two points
    
    
    public static void main(String[] args){
        
        //Create the variables
        double x1, y1, x2, y2, result;
        Scanner scan = new Scanner(System.in);
        
        //Collect user input and assign 
        //to each appropriate variable
        System.out.print("What is x1? ");
        //assigns what was typed to x1 as a double
        x1 = (scan.nextDouble());
        
        System.out.print("What is y1? ");
        y1 = (scan.nextDouble());
        
        System.out.print("What is x2? ");
        x2 = (scan.nextDouble());
        
        System.out.print("What is y2? ");
        y2 = (scan.nextDouble());
        
        //calculates the distance 
        result = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        
        //prints out modified result displaying
        //only 4 decimals 
        System.out.printf("The distance is " + "%.4f",result);
        
        
        
    }
}
