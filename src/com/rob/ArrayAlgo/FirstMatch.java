package com.rob.ArrayAlgo;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstMatch {
    //first occurence of a duplicate array val

    //brute force
    //O(n^2) time | O(1) space
    public Integer firstDuplicateValueBrute (ArrayList<Integer> array){
        int minimumSecondIndex = array.size();
        for (Integer i = 0 ; i < array.size(); i++){
            Integer value = array.get(i);
            for (Integer j = 0 ; j < array.size(); j++){
                Integer valueToCompare = array.get(j);
                if (value == valueToCompare){
                    minimumSecondIndex = array.get(i);
                    return array.get(i);
                }
            }
        }
        return -1;
    }//end of brute force

    //O(n) time | O(n) space
    public Integer firstDuplicateValueHash (int[] array){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int index=0;
        for (int value: array){
            if (hm.containsValue(value)){
                return value;
            }
            hm.put(index, value);
            index++;
        }
        return -1;
    }

    //
}
