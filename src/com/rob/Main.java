package com.rob;

import com.rob.ArrayAlgo.ValidateSubsequence;
import com.rob.SortAlgo.BubbleSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String test = "asdf";

//        NumberSum twoNumberSum = new NumberSum();
//        Integer[] testarray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(twoNumberSum.twoNumberSum(10,testarray)));

        //check if array 2 is a subset of array 1:
//        ValidateSubsequence subsequenceTest = new ValidateSubsequence();
//        Integer[] array2 = {8,9,10};
//        Integer[] array1 = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(subsequenceTest.isValidSubsequence(array1, array2));

        //Bubblesort
        ArrayList<Integer> testArrayList = new ArrayList<>();
        testArrayList = new ArrayList<>(Arrays.asList(8, 6, 7, 5, 3, 0, 9, 4));
        BubbleSort bubbleSortTest = new BubbleSort();
        System.out.println(bubbleSortTest.bubbleSort(testArrayList));

    }
}
