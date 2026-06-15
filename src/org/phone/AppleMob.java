package org.phone;


import org.network.*;

import java.util.Scanner;

public class AppleMob {

    public int appleMethod(int a ,int b)
    {
       int c = a + b;
       return c;
    }

    public static void main(String[] args)
    {
        AppleMob am = new AppleMob();
        System.out.println(am.appleMethod(5,3));
    }
}
