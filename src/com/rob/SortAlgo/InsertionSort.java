package com.rob.SortAlgo;


import java.util.ArrayList;
import java.util.Collections;

//O(n^2) time | O(1) space
public class InsertionSort {
    public ArrayList<Integer> insertionSort (ArrayList<Integer> array){
        for (Integer i = 0 ; i < array.size() -1; i++){
            Integer counter = i;
            // while target number is less than the previous number in the array
            // swap them
            while (counter > 0 && array.get(counter) < array.get(counter-1)){
                Collections.swap(array, counter, counter-1);
                counter-=1;
            }
        }
    return array;
    }

}
