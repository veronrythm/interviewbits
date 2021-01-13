package com.company;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
      /*  int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {8, 9, 10, 11, 12};
        // Jagged arrays
        int[][] arr = {arr1, arr2, arr3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }*/

        int[] arr1 = new int[100];
        int[] arr2 = new int[10];
        for(int i=0;i<100;i++)
            arr1[i]=i;
        arr2 = arr1;
        for(int i=0;i<10;i++)
            System.out.print(arr2[i]+" ");

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(5);
        arrlist.add(6);
        arrlist.add(7);
        System.out.println();
        System.out.println(arrlist.size());


    }
}

