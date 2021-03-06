/**
 * Write a description of the program here.
 * 
 * @author Lewis et al., (Donald Marovich)
 * sources:
 * https://docs.oracle.com/javase/7/docs/api/java/util/Vector.html#isEmpty()
 * 
 */
import java.util.Arrays;

public class Marovich_A05Q1
{
    /**
     * Program entry point for stack testing.
     * @param args Argument list.
     */    
    public static void main(String[] args)
    {
        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        
        System.out.println("STACK TESTING");
        
        stack.push(3);
        stack.push(7);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();        
        stack.push(9);
        stack.push(8);
        System.out.println(stack.peek());        
        System.out.println(stack.pop());
        System.out.println(stack.peek());        
        
        System.out.println("The size of the stack is: " + stack.size());
        System.out.println("The stack contains:\n" + stack.toString());        
    }
    
    /**
     * An array implementation of a stack in which the bottom of the
     * stack is fixed at index 0.
     * 
     * @author Java Foundations
     * @version 4.0
     */
    public static class ArrayStack<T> implements StackADT<T>
    {
        private final static int DEFAULT_CAPACITY = 100;
    
        private int top;  
        private T[] stack;
      
        /**
         * Creates an empty stack using the default capacity.
         */
        public ArrayStack()
        {
            this(DEFAULT_CAPACITY);
        }
    
        /**
         * Creates an empty stack using the specified capacity.
         * @param initialCapacity the initial size of the array 
         */
        @SuppressWarnings("unchecked") //see p505.
        public ArrayStack(int initialCapacity)
        {
            top = 0;
            stack = (T[])(new Object[initialCapacity]);
        }
    
        /**
         * Adds the specified element to the top of this stack, expanding
         * the capacity of the array if necessary.
         * @param element generic element to be pushed onto stack
         */
        public void push(T element)
        {
            if (size() == stack.length) 
                expandCapacity();
    
            stack[top] = element;
            top++;
        }
    
        /**
         * Creates a new array to store the contents of this stack with
         * twice the capacity of the old one.
         */
        private void expandCapacity()
        {
            stack = Arrays.copyOf(stack, stack.length * 2);   
        }
    
        /**
         * Removes the element at the top of this stack and returns a
         * reference to it. 
         * @return element removed from top of stack
         * @throws EmptyCollectionException if stack is empty 
         */
        public T pop() throws EmptyCollectionException
        {
            if (isEmpty())
                throw new EmptyCollectionException("stack");
    
            top--;
            T result = stack[top];
            stack[top] = null; 
    
            return result;
        }
       
        /**
         * Returns a reference to the element at the top of this stack.
         * The element is not removed from the stack. 
         * @return element on top of stack
         * @throws EmptyCollectionException if stack is empty
         */
        public T peek() throws EmptyCollectionException
        {
            if (isEmpty())
                throw new EmptyCollectionException("stack");
    
            return stack[top-1];
        }
    
        /**
         * Returns true if this stack is empty and false otherwise. 
         * @return true if this stack is empty
         */
        public boolean isEmpty()
        {
           //uses the size method to check how many elements there are.
           //if there are no elements, the boolean returns true
            if(size() == 0){
            return true;
           }
           else {
               return false;
            }
        }
     
        /**
         * Returns the number of elements in this stack.
         * @return the number of elements in the stack
         */
        public int size()
        {
            //Simply using the top variable, we can track how many elements there are.
            return top;
        }
        

        /**
         * Returns a string representation of this stack. The string has the
         * form of each element printed on its own line, with the top most
         * element displayed first, and the bottom most element displayed last.
         * If the list is empty, returns the word "empty".
         * @return a string representation of the stack
         */
        public String toString()
        {
            //create our string object
            String result = "";
            
            //checks if the stack is empty using the isEmpty method
            if (!isEmpty()) {
                //creates a loop that starts at the top of the stack and works down
                for (int i = top-1; i >= 0; i--) {
                    //adds each item in the stack to the string object
                    result = result + stack[i].toString() + "\n";
                }
            } else {
                //returns the string "empty" if there are no elements in stack
                return "empty";
            }
            return result;
        }
    }
}