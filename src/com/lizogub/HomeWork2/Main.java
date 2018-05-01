package com.lizogub.HomeWork2;

import java.util.Arrays;

public class Main {

    public static void runCodingMore20() {
        int[] samplesA = {20, 21, 22, 39, 41, 1020, 2021, 1022};
        boolean result;

        for (int i = 0; i < samplesA.length; i++) {
            result = Codingbat.more20(samplesA[i]);
            System.out.println("more20(" + samplesA[i] + ") => " + result);
        }
    }

    public static void runCodingSum3() {
        int[] samplesA = {34, 12, 41};
        int result;

        result = Codingbat.sum3(samplesA);
        System.out.println("sum3(" + Arrays.toString(samplesA) + ") => " + result);
    }

    public static void runCodingMax1020() {
        int[] samplesA;
        int[] samplesB;

        samplesA = SampleValues.getIntSamples(10, 10, 20);
        samplesB = SampleValues.getIntSamples(10, 5, 30);

        for (int i = 0; i < 10; i++) {
            int result = Codingbat.max1020(samplesA[i], samplesB[i]);
            System.out.println("max1020(" + samplesA[i] + "," + samplesB[i] + ") => " + result);
        }
    }

    public static void main(String[] args) {
        runCodingMore20();
        runCodingSum3();
        runCodingMax1020();
    }
}
