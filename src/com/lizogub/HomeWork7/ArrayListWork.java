package com.lizogub.HomeWork7;

import java.util.ArrayList;

public class ArrayListWork {
    protected ArrayList<Integer> integers = new ArrayList<Integer>();
    protected ArrayList<String> strings = new ArrayList<String>();

    public void addInteger(Integer value){
        integers.add(value);
    }

    public void addString(String string){
        strings.add(string);
    }

    public void removeInteger(int index){
        integers.remove(index);
    }

    public void removeString(int index){
        strings.remove(index);
    }

    public void removeString(String string){
        strings.remove(string);
    }

    public int getSizeOfIntegers(){
        return integers.size();
    }

    public int getSizeOfStrings(){
        return strings.size();
    }

    public ArrayList<Integer> getIntegers() {
        return integers;
    }

    public ArrayList<String> getStrings() {
        return strings;
    }

    public void printIntegers(){
        for (Integer i:integers) {
            System.out.println("-> " + i);
        }
    }

    public void printStrings(){
        for (String str:strings
             ) {
            System.out.println("=> " + str);
        }
    }
}
