package com.lizogub.HomeWork7;

import com.lizogub.HomeWork6.Animal;
import com.lizogub.HomeWork6.Leopard;
import com.lizogub.HomeWork6.Monkey;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        runArrayListExample();
        runLinkedArrayExample();
        runMapExample();
        runSetExample();
    }


    // Add or remove items at the end of list - ArrayList
    protected static void runArrayListExample(){
        List<String> collection = new ArrayList<String>();

        collection.add("abc");
        collection.add("cba");
        collection.add("bca");

        collection.remove("bca");

        System.out.println("ArrayList Example:");
        for (Object o : collection){
            System.out.println(o);
        }
    }

    // Add or remove items elsewhere in the list - LinkedList
    protected static void runLinkedArrayExample(){
        List<String> collection = new LinkedList<String>();

        collection.add("abc");
        collection.add("cba");
        collection.add("bca");

        collection.remove("cba");

        System.out.println("LinkedList Example:");
        for (Object o : collection){
            System.out.println(o);
        }
    }

    protected static void runSetExample(){
        Set<Animal> zoo = new TreeSet<Animal>();

        zoo.add(new Monkey("Shirly"));
        zoo.add(new Leopard("Joshua"));
        zoo.add(new Monkey("Jilly"));
        zoo.add(new Leopard("Joshua"));

        for (Animal a : zoo){
            System.out.println(a);
        }
    }

    protected static void runMapExample(){
        Map<String,String> db = new HashMap<String, String>();

        db.put("director","Ivan Ivanovich");
        db.put("accountant","Olga Petrovna");

        System.out.println(db.get("director"));
    }
}
