//Sources:
//https://kalender-365.de/leap-years.php
//I was a bit confused by the leap year algorithm explanation so I looked 
//up another explanation: http://stackoverflow.com/questions/725098/leap-
//year-calculation
import java.util.Scanner;

public class Marovich_A02Q4
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int user_year;
        System.out.print("What year should be checked? ");
        user_year = scan.nextInt();
        
        if ((user_year % 4 == 0) && (user_year % 100 != 0)) {
            System.out.print("That is a leap year.");
        }
        else if (user_year % 400 == 0) {
            System.out.print("That is a leap year.");
        }
        else {
            System.out.print("That is not a leap year.");
        }
            
        
        
    }
}
