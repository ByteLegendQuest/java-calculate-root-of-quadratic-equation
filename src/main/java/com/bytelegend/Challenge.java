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
        double dt = b*b-4*a*c;
        double[] result;
        if(dt>0){
            //two
            double result1 = (Math.sqrt(dt)-b)/2*a;
            double result2 = -(Math.sqrt(dt)-b)/2*a;
            return result = new double[]{result1,result2};
        }else if(dt==0){
            //one
            double result1 = (Math.sqrt(dt)-b)/2*a;
            return result = new double[]{result1};
        }else{
            return result = new double[0];
        }
    }
}
