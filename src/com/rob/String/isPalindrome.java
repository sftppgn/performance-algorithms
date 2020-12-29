package com.rob.String;

import java.util.*;
public class isPalindrome {

        public static boolean isPalindrome(String string) {

            byte[] strAsByte = string.getBytes();
            byte[] strAsByteRev = new byte[strAsByte.length];

            //store in reverse order
            for (int i=0;i<strAsByte.length; i++){
                strAsByteRev[i] = strAsByte[strAsByte.length -i -1];

                System.out.println("str as byte -1 " + strAsByte[strAsByte.length -i -1]);
                System.out.println("strAsByte i" + strAsByte[i]);
                System.out.println("strAsByte length " + strAsByte.length);
                System.out.println("i " +i);
                System.out.println(" ");
            }

            String newString = new String();
            newString = new String(strAsByteRev);

            return (newString.equals(string));
        }
}
