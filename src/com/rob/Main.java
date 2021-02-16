package com.rob;

import com.rob.ArrayAlgo.MergeSort;
import com.rob.ArrayAlgo.ValidateSubsequence;
import com.rob.FamousMisc.Kadane;
import com.rob.LinkedList.ReverseLinkedList;
import com.rob.SortAlgo.BubbleSort;
import com.rob.SortAlgo.InsertionSort;
import com.rob.SortAlgo.QuickSort;
import com.rob.SortAlgo.SelectionSort;
import com.rob.String.PalindromeCheck;
import com.rob.String.ReverseString;
import com.rob.String.isPalindrome;
import org.w3c.dom.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedList testList = new LinkedList();

        testList.add(8);
        testList.add(6);
        testList.add(7);
        testList.add(5);
        testList.add(3);
        testList.add(0);
        testList.add(9);
        ReverseLinkedList revLinkedTest = new ReverseLinkedList();
        revLinkedTest.reverseLinkedList(testList);



//        int array[]= {8,6,7,5,3,0,9,4,-2,2,10,-2,20};
//        int newArray[] = new int [array.length];
//        MergeSort mergeSortTest = new MergeSort();
//        newArray = (mergeSortTest.mergeSort(array));
//        for (int val: newArray){
//            System.out.print(val);
//        }


//        String testString = "eieio";
//        isPalindrome testPalindrome = new isPalindrome();
//        System.out.print(testPalindrome.isPalindrome(testString));

        //int array[]= {8,6,7,5,3,0,9,4,-2,2,10,-2,20};
        //int array[]= {-2,2,10,-2,20,2,4};
//        ArrayList<Integer> testArrayList = new ArrayList<>();
//        testArrayList = new ArrayList<>(Arrays.asList(8, 6, 7, 5, 3, 0, 9, 4));
//        int result = 0;
//        Kadane kadaneTest = new Kadane();
//        result = kadaneTest.kadaneArrayList(testArrayList);
//        System.out.println(result);

//        int array[]= {8,6,7,5,3,0,9,4,2};
//        QuickSort quickSortTest = new QuickSort();
//        array = quickSortTest.quickSort(array);
//        for (int val: array){
//            System.out.print(val);
//        }

//        ArrayList<Integer> testArrayList = new ArrayList<>();
//        testArrayList = new ArrayList<>(Arrays.asList(8, 6, 7, 5, 3, 0, 9, 4));
//        SelectionSort selectionSortTest = new SelectionSort();
//        System.out.println(selectionSortTest.selectionSort(testArrayList));

//        ArrayList<Integer> testArrayList = new ArrayList<>();
//        testArrayList = new ArrayList<>(Arrays.asList(8, 6, 7, 5, 3, 0, 9, 4));
//        InsertionSort insertionSortTest = new InsertionSort();
//        System.out.println(insertionSortTest.insertionSort(testArrayList));

//        NumberSum twoNumberSum = new NumberSum();
//        Integer[] testarray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(twoNumberSum.twoNumberSum(10,testarray)));

        //check if array 2 is a subset of array 1:
//        ValidateSubsequence subsequenceTest = new ValidateSubsequence();
//        Integer[] array2 = {8,9,10};
//        Integer[] array1 = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(subsequenceTest.isValidSubsequence(array1, array2));

        //Bubblesort
//        ArrayList<Integer> testArrayList = new ArrayList<>();
//        testArrayList = new ArrayList<>(Arrays.asList(8, 6, 7, 5, 3, 0, 9, 4));
//        BubbleSort bubbleSortTest = new BubbleSort();
//        System.out.println(bubbleSortTest.bubbleSort(testArrayList));

    }
}
