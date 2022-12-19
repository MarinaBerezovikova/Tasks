package com.company.circles;

public class CircleTask2 {
    public static void main(String[] args) {

//  Вычислить отрезок функции на отрезке (промежутке) [а;b] с шагом h

        int r = 10;
        int l = -10;
        int h = 1;
        int x = r;

        for (; x >= l; x = x - h) {

            if (x > 2) {
                System.out.println("Если X равен " + x + ", то Y равен " + x);
            } else { // (x <= 2); удалили, потому что else принимает все что не истинно в if, что нам и надо
                System.out.println("Если X равен " + x + ", то Y равен " + (-x));
            }
        }
    }
}


//for (; x > l && x <= r; x = x - h)
//        for ( int x = r; x > 2 || x <= 2 ; x = x - h) {
//
//                if (x <= r)
//                if (x >= l)
//                System.out.println("Х равен " + x);
//                else
//                break;
//                }
//                }
//                }
