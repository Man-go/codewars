package com.Mango;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }

    public static int digital_root(int n) {
        //super smart
        //return (n - 1) % 9 + 1;

        if (n < 10) {
            return n;
        }
        return digital_root(n % 10 + digital_root(n / 10));
    }
}
