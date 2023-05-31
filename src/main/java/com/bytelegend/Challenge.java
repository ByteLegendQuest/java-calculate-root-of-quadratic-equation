package com.bytelegend;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("Roots of x^2-2x+1=0 are:" + Arrays.toString(calculate(1, -2, 1)));
        System.out.println("Roots of x^2-4=0 are:" + Arrays.toString(calculate(1, 0, -4)));
        System.out.println("Roots of x^2+1=0 are:" + Arrays.toString(calculate(1, 0, 1)));
    }

    /**
     * `calculate(int a, int b, int c)` calculates the root of the quadratic equation `ax^2+bx+c=0`.
     *
     * <p>If there are two roots, return an array containing the two roots, i.e. `new double[] {
     * root1, root2 }`.
     *
     * <p>If there is one root, return an array containing the root, i.e. `new double[] { root }`.
     *
     * <p>If there is no root, return an empty array.
     */
    public static double[] calculate(int a, int b, int c) {
        //x = ( (-b +/= sqrt(b^2 - 4ac))  )/ 2a
        double determinant = (Math.pow(b,2)) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);
        double[] root;
        if (determinant > 0) {
            double firstRoot = (-b + sqrt) / (2 * a);
            double secondRoot = (-b - sqrt) / (2 * a);
            root = new double[2];
            root[0] = firstRoot;
            root[1] = secondRoot;
        } else if (determinant == 0) {
            root = new double[1];
            root[0] = (-b + sqrt) / (2 * a);
        }
        return root;
    }
}
