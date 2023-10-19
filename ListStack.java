/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backmasking;

/**
 *
 * @author danielnguyen
 */

// Add in the import statement so the program can throw an exception
import java.util.EmptyStackException;

public class ListStack implements BKStack{
   
    // This class will represent the stack and hold one of the items 
    // in the linked list
    
    public static class Node {
        double stack;
        Node next;
    }
    
    // Create the pointer that is at the top of the stack
    private Node top_stack;
    
    // If the top of the stack is empty, return true, if stack is not empty return false
    public boolean isEmpty() {
     return (top_stack == null);      
    }
    
    // This method will add the double element to the top
    // of the stack
    
    public void push(double number) {
        Node newTop;
        newTop = new Node();
        newTop.stack = number;
        newTop.next = top_stack;
        top_stack = newTop;
    }
    
    // If the top of the stack is empty than throw an exception
    public double pop() {
        
        if(top_stack == null)
        {
            throw new EmptyStackException();
        }
        
        double topItem = top_stack.stack;
        top_stack = top_stack.next;
        
        return topItem;
    }
    
    @Override
    public double peek() {
        // If the top of the stack is null or empty than
        // throw the exception
        
        if(top_stack == null)
        {
            throw new EmptyStackException();
        }
        
        // Assign the topItem with the item that is popped
        
        double topItem = top_stack.stack;
        
        // Return the top of the stack that is popped
        return topItem;
        
    }
}
