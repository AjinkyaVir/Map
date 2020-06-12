package com.company.treemap.treemapexampletwo;

import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {

        /*
        * public TreeMap(Map<? extends K,? extends V> m)
        Constructs a new tree map containing the same mappings as the given map, ordered according to the natural ordering of its keys.
        * All keys inserted into the new map must implement the Comparable interface. Furthermore,
        * all such keys must be mutually comparable: k1.compareTo(k2) must not throw a ClassCastException for
        * any keys k1 and k2 in the map. This method runs in n*log(n) time.
        Parameters:
        m - the map whose mappings are to be placed in this map
        Throws:
        ClassCastException - if the keys in m are not Comparable, or are not mutually comparable
        NullPointerException - if the specified map is null
        *
        *
        *
        * */


        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Ajinkya", 111);

        TreeMap<String,Integer> treeMap1 = new TreeMap<>(treeMap); // Constructor Approach
        treeMap1.put("Anu",222);

        System.out.println(treeMap1);

        TreeMap<String, Integer> treeMap2 = new TreeMap<>();
        treeMap2.put("Andy",202);

        TreeMap<String, Integer> treeMap3 = new TreeMap<>();
        treeMap3.putAll(treeMap1);
        treeMap3.putAll(treeMap2); // putAll() method approach
        treeMap3.put("Rahulya",303);
        System.out.println(treeMap3);



    }


}
