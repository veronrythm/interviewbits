package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class meannumbers {
    public static void main(String[]args) throws FileNotFoundException {
        File  ip = new File("C:/Users/viren.deshpande/Documents/Java/file.txt");
        Scanner scan = new Scanner(ip);
        int sum=0;
        int count=0;
        while (scan.hasNext()) {
            sum = sum + (int)scan.nextInt();
            count++;
        }
        System.out.println((double) sum/count);
        //System.out.println(count);
    }

}