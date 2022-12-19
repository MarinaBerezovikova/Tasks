package com.company.brunching;

public class BrunchingTask2 {
    public static void main(String[] args){

        int a1 = 452, b1 = -325;
        int c1 = 365, d1 = 362;

        int t1,t2,r;

        if (a1 < b1)
            t1 = a1;
        else t1 = b1;


        if (c1 < d1)
            t2 = c1;
        else t2 = d1;

        if (t1 < t2)
            r = t2;
        else r = t1;

        System.out.println (r);




    }
}
