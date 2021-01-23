//Sources:
//The provided example helped tremendously

import java.util.*;
import java.io.*;

public class Marovich_A04Q2 {
    
    public static void main (String[] args) throws IOException {
        //create scanner object
        Scanner scan = new Scanner(System.in);
        
        //string variable for our user input to go into
        String userinput = "";
        
        //the name that will be used for the file name
        String filename = "userStrings.txt";
        
        //when false, program will continually ask for text
        Boolean done = false;
        
        //Sets up our file, buffer, and print writer objects 
        //this allows us to take input and save it to a file
        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outFile = new PrintWriter(bw);
        
        //beginning of loop to coninously prompt for text
        while (done == false) {
            System.out.print("Please enter text to save: ");
            
            //takes the text and assigns it as string to userinput
            userinput = scan.nextLine();
            
            //checks if user typed DONE
            if (userinput.equals("DONE")){
                //break the loop of asking for text
                done = true;
                
                //breaks the current if loop
                break;
            }
            
            else {
                //takes the string from variable userinput and prints it into
                //our output file, then it goes to the next line
                outFile.print(userinput);
                outFile.println();

            }
        }
        
        //since we are no longer prompting for entries we can tell the object
        //we are done writing by using the method .close()
        outFile.close();
        
        //prints out that a file was created and the name used for the file
        System.out.println("Output file has been created: " + filename);
  }

}