package com.example.demo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args){

        //Auto -generated method stub
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(10);
        ll.add("terzo");
        ll.add("Blue");
        ll.add("true");
        //System.out.println(ll);
      //  ll.addFirst(100);
        System.out.println("Before pool" + ll);
        System.out.println(ll.poll());
        System.out.println("After poll " +ll);
        LinkedList ll2 = (LinkedList) ll.clone();
        System.out.println("cloned object" +ll2);


    }

}
