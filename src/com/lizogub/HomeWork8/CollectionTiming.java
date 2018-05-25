package com.lizogub.HomeWork8;
/*
*   This class measures time of execution basic operations with collections.
*
*   Operations:    add(), remove(), find()
*   Collections:   ArrayList, LinkedList, HashSet, TreeSet
*   DataTypes:     integer, String
*
* */
import java.util.*;

public class CollectionTiming {

    List<Integer> integerArrayList = new ArrayList<Integer>();
    List<Integer> integerLinkedList = new LinkedList<Integer>();
    List<String> stringArrayList = new ArrayList<String>();
    List<String> stringLinkedList = new LinkedList<String>();

    Set<Integer> integerHashSet = new HashSet<Integer>();
    Set<Integer> integerTreeSet = new TreeSet<Integer>();
    Set<Integer> integerLinkedHashSet = new LinkedHashSet<Integer>();
    Set<String> stringHashSet = new HashSet<String>();
    Set<String> stringTreeSet = new TreeSet<String>();
    Set<String> stringLinkedHashSet = new LinkedHashSet<String>();


    /*
    * Functions for adding elements to collections
    */
    protected void addToIntArrayList(int value){
        this.integerArrayList.add(value);
    }

    protected void addToIntArrayList( int value, int count){
        for(int i = 0; i < count; i++){
            this.integerArrayList.add(value);
        }
    }

    protected void addToIntLinkedList(int value){
        this.integerLinkedList.add(value);
    }

    protected void addToIntLinkedList( int value, int count){
        for(int i = 0; i < count; i++){
            this.integerLinkedList.add(value);
        }
    }

    protected void addToIntHashSet(int value){
        this.integerHashSet.add(value);
    }

    protected void addToIntHashSet(int value, int count){
        for(int i = 0; i < count; i++){
            this.integerHashSet.add(value);
        }
    }

    protected void addToIntTreeSet(int value){
        this.integerTreeSet.add(value);
    }

    protected void addToIntTreeSet(int value, int count){
        for(int i = 0; i < count; i++){
            this.integerTreeSet.add(value);
        }
    }

    protected void addToIntLinkedHashSet(int value){
        this.integerLinkedHashSet.add(value);
    }

    protected void addToIntLinkedHashSet(int value, int count){
        for(int i = 0; i < count; i++){
            this.integerLinkedHashSet.add(value);
        }
    }

    protected void addToStringArrayList(String value){
        this.stringArrayList.add(value);
    }

    protected void addToStringArrayList( String value, int count){
        for(int i = 0; i < count; i++){
            this.stringArrayList.add(value);
        }
    }

    protected void addToStringLinkedList(String value){
        this.stringLinkedList.add(value);
    }

    protected void addToStringLinkedList( String value, int count){
        for(int i = 0; i < count; i++){
            this.stringLinkedList.add(value);
        }
    }

    protected void addToStringHashSet(String value){
        this.stringHashSet.add(value);
    }

    protected void addToStringHashSet( String value, int count){
        for(int i = 0; i < count; i++){
            this.stringHashSet.add(value);
        }
    }

    protected void addToStringTreeSet(String value){
        this.stringTreeSet.add(value);
    }

    protected void addToStringTreeSet( String value, int count){
        for(int i = 0; i < count; i++){
            this.stringTreeSet.add(value);
        }
    }

    protected void addToStringLinkedHashSet(String value){
        this.stringLinkedHashSet.add(value);
    }

    protected void addToStringLinkedHashSet( String value, int count){
        for(int i = 0; i < count; i++){
            this.stringLinkedHashSet.add(value);
        }
    }



}
