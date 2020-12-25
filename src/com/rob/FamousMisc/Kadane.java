package com.rob.FamousMisc;


//time O(n) | space O(1)
public class Kadane {
    //find the greatest summed subarray in a given input array
    // for all subarrays at each index,
    //find the sum of all nums to end of array
    //based on each result, decide to start new or add

    public int sublistKadane (int[] array){
        int result = 0;
                result = kadaneHelper(array, 0, array.length -1);
                return result;
            }


    private int kadaneHelper(int[] array, int startIdx, int endIdx){
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
