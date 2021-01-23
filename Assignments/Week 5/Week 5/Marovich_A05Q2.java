/**
 * Write a description of the program here.
 * 
 * @author Lewis et al., (your name)
 * @version (program version)
 */

import java.util.Arrays;

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
        private final static int DEFAULT_CAPACITY = 100;
    
        private int top;  
        private T[] stack;
      
        /**
         * Creates an empty stack using the default capacity.
         */
        public ArrayDropOutStack()
        {
            this(DEFAULT_CAPACITY);
        }
    
        /**
         * Creates an empty stack using the specified capacity.
         * @param initialCapacity the initial size of the array 
         */
        @SuppressWarnings("unchecked") //see p505.
        public ArrayDropOutStack(int initialCapacity)
        {
            top = 0;
            stack = (T[])(new Object[initialCapacity]);
        }
    
        /**
         * Adds the specified element to the top of this stack
         * @param element generic element to be pushed onto stack
         */
        public void push(T element)
        {
            //check if our stack is full, if full it calls the popBottom method
            if (isFull()) {
                //takes out the bottom element, refer to method for more info
                popBottom();
            }
            
            //takes the parameter entered and assigns it to the current index
            stack[top] = element;
            
            //steps up the stack top for our next empty space
            top++;
            
        }
        
        
        //Created a new method that creates a new stack, moves the numbers over,
        //and assigns the new stack back to the older one. 
        @SuppressWarnings("unchecked")
        private void popBottom() {
            //erases the element in index 0 of our stack
            stack[0] = null;
            
            //creates a new stack object
            T[] tempStack = (T[]) new Object[top];
            
            //create a loop to add our elements from the old stack into the new
            for (int i = 0; i < top-1; i++) {
                tempStack[i] = stack [i + 1];
            }
            
            //assigns the original stack to the new one, overwriting the old stack
            stack = tempStack;
            //sets our spot in the stack back to compensate for the number
            //we removed in the beginning of this method
            top--;
        }
        
        //if the top of the stack is equal to the length of the stack, in this case, 4
        //if they are equal, returns true
        private boolean isFull() {
            return top == stack.length;
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
            
            //Step down the stack to look at the last item
            top--;
            //our result is going to be created as an object of that item
            T result = stack[top];
            
            //since we popped, we make that number null and ready for next input
            stack[top] = null;
            
            //return the item that used to be there
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
            String result = "";
            
            if (!isEmpty()) {
                for (int i = top-1; i >= 0; i--) {
                    result = result + stack[i].toString() + "\n";
                }
            } else {
                return "empty";
            }
            return result;
        }
    }
}