import java.util.Scanner;

public class Marovich_A01Q2 {
        
        //-----------------------------------------------------------------
        // Computes the Kelvin equivalent of a specific Fahrenheit
        // value using the formula K = ((F-32.0)*(5.0/9.0)) + 273.15.
        //-----------------------------------------------------------------
        
        public static void main (String[] args) {
            
            final double CONVERSION_FACTOR = 5.0 / 9.0;
            
            String fahrenheitTemp; 
            double kelvinTemp;
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the temperature in Farenheit you " +
                                "wish to convert: ");
            
            fahrenheitTemp = (scan.nextLine()); // value to convert
            
            int num1 = Integer.parseInt(fahrenheitTemp);
            
            kelvinTemp = ((num1 - 32.0)*(CONVERSION_FACTOR) + 273.15);
            
            System.out.println ("Fahrenheit Temperature: " + fahrenheitTemp);
            
            System.out.println ("Kelvin Equivalent: " + kelvinTemp);
            
        }
}
