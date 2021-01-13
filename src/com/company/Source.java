package com.company;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

abstract class Parent {

    abstract int display(int i);

    int returnValue(int i) {
        return display(++i);
    }
}

class Child extends Parent {
    int display(int i) {
        return ++i;
    }
}

public class Source {
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void main(String args[]) {
        //fun1();
        //System.out.print("A");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 0; j < n; j++) {
            q.add(in.nextInt());
        }
        func();
        System.out.println(q);
    }

    static void fun1() {
        try {
            fun2();
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        }
    }

    static void fun2() throws IOException {
        fun3();
        System.out.print("D");
    }

    static void fun3() throws IOException {
        throw new IOException();
    }

    public void checkPalindrome(String inputString) {
    }

    public static void func() {
        //write your code here
        int size = q.size();
        int maxVal = Integer.MIN_VALUE;
        int index = -1;
        for(int i=1;i<=size;i++) {
            int val = q.remove();
            if(val>maxVal){
                index = i;
                maxVal = val;
            }
            q.add(val);
        }
        // System.out.println(q);
        //System.out.println(index);
        for(int k=1;k<=size;k++) {
            int val = q.remove();
            if(index == k) {
                maxVal = val;
            }
            else {
                q.add(val);
            }
        }
        q.add(maxVal);
        //System.out.println(q);

    }
        /*try {
            fun();
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        } catch (RuntimeException e) {
            System.out.print("C");
        } catch (Exception e) {
            System.out.print("D");
        } finally {
            System.out.print("E");
        }
        System.out.print("F");
    }

    static void fun() {
        throw new ArithmeticException();
    }*/
}