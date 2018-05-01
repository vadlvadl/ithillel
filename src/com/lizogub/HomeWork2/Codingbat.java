package com.lizogub.HomeWork2;

public class Codingbat {

    /*
    * Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
    */
    public static boolean more20(int n) {
        int baseNumber = 20;
        int mod = 0;

        mod = n % baseNumber;
        if((mod == 1) || (mod == 2)){
            return true;
        }

        return false;
    }

    /*
     *  Given an array of ints length 3, return the sum of all the elements.
     */
    public static int sum3(int[] nums) {
        int sum = 0;

        for(int num:nums){
            sum += num;
        }

        return sum;
    }

    /*
     * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
     * or return 0 if neither is in that range.
     */
    public static int max1020(int a, int b){
        int rangeMin = 10;
        int rangeMax = 20;

        int tmp = rangeMin - 1;

        if ((a >= rangeMin) && (a <= rangeMax)) {
            tmp = a;
        }

        if ((b >= rangeMin) && (b <= rangeMax)) {
            if (b > tmp){
                tmp = b;
            }
        }

        if(tmp < rangeMin){
            return 0;
        }

        return tmp;
    }
}
