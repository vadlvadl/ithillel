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
    private int intArgument = 777;
    private long startTime;
    private long endTime;
    private long duration;

    protected Map<String,Long> results = new LinkedHashMap<String,Long>();

    protected List<Integer> integerArrayList = new ArrayList<Integer>();
    protected List<Integer> integerLinkedList = new LinkedList<Integer>();

    protected Set<Integer> integerHashSet = new HashSet<Integer>();
    protected Set<Integer> integerTreeSet = new TreeSet<Integer>();
    protected Set<Integer> integerLinkedHashSet = new LinkedHashSet<Integer>();


    public void execAddIntAction(int count){

        duration = this.add(integerArrayList,intArgument,count);
        System.out.println("Add " + count + " Integers " + intArgument + " to ArrayList: " + duration);

        duration = this.add(integerLinkedList,intArgument,count);
        System.out.println("Add " + count + " Integers " + intArgument + " to LinkedList: " + duration);

        duration = this.add(integerHashSet,intArgument,count);
        System.out.println("Add " + count + " Integers " + intArgument + " to HashSet: " + duration);

        duration = this.add(integerTreeSet,intArgument,count);
        System.out.println("Add " + count + " Integers " + intArgument + " to TreeSet: " + duration);

        duration = this.add(integerLinkedHashSet,intArgument,count);
        System.out.println("Add " + count + " Integers " + intArgument + " to LinkedHashSet: " + duration);

    }

    public void execDeleteIntAction(int count){

        duration = this.delete(integerArrayList,intArgument,count);
        System.out.println("Delete " + count + " Integers " + intArgument + " from ArrayList: " + duration);

        duration = this.delete(integerLinkedList,intArgument,count);
        System.out.println("Delete " + count + " Integers " + intArgument + " from LinkedList: " + duration);

        duration = this.delete(integerHashSet,intArgument,count);
        System.out.println("Delete " + count + " Integers " + intArgument + " from HashSet: " + duration);

        duration = this.delete(integerTreeSet,intArgument,count);
        System.out.println("Delete " + count + " Integers " + intArgument + " from TreeSet: " + duration);

        duration = this.delete(integerLinkedHashSet,intArgument,count);
        System.out.println("Delete " + count + " Integers " + intArgument + " from LinkedHashSet: " + duration);

    }


    /*
    * Functions for adding elements to collections
    */

    protected long add(Collection collection, Object object, int count){
        startTime = System.currentTimeMillis();

        for(int i = 0; i < count; i++){
            collection.add(object);
        }

        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    protected long delete(Collection collection, Object object, int count){
        startTime = System.currentTimeMillis();

        for(int i = 0; i < count; i++){
            collection.remove(object);
        }

        endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
