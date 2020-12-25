package com.rob.String;

public class ReverseString {
    public String reverseString (String string){

        //change to bytes
        byte[] strAsByte = string.getBytes();
        byte[] strAsByteRev = new byte[strAsByte.length];

        //store in reverse order
        for (int i=0;i<strAsByte.length; i++){
            strAsByteRev[i] = strAsByte[strAsByte.length -i -1];
        }

        return new String(strAsByteRev);
    };
}
