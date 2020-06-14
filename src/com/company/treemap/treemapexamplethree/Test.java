package com.company.treemap.treemapexamplethree;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(11,"Aju");
        treeMap.put(1,"Sau");
        treeMap.put(20,"Anu");
        treeMap.put(6,"Andy");
        treeMap.put(14,"Ganu");
        treeMap.put(21,"Shubhu");
        treeMap.put(33,"Mona");
        treeMap.put(5,"Raju");

        System.out.println(treeMap); //

        SortedMap<Integer,String> stringSortedMap = treeMap.subMap(5,25);
        TreeMap<Integer,String> treeMap1 = new TreeMap<>(stringSortedMap);
        System.out.println(treeMap1);

        SortedMap<Integer,String> stringSortedMap1 = treeMap.tailMap(20);
        TreeMap<Integer,String> treeMap2 = new TreeMap<>(stringSortedMap1);
        System.out.println(treeMap2);

        SortedMap<Integer,String> stringSortedMap2 = treeMap.headMap(20);
        TreeMap<Integer,String> treeMap3 = new TreeMap<>(stringSortedMap2);
        System.out.println(treeMap3);

    }

}
