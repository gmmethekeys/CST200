//Sources:
//http://stackoverflow.com/questions/29737910/java-program-not-reading-user-input
//Tutoring from student Dakota

import java.util.Scanner;
import java.util.Random;

public class Marovich_A02Q5
{
    
   public static void main(String[] args) {
       
       int user_guess, correct_num, count = 0, quit = 0;
       boolean play = true, found = false; 
       String answer;
       Scanner scan = new Scanner(System.in);
       
       
       while (play == true) { 
           
           Random ran_num = new Random();
           correct_num = ran_num.nextInt(101)+1;
          // System.out.println("The correct number is " + correct_num+"\n");
           
           while (found == false) {
               System.out.print("What number do you guess? ");
               user_guess = scan.nextInt();
               count ++;
               if (user_guess == correct_num){
                   System.out.println("Your guess is correct! You guessed " + user_guess);
                   System.out.print("You made " + count + " guesses.\n");
                   found = true;
                }
                else if(user_guess == quit) {
                   System.out.println("Quitting game.");
                   found = true;
                }
               else if (user_guess < correct_num) {
                   System.out.println("You guessed "+user_guess);
                   System.out.println("Your guess is too low.");
                }
               
               else if (user_guess > correct_num) {
                   System.out.println("You guessed "+user_guess);
                   System.out.println("Your guess is too high.");
                }
               
           }
           System.out.println("Would you like to play again? Y/N ");
           answer = scan.next();
           
           //System.out.print(answer);
           if (answer.equalsIgnoreCase("Y")) {
               found = false;
               user_guess = 1;
               count = 0;
               answer = null;
              // System.out.print("yes");
            }
           else if(answer.equalsIgnoreCase("N")) {
               play = false;
               System.out.print("Thank you and have a nice day!");
            }
       }
    
           
   }
}

