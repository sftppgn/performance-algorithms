package com.rob.SortAlgo;

import java.util.ArrayList;
import java.util.Collections;

//O(n^2) time | O(1) space
public class SelectionSort {
    //one sublist will represent sorted numbers, the other unsorted
    //this replacement/sublist will exist in place
    public ArrayList<Integer> selectionSort (ArrayList<Integer> array){
        Integer currentIdx = 0;
        Integer smallestIdx = 0;

        while (currentIdx < array.size()-1){
            smallestIdx = currentIdx;
            for (Integer i = smallestIdx+1 ; i < array.size(); i++){
                if (array.get(smallestIdx)> array.get(i)){
                    smallestIdx=i;
                }
            }
            Collections.swap(array, currentIdx, smallestIdx);
            currentIdx+=1;
        }


        return array;
    }

}
