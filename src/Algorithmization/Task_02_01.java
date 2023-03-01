package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

import java.util.Scanner;

public class Task_02_01 {
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
        System.out.println("Введите массив");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                // X[i][j] = v.nextInt(); // Ввод заданных чисел
                X[i][j] = (int) (Math.random() * (MaxRandomNumber - MinRandomNumber + 1) + MinRandomNumber);            // random array
                System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
            }
            System.out.println();
        }
        System.out.println("Вывод результата:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (j % 2 == 0) {
                    if (X[0][j] > X[n - 1][j]) {
                        System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
                    }
                }
            }
            System.out.println();
        }
    }
}