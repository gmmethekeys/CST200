/* Sources: 
 * https://docs.oracle.com/javase/7/docs/api/java/lang/
 * Integer.html#parseInt(java.lang.String)
 */

import java.util.Scanner;

public class Marovich_A01Q1 {
    
    //changed number to 2 for correct remainder
    public static final int NUM = 2; 
    
    public static void main(String[] args) {
         
         //changed result to int, input to String, moved up
         String input; 
         int result;
         Scanner scan = new Scanner(System.in);
        
         //changed println to print, changed text, added new lines
         System.out.print("\nEnter any number: "); 
            
            //missing a paranthesis
            input = (scan.nextLine());
            
            //convert string into int
            int num1 = Integer.parseInt(input); 
         
         /*missing semi-colon so I added semi-colon
            changed input to num1 */
         result = num1 % NUM;
         
         //changed expression so if result not equal to zero
         if (result != 0) { 
            
             //removed new lines
             System.out.print("Number " + input + " is odd."); 
            }
         //changed expression so if result equals to zero
         else if (result == 0) { 
             
             //removed new lines
             System.out.print("Number " + input + " is even."); 
            }
    }    
}