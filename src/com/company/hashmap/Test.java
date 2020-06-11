package com.company.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(111,"Aju");
        hashMap.put(61,"Kau");
        hashMap.put(201,"Sau");
        hashMap.put(321,"Rahul");
        System.out.println(hashMap);

        Set<Integer> set = hashMap.keySet();
        System.out.println(set);

        Collection<String> collection = hashMap.values();
        System.out.println(collection);

        Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer,String> e: entrySet
             ) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

}
