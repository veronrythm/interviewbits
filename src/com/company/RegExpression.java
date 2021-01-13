package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
    public static void  main(String[] args) {
        //String regExp = "(?=.[A-Za-z])(?=.\\d)(?=.[@$!%#?&])[A-Za-z\\d@$!%*#?&]{3,}$";
        String regExp = "^(?=.*[\\d])"
                + "(?=.*[a-zA-Z])"
                + "(?=.*[@#$%^&+=!])" //
                + ".{3,}$";
        String password = "Aa!8";
        // ^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$
        //       ^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\d]){1,})(?=(.*[\W]){1,})(?!.*\s).{8,}$
        //      (?=.*?[0-9])(?=.*?[A-Za-z])(?=.*[^0-9A-Za-z]).+

        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(password);
        System.out.println(m.matches());
    }
}
