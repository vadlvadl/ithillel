package com.lizogub.HomeWork3;

public class Codingbat {

    /**
     * Given 2 int values, return true if they are both
     * in the range 30..40 inclusive, or they are both
     * in the range 40..50 inclusive.
     */
    public boolean in3050(int a, int b) {
        int minRange1 = 30;
        int maxRange1 = 40;
        int minRange2 = 40;
        int maxRange2 = 50;

        if((a <= maxRange1) && (b <= maxRange1)){
            if((a >= minRange1) && (b >= minRange1)){
                return true;
            }
        }

        if((a <= maxRange2) && (b <= maxRange2)){
            if((a >= minRange2) && (b >= minRange2)){
                return true;
            }
        }

        return false;
    }


    /**
     * You have a green lottery ticket, with ints a, b, and c on it.
     * If the numbers are all different from each other, the result is 0.
     * If all of the numbers are the same, the result is 20.
     * If two of the numbers are the same, the result is 10.
     * */
    public int greenTicket(int a, int b, int c) {

        if((a == b) || (b == c) || (a == c)){
            if((a == b) && (b == c)){
                return 20;
            }

            return 10;
        }

        return 0;
    }

    /**
     * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
     * and a boolean indicating if we are on vacation,
     * return a string of the form "7:00" indicating when the alarm clock should ring.
     * Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
     * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
     * */

    public String alarmClock(int day, boolean vacation) {
        String alarm = "";

        switch(day){
            case 0: alarm = setAlarm(false,vacation);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: alarm = setAlarm(true,vacation);
                break;
            case 6: alarm = setAlarm(false,vacation);
        }

        return alarm;
    }

    protected String setAlarm(boolean isWeekday, boolean vacation){
        if(isWeekday){
            if(vacation){
                return "10:00";
            }
            return "7:00";
        } else {
            if(vacation){
                return "off";
            }
            return "10:00";
        }
    }
}
