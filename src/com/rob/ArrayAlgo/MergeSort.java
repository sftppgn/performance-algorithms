package com.rob.ArrayAlgo;

public class MergeSort {
    public static int[] mergeSort(int[] array) {
        int middleIdx;
        middleIdx = (array.length/2);
        int[] leftHalf = new int[middleIdx];
        int[] rightHalf = new int[middleIdx];

        if (array.length ==1){
            return array;
        }

        System.arraycopy(array,middleIdx,leftHalf,0,middleIdx+1);
        return leftHalf;
    }
}

