package com.lizogub.HomeWork5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {

    protected String   sName;
    protected Date birthdate;


    public void setName( String sName ) {
        this.sName = sName;
    }

    public String getName() {
        return sName;
    }

    public int getAge() {

        Calendar today    = Calendar.getInstance();
        Calendar birthday = new GregorianCalendar();
        birthday.setTime( birthdate );

        int yearDiff = today.get( Calendar.YEAR ) - birthday.get( Calendar.YEAR );

        if ( today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) )
            yearDiff = yearDiff - 1;
        else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) &&
                today.get(Calendar.DATE)   < birthday.get(Calendar.DATE) ) {
            yearDiff = yearDiff - 1;
        }

        return yearDiff;
    }

    public void setBirthDate(Date aBirthDate) {
        this.birthdate = aBirthDate;
    }

    public void setBirthDate(int iYear, int iMonth, int iDay ) {
        Calendar cal = Calendar.getInstance();
        cal.set( iYear, iMonth, iDay );
        this.birthdate = cal.getTime();
    }

    public Date getBirthDate() {
        return birthdate;
    }

    public String toString() {
        String s = "Name: " + getName() + "\n";
        s += " Age: " + getAge() + "\n";
        return s;
    }

}
