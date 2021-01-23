//Sources:
//https://www.mathsisfun.com/geometry/herons-formula.html

import java.util.Scanner;

public class Marovich_A02Q2 {
    
    //Computes area of a triangle using herons formula
    
    public static void main(String[] args) {
        
        double a_side, b_side, c_side, s_side, area;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("What is a? ");
        a_side = (scan.nextDouble());
        
        System.out.print("What is b? ");
        b_side = (scan.nextDouble());
        
        System.out.print("What is c? ");
        c_side = (scan.nextDouble());
        
        s_side = (a_side + b_side + c_side) / 2;
        
        area = Math.sqrt(s_side*(s_side - a_side)*(s_side - b_side)*(s_side - c_side));
        
        System.out.printf("The area is " + "%.0f",area);
        
        
    }
}