package com.lizogub.HomeWork2;

public class SampleValues {

    private static int defRandomMultiplier = 1000; // get default int from 0 to 1000

    public static int[] getIntSamples(int count) {
        int[] data = new int[count];

        for (int i = 0; i < count; i++) {
            data[i] = (int) (Math.random() * defRandomMultiplier);
        }

        return data;
    }


    public static int[] getIntSamples(int count, int min, int max) {
        int[] data = new int[count];

        for (int i = 0; i < count; i++) {
            data[i] = (int) (Math.random() * (max - min) + min);
        }

        return data;
    }
}
