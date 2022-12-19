package com.company.examples;

public class MyNotes {

    public static void main(String[] args) {


        // точки пересечения медиан
//x:=(x1+x2+x3)/3;
//y:=(y1+y2+y3)/3;

//        Сколько времени выполняется программа:
//        long startTime = System.currentTimeMillis();
//        someMethodWhichYouWantToProfile();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Total execution time: " + (endTime-startTime) + "ms");


        /* Вычисление площади равностороннего треугольнка*/
//        static double S(double a)
//        {
//            return Math.Pow(a,2) * Math.Sqrt(3) / 4;
//
//          Заполнение двумерного массива (подходит и для разных длин строк - одномер мас, так как во втором цикле фор
//          мы берем длину строки по которой идем
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                numbers[i][j] = (int) (Math.random() * 10);
//                System.out.print(numbers[i][j] + "  ");


//        Сортировка вставками
//          В этой вставке первый элемент воспринимается как отсортированный и мы начинаем сортировать со второго
//       public static  void insertSort(int arr[])
//        {
//            int length = arr.length;
//            for (int i = 1; i < length; ++i) {
//                int key = arr[i];
//                int j = i - 1;
//
//                while (j >= 0 && arr[j] > key) {
//                    arr[j + 1] = arr[j];
//                    j = j - 1;
//                }
//                arr[j + 1] = key;
//            }
//          Move elements of arr[0..i-1], that are
//               greater than key, to one position ahead
//               of their current position
//        } https://www.geeksforgeeks.org/insertion-sort/ этот код отсюда


//        Сортировка выбором
// В этой сортировке мы берем максимальный (если сортируем по возрастанию) или минимальный элемент и ставим его в самый конец.
// В первом цикле мы берем за макс элемент первый, далее сравниванием его по очереди с другими, если при сравнении другой оказался больше инициализируем переменную макс другим.
        // Так наибольший элемент встанет вконец (путем обменной операции -  свап)
//
//        public static void selectionSort ( int[] numbers){
//          int min, temp;
//
//          for (int index = 0; index < numbers.length - 1; index++) {
//          min = index;
//              for (int scan = index + 1; scan < numbers.length; scan++)
//                  if (numbers[scan] < numbers[min])
//                  min = scan;
//
//          // Swap the values
//          temp = numbers[min];
//          numbers[min] = numbers[index];
//          numbers[index] = temp;


//        Сортировка пузырьком
//        public static void main(String[] args) {
//            int [] mas = {11, 3, 14, 16, 7};
//
//            boolean isSorted = false;
//            int buf;
//            while(!isSorted) {
//                isSorted = true;
//                for (int i = 0; i < mas.length-1; i++) {
//                    if(mas[i] > mas[i+1]){
//                        isSorted = false;
//
//                        buf = mas[i];
//                        mas[i] = mas[i+1];
//                        mas[i+1] = buf;
//                    }
//                }
//            }
//            System.out.println(Arrays.toString(mas));
//        }
//    }
//  правая граница не на mas.length, а mas.length – 1, поскольку мы сравниваем i-й и i+1-й элементы,
//  и чтобы мы не вышли за пределы массива, делаем на 1 цикл меньше.
/*
        Второй вариант сортировки пузырьком
        public static void main(String[] args) {

            int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

            for (int i = numbers.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
           *//*Сравниваем элементы попарно,
             если они имеют неправильный порядок,
             то меняем местами*//*
                    if (numbers[j] > numbers[j + 1]) {
                        int tmp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = tmp;
                    }
                }
            }

        }
    }*/


//        Печать массива
//
//        public static void main(String[] args) {
//            int[][] array = new int[2][2];
//
//            array[0][0] = 1;
//            array[0][1] = 2;
//            array[1][0] = 3;
//            array[1][1] = 4;
//
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[i].length; j++) {
//                    System.out.print(array[i][j] + "\t");
//                }
//                System.out.println();


//      Экранинование символов
//          \t — Символ табуляции (в java – эквивалент четырех пробелов);
//          \b — Символ возврата в тексте на один шаг назад или удаление одного символа в строке (backspace);
//          \n — Символ перехода на новую строку;
//          \r — Символ возврата каретки;
//          \f — Прогон страницы к началу следующей страницы;
//          \’ — Символ одинарной кавычки;
//          \” — Символ двойной кавычки;
//          \\ — Символ обратной косой черты (\).

//      Как проверить число на простоту
//      https://www.youtube.com/watch?v=snRFphzl-bU&ab_channel=SergeyArkhipovJavaTutorials
//        for (int i = 2; i * i < lenghtArrays; i++) { // решето эратосфена
//            if (isPrime[i]) {
//                for (int j = 2 * i; j < lenghtArrays; j = j + i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//        how it looks
//        https://commons.wikimedia.org/wiki/File:New_Animation_Sieve_of_Eratosthenes.gif?uselang=ru
//         additionals examles
//        https://hd01.ru/info/kak-opredelit-prostoe-chislo-ili-net/

//       Как поменять переменные с переменной буфером
//          c = a;
//          a = b;
//          b = c;

//       Как поменять местами значения переменных без доп переменных (физический вариант)
//          a=a+b;
//          b=a-b;
//          a=a-b;
//         дополнительные способы тут https://tproger.ru/problems/popular-ways-to-swap/


//        нахождение минимального в массиве/ применимо и к максимальному
//        min = Math.min(min, ints[i]); равно if(ints[i]<min) min=ints[i];


//        генерация чисел с помощью Math.random
//        https://vertex-academy.com/tutorials/ru/generaciya-sluchajnyx-chisel-v-java/

//        пример заполнения массива double значениями (тут несколько массивов еще)
//        double[] x = new double[11];
//        double[] y = new double[11];
//        double[][] z = new double[x.length][y.length];
//        for (int i = 0; i < x.length; i++) {
//            x[i] = (double) i * 0.2;
//            for (int j = 0; j < y.length; j++) {
//                y[j] = (double) j * 0.2;
//                z[i][j] = (x[i] + y[j]) / (4 * x[i] * y[j] + 1);


//        пример чтобы сгенерировать дробные числа от -15 до 14
//        int[] array = new int[12];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) Math.round((Math.random() * 30) - 15);
//            System.out.println(array[i]);

//        пример чтобы сгенерировать целые числа
//        Random generator = new Random();
//        int val = 100 - generator.nextInt(201);
//     or int val = generator.nextInt(201) - 100;


//        счетчик изменений
//        int[] A = {1, 8, 3, 6, 5, 10, 31, 24, 10, 13, 2, 4};
//        int k = 0; // кол-во чисел кратных 2
//
//        // расширенный цикл for
//        for (int d : A) {
//            if (d % 2 == 0)
//                k++;
//        }
//        System.out.println(k);

//    /* Возвращает минимум из двух чисел */
//    public static int minFunction(int n1, int n2) {
//        int min;
//        if (n1 > n2)
//            min = n2;
//        else
//            min = n1;
//
//        return min;
//    }
//}

//  public class ExampleMinNumber {
//
//    public static void main(String[] args) {
//        int a = 11;
//        int b = 6;
//        int c = minFunction(a, b);
//        System.out.println("Минимальное значение = " + c);
//    }
//

    }
}