package com.rob.ArrayAlgo;

import java.util.Hashtable;

public class NumberSum {

    //O(n) time | O(n) space
    //there's an O(n)^2 time O(1) space using loop
    public Integer[] twoNumberSum(Integer targetSum, Integer[] array){
        //input an integer as target sum and an integer array
        //processing: if 2 items of the array sum to the target
        //return the items in an array, in any order
        //else return a zero length array

        Hashtable<Integer,Integer> ht=new Hashtable<Integer,Integer>();
        Integer[] returnArray = new Integer[0];
        ArrayAppend appender = new ArrayAppend();

        for (Integer num: array){
            //potential match is the value of our target minus the current number
           Integer potentialMatch = targetSum - num;
           //if the hash table contains the potential match, append it to our array with the current number, which sum to the target together
           if (ht.containsKey(potentialMatch)) {
               Integer[] finalArray = appender.arrayTwoIntAppend(returnArray, potentialMatch, num);
               return finalArray;
           //if the hashtable doesn't contain the potential match, add it
           } else {
               ht.put(num, num);
           }
        }
        //return the empty array if we don't find a match
        return returnArray;
    }//end of twoNumberSum

}

