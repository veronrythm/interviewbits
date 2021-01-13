package com.company;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class QueueSol {
        public static void main(String args[]) {
            Queue<Integer> queue = new LinkedList<Integer>();
            Stack<Integer> st = new Stack<Integer>();
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            while (n-- > 0)
                queue.add(s.nextInt());
            printFifthElementFromEnd(queue);

        }

        // Method to print the fifth element from the tail of the queue
        static void printFifthElementFromEnd(Queue<Integer> queue) {
            // Write your code here
            int size = queue.size();
            for(int i = 1; i<size - 5;i++) {
                queue.add(queue.remove());
            }
            System.out.println(queue.peek());
        }
}

