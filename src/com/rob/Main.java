package com.rob;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        NumberSum twoNumberSum = new NumberSum();
        Integer[] testarray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(twoNumberSum.twoNumberSum(10,testarray)));

    }
}
