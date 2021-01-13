package com.company;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatChange {
    public static void main (String args[]) throws ParseException {
        DecimalFormat df=new DecimalFormat("#.##");
        double value = 9876.764438;
        String formate = df.format(value);
        System.out.println(formate);
        double finalValue = (Double)df.parse(formate) ;
        System.out.println(finalValue);
    }
}
