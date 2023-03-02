package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  10. Найти положительные элементы главной диагонали квадратной матрицы.

import java.util.Scanner;

public class Task_02_10 {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = v.nextInt();// Вввод количества строк массива
        int[][] X = new int[n][n];
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
        System.out.println("Положительные элементы главной диагонали квадратной матрицы: ");
        for (int i = 0; i < X.length; i++) {                                                                            // output + elements main diagonal
            for (int j = 0; j < X[i].length; j++) {
                if (i==j & X[i][j]>0) {
                System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
                }
            }
        }
    }
}