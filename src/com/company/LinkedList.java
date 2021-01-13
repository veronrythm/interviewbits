package com.company;

import com.sun.jmx.snmp.internal.SnmpSubSystem;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.sql.SQLSyntaxErrorException;
import java.util.*;

public class LinkedList<I extends Number> {
    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int n) {
            data = n;
            next = null;
        }
    }
    public static  void  main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = s.nextInt();
        head = null;

        if(n>0) {
            System.out.println("Enter value of head node");
            head = new Node(s.nextInt());
            Node temp = head;

            for(int i=1; i<n; i++) {
                System.out.println("Enter value of successor nodes");
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        //findMidPoint();
        //reverseLinkedList();
        //reverseLinkedListInBetween(4,8);
        head = addDigit(head, 7);
        printLinkedList();
    }

    private static void findMidPoint() {
        Node fastPtr=head, slowPtr=head;
        while (fastPtr != null && fastPtr.next!= null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
       // System.out.println(fastPtr.data);
        System.out.println(slowPtr.data);
    }

    private static void reverseLinkedListInBetween(int start, int end) {
        Node current = head;
        Node temp = null;
        Node next= null;
        Node previous = null;
        int i=1;

        while(i<start) {
            temp = current;
            current = current.next;
            i++;
        }
        System.out.println(temp.data);
        System.out.println(current.data);
        previous= current;

        while(i < end)
        {
            next = current.next;
            System.out.println("Next.data "+next.data);
            current.next = previous;
            previous = current;
            current =  next;
            System.out.println("Previous.data "+previous.data);
            System.out.println("Current.data "+current.data);
            i++;
        }
        temp.next.next=current.next;
        temp.next = current;

        System.out.println(previous.data);
        System.out.println(current.data);
        System.out.println("############");
        printLinkedList();
    }


    private static void reverseLinkedList() {
        Node current = head;
        Node next = null;
        Node previous = null;

        while(current!=null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current =  next;
        }
        head = previous;

        printLinkedList();
    }

    private static void printLinkedList() {
        Node temp = head;
        while ( head!= null ) {
            System.out.print(head.data+" -> ");
            head = head.next;
        }
    }
    public static int add(Node head, int digit)
    {
        // base case: end of the linked list is reached
        if (head == null) {
            return digit;
        }

        // store carry returned by the recursive call of the next node
        int carry = add(head.next, digit);

        // optimization: terminate the recursion if carry is 0 at any point
        if (carry == 0) {
            return 0;
        }

        // get sum of the current node and the carry
        int sum = head.data + carry;

        head.data = sum % 10;	// update value of the current node
        return sum/10;			// return carry
    }

    public static Node addDigit(Node head, int digit)
    {
        // Add given digit to the linked list using recursion
        int carry = add(head, digit);

        // if there is any carry left, add a new node at the beginning of the list
        if (carry > 0) {
            Node node = new Node(carry);
            node.next = head;
            head = node;

            return head;
        }

        return head;
    }


}
