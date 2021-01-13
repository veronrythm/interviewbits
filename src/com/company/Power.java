package com.company;

import java.util.Scanner;


public class Power {

    public static int calpower(int x,  int y) {
        int temp;
        System.out.println("########Values of x and y are : ##########"+x+" "+y);
        if(y==0) {
            System.out.println("return 1");
            return 1;
        }
        temp = calpower(x,y/2);
        if(y%2 == 0){
            System.out.println("Return temp*temp"+temp);
            return temp*temp;
        }
        else {
            System.out.println("temp*temp*x"+temp+" "+x);
            return temp*temp*x;
        }

    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int[] temp = new int[-3];
        //System.out.println(calpower(scn.nextInt(),scn.nextInt()));
    }
}
