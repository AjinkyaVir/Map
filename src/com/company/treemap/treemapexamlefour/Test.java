package com.company.treemap.treemapexamlefour;

import java.util.Set;
import java.util.TreeMap;

public class Test {

    public static void main(String[] args) {

        TreeMap<Product,Integer> treeMap = new TreeMap<>(new MyComp());
        treeMap.put(new Product(111,"Chair"),1);
        treeMap.put(new Product(222,"Table"),1);
        treeMap.put(new Product(333,"Fan"),1);
        treeMap.put(new Product(444,"Tube Light"),1);
        treeMap.put(new Product(555,"TV"),1);

        Set<Product> productSet = treeMap.keySet();
        for (Product p : productSet
             ) {
            System.out.println(p.id + " " + p.p_name);
        }


    }

}
