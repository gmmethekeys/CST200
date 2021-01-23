/**
 * Write a description of the program here.
 * 
 * @author Lewis et al., (your name)
 * @version (program version)
 */

public class Marovich_A05Q2
{
    /**
     * Program entry point for drop-out stack testing.
     * @param args Argument list.
     */    
    public static void main(String[] args)
    {
        ArrayDropOutStack<Integer> stack = new ArrayDropOutStack<Integer>(4);
        
        System.out.println("DROP-OUT STACK TESTING");
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);       
        stack.push(5);               
        
        System.out.println("The size of the stack is: " + stack.size());        
        if(!stack.isEmpty())            
            System.out.println("The stack contains:\n" + stack.toString());
        
        stack.pop();        
        stack.push(7);
        stack.push(8);      
        
        System.out.println("The size of the stack is: " + stack.size());                
        if(!stack.isEmpty())            
            System.out.println("The stack contains:\n" + stack.toString());
    }
    
    public static class ArrayDropOutStack<T> implements StackADT<T>
    {   
        //TODO: Implement me.
    }
}