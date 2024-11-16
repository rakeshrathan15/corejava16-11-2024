package com.neoteric.corejava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EmployeeTest {


    public static void main(String[] args) {

        Map<Integer,Employee> hasmap=new HashMap<>();


        Employee employee1= new Employee("Rakesh","007");
        Employee employee2= new Employee("Rakesh","007");



        hasmap.put(101,employee1);

        System.out.println();




    }
}
