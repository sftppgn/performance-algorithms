package com.rob.ArrayAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class MoveElementToEnd {
    //O(n) time | O(1) space
    public static ArrayList<Integer> moveElementToEnd(ArrayList<Integer> array, Integer toMove){
        int i=0;
        int j= array.size()-1;
        while(i < j){
            //while val at array index j isn't our value, move left until we find it
            while(array.get(j)==toMove && i < j){
                j-=1;
            }
            //if left index is what we want to move, we can swap with j
            if (array.get(i)== toMove){
                Collections.swap(array, i, j);
            }
            i+=1;
        }
        return array;
    }
}
