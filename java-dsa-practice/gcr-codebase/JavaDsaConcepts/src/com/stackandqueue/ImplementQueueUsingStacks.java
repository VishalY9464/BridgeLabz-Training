package com.stackandqueue;
import java.util.Stack;

public class ImplementQueueUsingStacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation 
    public static void enqueue(int element) {
        stack1.push(element);
    }

    // Dequeue operation 
    public static int dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Display queue elements
    public static void display() {

        // Elements in stack2 (front of queue)
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }

        // Elements in stack1 (rear of queue)
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        enqueue(5);
        enqueue(6);
        enqueue(7);
        enqueue(8);

        display(); 

        int popVal=dequeue();
        System.out.println("Value Pop: "+popVal);

        System.out.println("After Dequeue:");
        display(); 
    }
}
