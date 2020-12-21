package com.rob.SortAlgo;

import java.awt.font.NumericShaper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

    //checking if current number is <= next number
    //continue with next number
    //this is an in-place replacement
    //time O(n^2) n=len(inputarray) since we have nested loops; if array is sorted, time will be O(n)
    //space O(1) since we're performing an in-place replacement

    public ArrayList<Integer> bubbleSort (ArrayList<Integer> array){
        boolean isSorted = false;
        Integer counter = 0;
        while (!isSorted){
            isSorted=true;
            for (Integer i = 0 ; i < array.size() -1 ; i++){
                //System.out.println("i "+i);
                //System.out.println("array "+ array);
                //if the item is greater than the next array item, switch them
                if (array.get(i) > array.get(i+1)){
                    Collections.swap(array, i, i+1);
                    isSorted = false;
                }
            }
        }
    return array;
    }//end of ArrayList

}
