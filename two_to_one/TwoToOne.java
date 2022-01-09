package com.Mango.twotoone;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String total = s1 + s2;
        String result = "";
        for (int i = 97; i <= 122 ; i++) {
            if(total.contains( "" + (char) i ) ){
                result += (char) i;
            }
        }
        return result;
    }
}
