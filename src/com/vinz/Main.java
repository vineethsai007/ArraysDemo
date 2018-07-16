package com.vinz;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in) ;

 public static void main(String[] args) {
     int [] myIntegers = getIntegers(8);
     for(int i=0;i<myIntegers.length;i++){
         System.out.println("Element "+i+ " ,input value given is "+myIntegers[i]);

     }
     System.out.println("the average is : "+getAvg(myIntegers));
//        int[] myArray = new int[12];
//        // for(int i=0; i<10;i++){
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i * 10;
//        }
//        printArray(myArray);
//    }
//
//public static void printArray( int[] array){
//            for(int i=0;i<array.length;i++){
//                System.out.println("Element is "+i+" ,and contains value of "+array[i]);
//            }
        }
        public static int[] getIntegers (int number){
            System.out.println("enter "+number+ " integer values here.\n");
            int[] values = new int[number];
            for(int i=0;i<values.length;i++){
                values[i]=scanner.nextInt();

            }
            return values;
        }
        public static double getAvg(int[] array){
        int sum =0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double) sum/ (double) array.length;

        }
    }

