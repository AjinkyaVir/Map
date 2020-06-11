package com.company.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        LinkedHashMap<Employee,Student> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(new Employee(111,"Aju"), new Student(101,"Sayali"));
        linkedHashMap.put(new Employee(122,"Ajinkya"), new Student(120,"Andy"));
        linkedHashMap.put(new Employee(131,"Abhishek"), new Student(99,"Rupa"));
        linkedHashMap.put(new Employee(151,"Prasad"), new Student(88,"Anu"));

        Set<Employee> set = linkedHashMap.keySet();
        for (Employee s : set
             ) {
            System.out.println(s.emp_id + " " + s.emp_name);
        }

       Set<Map.Entry<Employee, Student>> set1 = linkedHashMap.entrySet();
        for (Map.Entry<Employee, Student> entry : set1) {
            Student student = entry.getValue();
            System.out.println(student.s_id + " " + student.s_name);
        }



    }
}
