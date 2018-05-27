package com.lizogub.HomeWork8;



import java.util.*;

public class Tasks {

    // create and print collections with numbers 1...10
    // ArrayList, LinkedList, HashSet, TreeSet
    public void runTask1(){
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<Integer>();
        Set<Integer> treeSet = new TreeSet<Integer>();

        boolean firstPart = true;
        // Fill elements of collections
        for(int i = 1; i <= 10; i++){
            arrayList.add(i);
            linkedList.add(i);
            hashSet.add(i);
            treeSet.add(i);

            // Test difference between List and Set
            if(firstPart && ( i == 9 )){
                i = 5;
                firstPart = false;
            }
        }

        //  Print collections
        System.out.println(arrayList.toString());
        System.out.println(linkedList.toString());
        System.out.println(hashSet.toString());
        System.out.println(treeSet.toString());
    }


    public void runTask2(){
        List<Integer> integers = new ArrayList<Integer>();
        List<String> strings = new ArrayList<String>();

        // Size of collection
        int size = 10;

       for(int i = 0; i < size; i++){
           integers.add((int) Math.floor(Math.random() * 100));
       }

       strings.add("asdf");
       strings.add("line 3");
       strings.add("badas");
       strings.add("axdf");
       strings.add("ncasswf");
       strings.add("aadf");
       strings.add("line 1");
       strings.add("baaf");
       strings.add("line 2");
       strings.add("ccasswf");


        System.out.println("Original integer collection:");
        System.out.println(integers.toString());

        System.out.println("Sorted collection: ");
        Collections.sort(integers);
        System.out.println(integers.toString());

        System.out.println("Original string collection:");
        System.out.println(strings.toString());

        System.out.println("Sorted strings collection:");
        Collections.sort(strings);
        System.out.println(strings.toString());
    }

    public void runTask3(){
        // speed of working collections
        // ArrayList, LinkedList, HashSet, TreeSet
        // add, remove, find

        CollectionTiming collection = new CollectionTiming();
        collection.execAddIntAction(1000000);
        collection.execDeleteIntAction(100000);


    }



}
