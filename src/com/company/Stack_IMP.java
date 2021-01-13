package com.company;
import java.util.Stack;

public class Stack_IMP {
    public static void main(String args[]) {
        Stack <Integer> sk = new Stack<Integer>();
        Stack <Integer> sk1 = new Stack<Integer>();
        sk.push(1);
        sk.push(2);
        sk.push(3);
        sk.push(4);
        sk.push(5);

        sk1.push(6);
        sk1.push(7);
        sk1.push(8);
        sk1.push(9);
        sk1.push(10);
        System.out.println(sk);
        System.out.println(sk1);
        merge_stacks(sk,sk1);

        System.out.println(sk);
        System.out.println(sk1);
    }

    private static  Stack<Integer> merge_stacks(Stack<Integer> stack1, Stack<Integer>  stack2) {
        if (stack1.peek() > stack2.peek()) {
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
            return stack1;
        } else
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        return stack2;


    }

   /* private static  Stack<Integer> merge_stacks2(Stack<Integer>stack1, Stack<Integer> stack2) {
        if (stack1.peek() < stack2.peek()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
                // return stack1.r
            }
        } else {
            while (stack1.isEmpty()) {
                stack2.push(stack1.pop());
                //return stack2.reverse();
                return stack1;
            }
        }
    }*/
}
