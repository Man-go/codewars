package com.mango.bouncingball;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        if (h < 0 || h <= window || bounce <= 0 || bounce >= 1)
            return -1;

        double fly = h * bounce;
        int count = 1;

        while (window < fly) {
            fly *= bounce;
            count += 2;
        }

        return count;
    }
}