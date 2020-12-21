package com.rob.ArrayAlgo;
import java.util.Arrays;

public class ArrayAppend {
    public Integer[] arrayTwoIntAppend(Integer[] array, Integer item, Integer item2){
        Integer[] finalArray = Arrays.copyOf(array, array.length +2) ;
        //System.out.println("array extended by 2, final array length "+ finalArray.length);
        finalArray[finalArray.length-1] = item;
        finalArray[finalArray.length-2] = item2;
        return finalArray;
    }
}
