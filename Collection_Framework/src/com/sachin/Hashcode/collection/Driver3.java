package com.sachin.Hashcode.collection;

import java.util.HashSet;

public class Driver3{

    static void add(String str) {

        // Step 1: Generate hashCode
        int hash = str.hashCode();

        // Step 2: Calculate spread hash
        int spreadHash = hash ^ (hash >>> 16);

        // Step 3: Calculate bucket number
        int bucketNumber = spreadHash & 15;

        // Display result
        System.out.println("Product : " + str);
        System.out.println("Hash : " + hash);
        System.out.println("Spread Hash : " + spreadHash);
        System.out.println("Bucket Number : " + bucketNumber);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        HashSet<String> product = new HashSet<>();

        product.add("iPhone17");
        product.add("samsung");
        product.add("lg32");
        product.add("mac-pro324");

        add("iPhone17");
        add("samsung");
        add("lg32");
        add("mac-pro324");
    }
}