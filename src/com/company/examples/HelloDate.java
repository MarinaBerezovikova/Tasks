package com.company.examples;

public class HelloDate{

    public static void main(String []args){ // пример методов и передачи значений примитивов
        System.out.println("Hello World");

        int a = 4;
        int b = 5;


        multiply(a,b);
        System.out.println("value after method execution " + a);
        System.out.println("value after method execution " + b);

        a = myltiplyAndReturn(a,b);
        System.out.println("value after method execution " + a);
        System.out.println("value after method execution " + b);

    }

    public static void multiply(int a, int b) {
        a = a*b;
        b = a*b;
        System.out.println("value in method " + a);
        System.out.println("value in method " + b);
    }

    public static int myltiplyAndReturn(int a, int b) {
        return a*b;
    }


}

//public class HelloDate {
//    public static void main(String[] args) {
//        System.out.println("Привет, сегодня: ");
//        System.out.println(new Date());
//    }
//}
