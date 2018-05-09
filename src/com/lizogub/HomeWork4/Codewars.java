package com.lizogub.HomeWork4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Codewars {

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
     * The sum of these multiples is 23.
     * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
     * Note: If the number is a multiple of both 3 and 5, only count it once.
     * @param a
     * @return int
     */
    public double getSumMult35(int a){
        double sum = 0;

        for (int i = 0; i < a; i++){
            if((i%3 == 0) || (i%5 == 0)){
                sum += i;
            }
        }
        return sum;
    }

    /**
     * There is an array with some numbers. All numbers are equal except for one. Try to find it!
     * @param arr
     * @return
     */
    public double findUniq(double arr[]) {
        double a = arr[0];
        double result = arr[0];
        int same = 0;

        for (int i = 1; i < arr.length;i++){
            if(arr[i] != a){
                result = arr[i];
            } else {
                same++;
            }
        }

        if(same == 0){
            return arr[0];
        }

        return result;
    }

    /**
     * Complete the function to return true if the two arguments given are anagrams of theeach other; return false otherwise.
     * @param test
     * @param original
     * @return
     */
    public boolean isAnagram(String test, String original) {
        char tmpTest[] = test.toLowerCase().toCharArray();
        char tmpOriginal[] = original.toLowerCase().toCharArray();

        Arrays.sort(tmpTest);
        Arrays.sort(tmpOriginal);

        String newTest = new String(tmpTest);
        String newOriginal = new String(tmpOriginal);

        if(newOriginal.equals(newTest)){
            return true;
        }
        return false;
    }

    /**
     * The goal of this kata is to write a function that takes two inputs:
     * a string and a character.
     * The function will count the number of times that character appears in the string.
     * The count is case insensitive.
     * @param str
     * @param c
     * @return
     */
    public int charCount(String str, char c) {

        int count = 0;
        char tmpStr[] = str.toLowerCase().toCharArray();
        c = Character.toLowerCase(c);

        for(char c1 : tmpStr){
            if(c1 == c){
                count++;
            }
        }

        return count;
    }
}
