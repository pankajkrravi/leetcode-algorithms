package com.demo.project.collectionCode;

//# 705. Design HashSet
//Design a HashSet without using any built-in hash table libraries.
//A. void add(key) , B. bool contains(key), C. void remove(key)
public class DesignHashSet {
    /** Initialize your data structure here. */
    //sol1---------- Tc= O(1), Space complexity=O(N) ------------------1
    boolean [] arr;
    DesignHashSet() {
        arr=new boolean[1000001];
   }

    public void add(int key) {
        arr[key]=true;
    }

    public void remove(int key) {
        arr[key] =false;
    }

    //**//** Returns true if this set contains the specified element
    public boolean contains(int key) {
        return arr[key];
    }

    //Sol 2 ---------------------------------------------- 2
   /* private final int MAX_VALUE=1000000;
    private final int ARRAY_SIZE=100;
    private List<List<Integer>> parentList;
    DesignHashSet()
    {
        parentList=new ArrayList<>(ARRAY_SIZE);

    }*/
}

