package com.rob.SortAlgo;

//O(nLog(n)) time | O(Log(n)) space

//summary of objective:
//        pick 1 val to be pivot
//        iterate through rest of array, sort in respect to pivot - ie everything smaller to the left, greater to the right
//        the pivot will be in it's final sorted position after first iteration
//        reapply to the subarrays on each sides of the pivot, until done
//        we have 3 points - the pivot, the left pointer, and the right pointer
//        check if the left is greater than pivot, check if right is smaller, if so swap them
//        move left pointer right, move right pointer left
//        when left pointer > right:
//        move pivot to where the right pointer was at
//        we've created 2 subarrays on each side of the pivot, redo the process on the smaller subarray first
public class QuickSort {
    public static int[] quickSort(int[] array){
        array = quickSortHelper(array, 0, array.length -1);
        return array;
    }

    private static int[] quickSortHelper(int[] array, int startIdx, int endIdx){
        //array length 1
        if (startIdx >=endIdx){
            return array;
        }
        int pivotIdx = startIdx;
        int leftIdx = startIdx+1;
        int rightIdx = endIdx;
        int leftIdxSwap = leftIdx;
        int rightIdxSwap = rightIdx;
        int pivotIdxSwap = 0;
        int leftSubArrayLength =0;
        int rightSubArrayLength =0;
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
    //order in array: ^startIdx pivotIdx rightIdx endIdx$
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
