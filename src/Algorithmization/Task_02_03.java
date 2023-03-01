package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class Task_02_03 {
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

        System.out.print("Введите число k, номер строки которую необходимо вывести: ");
        int k = v.nextInt();
        System.out.print("Введите число p, номер стобца который необходимо вывести: ");
        int p = v.nextInt();

        if (p - 1 > n || p - 1 < 0) {
            System.out.printf("Не существет столбца с номером p = %d \n", p);
        } else {
            System.out.println("Ввывод столбца p:");
            for (int i = 0; i < X.length; i++) {
                System.out.print(X[i][p - 1] + "\t"); //Вывод массива сгенерированных чисел
                System.out.println();
            }
        }

        if (k - 1 > n || k - 1 < 0) {
            System.out.printf("Не существет сироки с номером k = %d \n", k);
        } else {
            System.out.println("Ввывод строки k:");
            for (int j = 0; j < X[k - 1].length; j++) {
                System.out.print(X[k - 1][j] + "\t"); //Вывод массива сгенерированных чисел
            }
        }
    }
}