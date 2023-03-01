package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

import java.util.Scanner;

public class Task_02_02 {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        System.out.print("Введите размерность  квадратной матрицы: ");
        int n = v.nextInt();                                                                                            // Вввод
        int[][] X = new int[n][n];
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

        System.out.println("Вывод результата главной диагонали:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i == j) {
                    System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
                }
            }
            System.out.println();

        }
        System.out.println("Вывод результата побочной диагонали:");
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                if (i + j == n - 1) {
                    System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
                }
            }
            System.out.println();

        }
    }
}
