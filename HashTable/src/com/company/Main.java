// Given an array n+1. Find the duplicate in the array

// Code to add unique values to hash table.

package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
//    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        Hashtable hashtable = new Hashtable();


        System.out.println("Enter the length of array.");
        // get the array len from user
        int arrayLen = scanner.nextInt();

        int userArray[] = new int[arrayLen];

        for (int i = 0; i < arrayLen; i++) {
            System.out.println("Enter the number :");
            userArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int j = 0; j < arrayLen; j++) {
//            System.out.println(userArray[j]);
            if(hashtable.containsValue(userArray[j])){
                System.out.println("Value present");
                continue;
            } else {
                hashtable.put(j+1 , userArray[j]);
            }
        }

        System.out.println(hashtable);

//        for (int j = 0; j < userArray.length; j++) {
//            if (hashtable.containsValue(j)) {
//                System.out.println("Value already present." + hashtable.containsValue(j));
//                hashtable.put(j, userArray[j]);
//            } else {
//                System.out.println("Adding value to the hashtable.");
//                hashtable.put(j, userArray[j]);
//            }
////
//        }


    }

}

