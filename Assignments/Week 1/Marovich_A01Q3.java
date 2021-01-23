import java.util.Scanner;
public class Marovich_A01Q3 {
    
    //Computes the total number of seconds from user
    //entering hours and minutes using the following formula:
    // Seconds = ((Hours*60*60) + (Minutes * 60) + Seconds)
    public static void main(String[] args) {
        
        //declaring the variables
        String hours, minutes, seconds;
        long totalSeconds;
        
        //creating scan objects for our inputs
        Scanner scan_hours = new Scanner(System.in);
        Scanner scan_minutes = new Scanner(System.in);
        Scanner scan_seconds = new Scanner(System.in);
        
        //Takes the first input and stores it to hours
        System.out.print("Enter hours: ");
        hours = (scan_hours.nextLine());
        
        //Takes the second input and saves it as minutes
        System.out.print("Enter minutes: ");
        minutes = (scan_minutes.nextLine());
        
        //Takes the third input and saves it as seconds
        System.out.print("Enter seconds: ");
        seconds = (scan_seconds.nextLine());
        
        //Converts all our inputs from strings to integers
        int hoursCON = Integer.parseInt(hours);
        int minutesCON = Integer.parseInt(minutes);
        int secondsCON = Integer.parseInt(seconds);
        
        //calculates our total seconds
        totalSeconds = ((hoursCON*60*60)+(minutesCON*60)+secondsCON);
        
        System.out.println("The total seconds is " + totalSeconds);
    }
}
