package com.roomiand.list.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {
    public static void main(String[] args) {

        List<Product> productArrayList = new ArrayList<>();
        List<Product> productLinkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i ++) {
            productArrayList.add(new Product(i,"product-" + i,i + 0.1, "GAP"));
            productLinkedList.add(new Product(i,"product-" + i,i + 0.1, "GAP"));
        }

        //insert, update, delete test
        //performance test arrayList
        long before = System.nanoTime();
        productArrayList.add(100000, new Product(1892362,"T-Shirt", 3.5,"LEVIS"));
        long now = System.nanoTime();
        System.out.println("result ArrayList: " + (now - before));

        //performance test linkedList
        before = System.nanoTime();
        productLinkedList.add(100000, new Product(1892363,"T-Shirt", 3.5,"H&M"));
        now = System.nanoTime();
        System.out.println("result LinkedList: " + (now - before));

        System.out.println("--------------------------------");
        //get test
        before = System.nanoTime();
        System.out.println(productArrayList.get(400000).toString());
        now = System.nanoTime();
        System.out.println("result time for ArrayList: " + (now - before));

        before = System.nanoTime();
        System.out.println(productLinkedList.get(400000).toString());
        now = System.nanoTime();
        System.out.println("result time for LinkedList: " + (now - before));

    }

}
