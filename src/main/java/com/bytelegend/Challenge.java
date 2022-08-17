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
        x = (-b ± √ (b2 - 4ac) )/2a
     */
    public static double[] calculate(int a, int b, int c) {

        double[] result = new double[2];

        if (a < 0 ) {
            return new double[0];
        } else {
            double po = Math.pow(b, 2) - (4 * a * c);
            if(po<0){
                return new double[0];
            }else {
                result[0] = (-b + Math.sqrt(po)) / (2 * a);
                result[1] = (-b - Math.sqrt(po)) / (2 * a);

                if (result[0] != result[1]) {
                    return result;
                } else {
                    double[] res = new double[1];
                    res[0] = result[0];
                    return res;
                }

            }
        }>
    }
}
