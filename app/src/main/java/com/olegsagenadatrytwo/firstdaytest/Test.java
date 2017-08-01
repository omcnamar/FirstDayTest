package com.olegsagenadatrytwo.firstdaytest;

import java.util.ArrayList;

/**
 * Created by omcna on 8/1/2017.
 */

public class Test {
    public static void main(String[] args) {
        //divizible by 3 print fiz, by 5 print buz, by both print fix-buz

        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        printFizBuz(myArray);

        //Problem 2
        //Print out the duplicate strings in a arraylist of strings
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("A");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("B");
        stringArrayList.add("E");

        printDuplicate(stringArrayList);
    }

    public static void printFizBuz(int[] array){

        for(int i = 0; i < array.length; i++){
            if(array[i] % 3 == 0 && array[i] % 5 == 0){
                System.out.println("Fiz buz");
            }
            else if(array[i] % 3 == 0){
                System.out.println("Fiz");
            }
            else if(array[i] % 5 == 0){
                System.out.println("Buz");
            }
        }
    }

    public static void printDuplicate(ArrayList<String> myArray){

        for (int i = 0; i < myArray.size(); i++){
            for(int j = 0; j < myArray.size(); j++){
                if(j != i) {
                    if (myArray.get(i) == myArray.get(j)) {
                        //not completely right yet spend all my time on frozen computer
                        System.out.println(myArray.get(i));
                    }
                }
            }

        }
    }
}