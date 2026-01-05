package com.stackandqueue;

import java.util.Stack;

public class SortStackUsingRecursion {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {

        // Base condition: stack is empty
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Sort remaining stack
        sortStack(stack);

        //  Insert element at correct position
        insertInSortedOrder(stack, top);
    }

    // Helper function to insert element in sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int element) {

       
        // stack empty OR top element <= current element
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursively insert element
        insertInSortedOrder(stack, element);

        // Push the removed element back
        stack.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before Sorting: " + stack);

        sortStack(stack);

        System.out.println("After Sorting: " + stack);
    }
}
