package com.rob.FamousMisc;


import java.util.ArrayList;

//review required
//time O(n) | space O(1)
public class Kadane {
    //
    //find the greatest summed subarray in a given sorted input array
    // for all subarrays at each index,
    //find the sum of all nums to end of array
    //based on each result, decide to start new or add

    public int kadaneArrayList (ArrayList<Integer> array){
        int maxEndingHere = 0;
        int maxSoFar = 0;
        for (Integer i = 0 ; i < array.size() ; i++) {
           //ArrayList<Integer> maxEndingHere = new ArrayList<Integer>();
           //ArrayList<Integer> maxSoFar = new ArrayList<Integer>();
           maxEndingHere = Math.max(array.get(i),array.get(i)+maxEndingHere);
           maxSoFar = Math.max(maxSoFar, maxEndingHere);
       }
       return maxSoFar;
    }
    public int sublistKadane (int[] array){
        int result = 0;
        int maxSoFar = array[0];
        int maxEndingHere = array[0];

        for (int num: array){
            //maxEndingHere = Math.max(num, maxEndingHere+num);
            if (num>maxEndingHere){
                maxEndingHere=num;
            }else{
                maxEndingHere=maxEndingHere+num;

            }
            //maxSoFar = Math.max(maxSoFar, maxEndingHere);
            if (maxSoFar>maxEndingHere){
                maxSoFar= maxSoFar;
            }else{
                maxSoFar= maxEndingHere;
            }
        }
        //maxEndinghere = max { maxEndingHere+num/num
        //maxSoFar = max { maxSoFar/maxEndingHere

        return maxSoFar;
            }
}
