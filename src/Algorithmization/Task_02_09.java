package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//  столбец содержит максимальную сумму.

import java.util.Scanner;

public class Task_02_09 {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        System.out.print("Введите число строк: ");
        int n = v.nextInt();// Вввод количества строк массива
        System.out.print("Введите число столбцов: ");
        int m = v.nextInt();// Вввод количества столбцов массива
        int[][] X = new int[n][m];
        System.out.print("Введите нижнюю границу отбора случайных чисел: ");
        int MinRandomNumber = v.nextInt();                                                                              //input MinRandomNumber
        System.out.print("Введите верхнюю границу отбора случайных чисел: ");
        int MaxRandomNumber = v.nextInt();                                                                              //input MaxRandomNumber
        System.out.println("Ввывод массива");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                // X[i][j] = v.nextInt(); // Ввод заданных чисел
                X[i][j] = (int) (Math.random() * (MaxRandomNumber - MinRandomNumber + 1) + MinRandomNumber);            // random array
                System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }

        int[] Y = new int[m];                                                                                           // new array with count of column
        for (int k = 0; k < Y.length; k++) {
            Y[k] = 0;
        }

        System.out.println("Ввывод суммы столбцов");
        for (int k = 0; k < Y.length; k++) {
            for (int i = 0; i < n; i++) {
                Y[k] = Y[k] + X[i][k];
            }
            System.out.print(Y[k] + "\t");
        }


        int Max = Y[0];                                                                                                  //init Max element

        for (int Z : Y) {
            if (Max < Z) {                                                                                               // cycle for find Max
                Max = Z;
            }
        }
        System.out.println();
        System.out.printf("Максимальная сумма значений по столбцу составляет: %d \n", Max);                             // output data Max

        int MaxCount = 0;                                                                                               // init calc for find Max Elements

        for (int Z : Y) {                                                                                               // all Max summ elem
            if (Max == Z) {
                MaxCount++;
            }
        }
        System.out.printf("Количество столбцов с максимальной суммой значений: %d \n", MaxCount);
        System.out.print("Номера столбцов с максимальной суммой: ");

        int[] ArrayMax = new int[MaxCount];                                                                             // array with Number column with MAX SUMM

        int CountForThis = 0;

        for (int k = 0; k < Y.length; k++) {                                                                            // cycle for find number column
            if (Y[k] == Max) {
                ArrayMax[CountForThis] = k + 1;
                CountForThis++;
            }
        }
        for (int k = 0; k < ArrayMax.length; k++) {
            System.out.print(ArrayMax[k] + ", ");
        }
    }
}