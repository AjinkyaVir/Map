package com.company.treemap;

import sun.reflect.generics.tree.Tree;

import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {

        /*
        * TreeMap()
            Constructs a new, empty tree map, using the natural ordering of its keys.
      *
       * All key inserted into the map must implement the Comparable interface. Furthermore,
       * all such keys must be mutually comparable: k1.compareTo(k2) must not throw a ClassCastException for any keys k1 and k2 in the map.
       * If the user attempts to put a key into the map that violates this constraint (for example,
       * the user attempts to put a string key into a map whose keys are integers),
        * the put(Object key, Object value) call will throw a ClassCastException.
        * */

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Ajinkya",111);
        treeMap.put("Sayali",222);
        treeMap.put("Tanishka",333);
        treeMap.put("Vikarm",444); // Sorting done based on the keys only.

        System.out.println(treeMap);

        TreeMap<Integer,String> treeMap1 = new TreeMap<>();
        treeMap1.put(26,"Swaraj");
        treeMap1.put(22,"Riya");
        treeMap1.put(11,"Tanishka");
        treeMap1.put(18,"Janvhi");
        treeMap1.put(45,"Kavya"); // Sorting done based on the keys only.

        System.out.println(treeMap1);

    }

}
