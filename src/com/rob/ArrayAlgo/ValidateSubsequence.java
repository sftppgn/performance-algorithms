package com.rob.ArrayAlgo;

import java.util.*;
import java.util.Arrays;

public class ValidateSubsequence {
    //input 2 non-empty arrays of ints
    //determine if 2nd array is a subsequence of first

    //O(n) time | O(1) space
    //storing 1 var, iterating per value
    public static boolean isValidSubsequence(Integer[] array, Integer[] sequence){
        Integer seqIdx = 0;
        for (Integer value: array){
            //System.out.println("seqIdx "+ seqIdx);
            //if our sequence index is at the end of the array,
            if (seqIdx == (sequence.length)) {
                //System.out.println("broke on seqIdx " + seqIdx);
                break;
            }
            //if the seqIdx is equal to the value in the array
            if (sequence[seqIdx] ==value){
                //System.out.println("seq idx matched value");
                //System.out.println("sequence idx " +sequence[seqIdx]);
                //System.out.println("value " +value);
               seqIdx +=1;
            }
            }
        return seqIdx == sequence.length;
    }
}
