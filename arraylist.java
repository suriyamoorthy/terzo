package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(5);
        al.add(15);
        al.add("terzo");
        al.add("true");
        al.add("surya");

         System.out.println(al);
         System.out.println(al.contains("terzo") );
         System.out.println(al.get(5));
         al.set(7, "link");
         System.out.println("index " +al.indexOf("terzo"));
     //    System.out.println(al.remove(6));
        System.out.println("al list is " +al);
        ArrayList al2 = new ArrayList();
        al2.addAll(al);
        System.out.println("al2 list is "+al2);

        ArrayList al3 = new ArrayList();
        al3.add("Chennai");
        al3.add("delhi");
        al3.add("mumbai");
        al3.add("Bangalore");
        System.out.println("al3 list is "+ al3);
        al3.addAll(2,al);
        System.out.println("al3 after addition is "+ al3);
        List al4 = al3.subList(0, 8);
        System.out.println("al4 list is " +al4);
    }
}
