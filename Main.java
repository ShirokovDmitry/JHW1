package Java.HW.HW1;

import java.util.Random;

public class Main {
        //    1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = rnd.nextInt(0, 2000);
        System.out.println(i);

        //    2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int n = Integer.toBinaryString(i).length();
        System.out.println(n);



        //    3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        for (int j = i + 1; j <= Short.MAX_VALUE; j++) {
            int[] m1 = new int[Short.MAX_VALUE];
            if (j % n == 0) {
                m1[j] = j;
                // System.out.println(j);
            }
        }
        //   4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        for (int k = i - 1; k >= Short.MIN_VALUE; k--) {
            int[] m2 = new int[Short.MAX_VALUE];
            if (k % n != 0) {
                m2[k] = k;
                // System.out.println(k);
            }
        }
    }
}
