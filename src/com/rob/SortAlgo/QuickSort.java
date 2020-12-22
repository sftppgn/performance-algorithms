package com.rob.SortAlgo;

import java.util.Collections;

//O(nLog(n)) time | O(Log(n) space

public class QuickSort {
    public static Integer[] quickSort(Integer[] array){
        array = quickSortHelper(array, 0, array.length -1);
        return array;
    }

    private static Integer[] quickSortHelper(Integer[] array, Integer startIdx, Integer endIdx){
        //array length 1
        if (startIdx >=endIdx){
            return array;
        }
        Integer pivotIdx = startIdx;
        Integer leftIdx = startIdx+1;
        Integer rightIdx = endIdx;
        Integer leftIdxSwap = leftIdx;
        Integer rightIdxSwap = rightIdx;
        Integer pivotIdxSwap = 0;
        Integer leftSubArrayLength =0;
        Integer rightSubArrayLength =0;
        Boolean leftSubArrayIsSmaller;

        while(rightIdx>= leftIdx){
            //if leftIdx val is greater than pivotIdx val,
            //and rightIdx val is smaller than pivotIdx val
            //switch them
            if (array[leftIdx] > array[pivotIdx] && array[rightIdx] < array[pivotIdx]){
                leftIdxSwap = array[leftIdx];
                rightIdxSwap = array[rightIdx];
                array[rightIdx] = leftIdxSwap;
                array[leftIdx] = rightIdxSwap;
            }

            if (array[leftIdx] <= array[pivotIdx]){
                leftIdx += 1;
            }

            if (array[rightIdx] >= array[pivotIdx]){
               rightIdx -=1;
            }

        }
    //swap pivotIdx value with rightIdx value
    pivotIdxSwap = array[pivotIdx];
    rightIdxSwap = array[rightIdx];
    array[pivotIdx] = rightIdxSwap;
    array[rightIdx] = pivotIdxSwap;

    //call the above again on the 2 subarrays, smaller first
    //order in array: ^startIdx pivotIdx rightIdx endidx$
    leftSubArrayLength = rightIdx - 1 - startIdx;
    rightSubArrayLength = endIdx - (rightIdx +1);

    leftSubArrayIsSmaller = (leftSubArrayLength < rightSubArrayLength);
    if (leftSubArrayIsSmaller){
        quickSortHelper(array, startIdx, rightIdx -1);
        quickSortHelper(array, rightIdx +1, endIdx);
    }else{
        quickSortHelper(array, rightIdx +1, endIdx);
        quickSortHelper(array, startIdx, rightIdx -1);
    }
        return array;
    }//end of array implementation
}
