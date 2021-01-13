package com.company;

import java.util.Arrays;

public class Demo
{
    void function(String st) {
        if ((st == null) || (st.length() <= 1))
            System.out.println(st);
        else {
            System.out.print(st.charAt(st.length() - 1));
            function(st.substring(0, st.length() - 1));
        }
    }

    public static void factorial2(int n) {
        int[] factorials = new int[n + 1];
        Arrays.fill(factorials, 1);
        for (int i = 0; i <= n - 1; i++) {
            factorials[i + 1] = (i + 1) * factorials[i];
        }
        System.out.println(factorials[n]);
    }
    public static void factorial1(int n) {

        int factorial = 1;
        int index = 1;
        for (int i = 0; i <= Math.pow(n, n); i++) {
            if (i == factorial * index) {
                factorial = i;
                index += 1;
                if (index == n + 1) {
                    System.out.println(factorial);
                    break;
                }
            }
        }
    }

    public static boolean primality_check(int n) {
        if(n<=1) return false;
        if(n<=3) return true;
        if (n%2 == 0 || n%3 == 0) return false;

        for (int i=5;i<Math.sqrt(n);i = i+6){
            if(n%i == 0 || n% i+2 == 0) return false;
        }
        return true;
    }

    public static int fun(int a){
        if (a > 100)
            return a - 10;
        return fun(fun(a + 11));
    }

    public static void main(String[] args) {
        //System.out.println(primality_check(31));
        //System.out.println(fun(88x));
        //String st = "abc d efg";
        //Demo obj = new Demo();
        //factorial1(10);
        //obj.function(st);
     //   System.out.println(evenSum(10));
     //   System.out.println(func(12));
        //System.out.println(evenSum2(10));
    }
    /*public static class superclass
    {
        static void print()
        {
            System.out.println("superclass.");
        }
    }
    public static class subclass extends superclass
    {
        static void print()
        {
            System.out.println("subclass.");
        }
    }

    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();
        B.print();
    }*/

}