package com.company.lines;

public class LineTask4 {

    public static void main(String[] args) {

        double r1 = 111.222;
        // double r2 = ((r1 * 1000) - 111000) + 0.111;
        double r2 = (r1 * 1000) % 1000 + (int) r1 / 1000.0;
        // у последней тысячи обязательно должна быть "." потому что мы работаем с пер.double

        System.out.println(r2);
    }
}
