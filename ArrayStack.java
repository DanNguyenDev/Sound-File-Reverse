/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
        
package com.mycompany.backmasking;

// Import the EmptyStackSelection in order to use "throw EmptyStackSelection"
import java.util.EmptyStackException;

/**
 *

 */

public class ArrayStack implements BKStack{
    
    // Create the array to hold the items in the stack
    private double[] stack = new double[10];
    
    // Create the top of the stack
    private int top_stack;
     
    // If the top of the stack is empty, return top of stack to be 0
    public boolean isEmpty() {
        return top_stack==0;
    }
    
    // This method will take in a double and will add the element 
    // to the top of the stack. If the stack is full, then the method will
    // expand the stack if necessary
     public void push(double number) {
     
     // If the top of the stack is equal to the stack size than expand if necessary
     if(top_stack == stack.length)  
     {
       // Create a new array and expand the size of the new array
        double[] new_stack = new double[2 * stack.length];
        
        // Copy the stack contents to the new stack
        for(int i = 0; i < stack.length; i++)
        {
            new_stack[i] = stack[i];
        }
        
        stack = new_stack;
     }
     
     // Put the double element in the top of the array
     stack[top_stack] = number;
     
     // Increment the number of items in the stack
     top_stack++;
    }
     
     
     
     // This method will remove the double element at the top of the stack
     // and will return a double reference, if the stack is empty than throw an EmptyStackException   
     public double pop() throws EmptyStackException {
         
         // If the stack is empty than throw the exception
         if(top_stack == 0)
         {
             throw new EmptyStackException();
         }
         
         
         
         // Create another variable that will hold the value of the top of the stack
         double reference = stack[top_stack - 1];
         
         // Decrement the number of items on stack
         top_stack--;
         
        return reference;
         
         
     }
     
     // Override the peek() method 
     @Override
     public double peek() {
         
         // If the top of the stack is empty than 
         // throw an exception
         if(top_stack == 0)
             throw new EmptyStackException();
         
         // Create another variable that will hold the value of 
         // the stack element
         double reference2 = stack[top_stack - 1];
         
         return reference2;
     }
    
    
}
