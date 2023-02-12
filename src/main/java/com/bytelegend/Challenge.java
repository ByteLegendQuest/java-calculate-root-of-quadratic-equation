package com.bytelegend;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("Roots of x^2-2x+1=0 are:" + Arrays.toString(calculate(1, -2, 1)));
        System.out.println("Roots of x^2-4=0 are:" + Arrays.toString(calculate(1, 0, -4)));
        System.out.println("Roots of x^2+1=0 are:" + Arrays.toString(calculate(1, 0, 1)));
    }

    public static double[] calculate(int a, int b, int c) {
        double triangle = b * b - 4 * a * c;
        if (triangle >= 0) {
            double tReturn = Math.sqrt(triangle);
            if (triangle > 0) {
                double[] root = new double[2];
                root[0] = (- b + tReturn) / 2 * a;
                root[1] = (- b - tReturn) / 2 * a;
                return new double[] {root[0], root[1]};
            }
            else {
                double[] root = new double[1];
                root[0] = (- b + tReturn) / 2 * a;
                return new double[] {root[0]};
            }
        }
        return new double[] {};
    }
}
