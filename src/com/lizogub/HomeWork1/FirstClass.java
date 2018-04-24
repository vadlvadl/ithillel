package com.lizogub.HomeWork1;

public class FirstClass {

    /*
    this is main function
     */
    public static void main(String[] args) {

        // one string comment
        int age = 35;// years
        float averageVelocity = 105.6f;// km/h
        int number1 = 412;
        int number2 = 823;
        byte res = (byte) (number1 + number2);

        float res2 = age + averageVelocity;

        System.out.println("Result Main: " + res);

        runExample1();
        runExample2();
        runExample3();
    }

    /*
        This function calculates
        ( a + b ) - 1 / c;
     */
    public static void runExample1(){

        float a = 2, b = 3, c = 5;
        float res = (a + b) - 1 / c;

        System.out.println("Result Example 1: " + res);
    }

    /*
        This function calculates ( Math library )
        ( a^2 + b^2 ) / ( a^2 - b^2 )
     */
    public static void runExample2(){

        float a = 2, b = 3;
        double res = (Math.pow(a,2) + Math.pow(b,2)) / (Math.pow(a,2) - Math.pow(b,2));

        System.out.println("Result Example 2: " + res);
    }

    /*
        This function calculates
        | cos(x)^2 + 2 * sin(x)^2 |
     */
    public static void runExample3(){

        float x = 3;

        double cos2 = Math.pow(Math.cos(x),2);
        double sin2 = Math.pow(Math.sin(x),2);
        double res = Math.abs( cos2 + 2 * sin2 );

        System.out.println("Result Example 3: " + res);
    }

}
