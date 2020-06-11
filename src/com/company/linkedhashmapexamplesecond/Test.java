package com.company.linkedhashmapexamplesecond;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        LinkedHashMap<Integer,Product> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,new Product(111,"Pen",10.50));
        linkedHashMap.put(2,new Product(222,"Pencil",7.51));
        linkedHashMap.put(3,new Product(333,"Eraser",5.00));
        linkedHashMap.put(4,new Product(444,"Sharpner",3));
        linkedHashMap.put(5,new Product(555,"Sketch pen",25.60));

        Set<Map.Entry<Integer,Product>> set = linkedHashMap.entrySet();
        Iterator<Map.Entry<Integer,Product>> iterator = set.iterator();

        while (iterator.hasNext()){

            Map.Entry<Integer,Product> productEntry = iterator.next();
            Product product =  productEntry.getValue();

            if (product.p_id == 111){
                iterator.remove();
            }
            if (product.p_name.equals("Sharpner"))
                iterator.remove();

        }
        for (Map.Entry<Integer, Product> p: linkedHashMap.entrySet()
             ) {
            Product product = p.getValue();
            System.out.println(product.p_id + " " + product.p_name + " " + product.p_cost);
        }
    }

}
