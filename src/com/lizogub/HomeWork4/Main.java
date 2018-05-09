package com.lizogub.HomeWork4;

public class Main {
    public static void main(String[] args) {
//        runExcersize1();
//        runExcersize2();
//        runExcersize3();
//        runExcersize4();
//        runExcersize5();
//        runExcersize6();
        runExcersize7();
    }

    public static void runExcersize1(){
        Codingbat cd1 = new Codingbat();

        System.out.println("in3050(30,40) → true  =  " + cd1.in3050(30,40));
        System.out.println("in3050(33,43) → false  =  " + cd1.in3050(33,43));
        System.out.println("in3050(40,50) → true  =  " + cd1.in3050(40,50));
        System.out.println("in3050(42,25) → false  =  " + cd1.in3050(42,25));
    }

    public static void runExcersize2(){
        Codingbat cd1 = new Codingbat();

        System.out.println("greenTicket(1, 2, 3) → 0  =  " + cd1.greenTicket(1,2,3));
        System.out.println("greenTicket(2, 2, 2) → 20  =  " + cd1.greenTicket(2,2,2));
        System.out.println("greenTicket(1, 1, 2) → 10  =  " + cd1.greenTicket(1,1,2));
        System.out.println("greenTicket(2, 1, 1) → 10  =  " + cd1.greenTicket(2,1,1));
        System.out.println("greenTicket(1, 2, 1) → 10  =  " + cd1.greenTicket(1,2,1));
    }

    public static void runExcersize3(){
        Codingbat cd = new Codingbat();

        System.out.println("alarmClock(1, false) → \"7:00\"  =  " + cd.alarmClock(1,false));
        System.out.println("alarmClock(5, false) → \"7:00\"  =  " + cd.alarmClock(5,false));
        System.out.println("alarmClock(0, false) → \"10:00\"  =  " + cd.alarmClock(0,false));
        System.out.println("alarmClock(0, true) → \"off\"  =  " + cd.alarmClock(0,true));
        System.out.println("alarmClock(1, true) → \"10:00\"  =  " + cd.alarmClock(1,true));
    }

    public static void runExcersize4(){
        /*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
          The sum of these multiples is 23.
          Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
              Note: If the number is a multiple of both 3 and 5, only count it once.
         */
        Codewars cd = new Codewars();

        System.out.println("getSumMult35(10) → 23  =  " + cd.getSumMult35(10));
        System.out.println("getSumMult35(15) → 45  =  " + cd.getSumMult35(15));
        System.out.println("getSumMult35(16) → 60  =  " + cd.getSumMult35(16));
        System.out.println("getSumMult35(20) → 78  =  " + cd.getSumMult35(20));
    }

    public static void runExcersize5(){
        /**
         * There is an array with some numbers. All numbers are equal except for one. Try to find it!
         */
        Codewars cd = new Codewars();

        System.out.println("findUniq([3,3,4,3,3]) -> 4  =  " + cd.findUniq(new double[]{3,3,4,3,3}));
        System.out.println("findUniq([3,3,3,3,2]) -> 2  =  " + cd.findUniq(new double[]{3,3,3,3,2}));
        System.out.println("findUniq([7,3,3,3,3]) -> 7  =  " + cd.findUniq(new double[]{7,3,3,3,3}));
        System.out.println("findUniq([3,6,3,3,3]) -> 6  =  " + cd.findUniq(new double[]{3,6,3,3,3}));
    }

    public static void runExcersize6(){
        Codewars cd = new Codewars();

        System.out.println("isAnagram(\"foefet\", \"toffee\") -> true  =  " + cd.isAnagram("foefet","toffee"));
        System.out.println("isAnagram(\"Buckethead\", \"DeathCubeK\") -> true  =  " + cd.isAnagram("Buckethead","DeathCubeK"));
        System.out.println("isAnagram(\"Twoo\", \"Woot\") -> true  =  " + cd.isAnagram("Twoo","Woot"));
        System.out.println("isAnagram(\"apple\", \"pale\") -> false  =  " + cd.isAnagram("apple","pale"));
    }

    public static void runExcersize7(){
        Codewars cd = new Codewars();

        System.out.println("charCount(\"fizzbuzzZ FIZZBUZZ\",'Z') -> 9  =  " + cd.charCount("fizzbuzzZ FIZZBUZZ",'Z'));
        System.out.println("charCount(\"FIZZBUZZ\",'z') -> 4  =  " + cd.charCount("FIZZBUZZ",'z'));
    }
}
