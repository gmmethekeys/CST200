//Source: 
//https://youtu.be/_XNSg6Az3JE
//http://www.tutorial4us.com/java-program/java-diamond-of-star
//Tutoring from student Dakota
public class Marovich_A02Q6
{
    public static void main(String[] args) {
        
        //create our row variable and iterate 5 times
        for (int row = 1; row < 10; row += 2) {
            
            //
            for (int column = 0; column < 9 - row / 2; column++)
                System.out.print(" ");
            for (int column = 0; column < row; column++)
                System.out.print("*");
            System.out.print("\n");
        }
        
        //System.out.println("     *********");
        
        for (int row = 9; row > 0; row -= 2) {
            for (int column = 0; column < 9 - row / 2; column++)
                System.out.print(" ");
            for (int column = 0; column < row; column++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
