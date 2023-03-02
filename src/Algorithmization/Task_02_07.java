package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  7.Сформировать квадратную матрицу порядка N по правилу:
//  и подсчитать количество положительных элементов в ней


import java.util.Scanner;

public class Task_02_07 {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = v.nextInt();// Вввод количества строк массива
        int CountAboveZero = 0;
        double[][] X = new double[n][n];


            System.out.println("Ввывод массива");
            for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < X[i].length; j++) {
                    X[i][j]= Math.sin(Math.toRadians((i*i-j*j)/n));
                    System.out.printf("%.5f", X[i][j]); //Вывод массива сгенерированных чисел
                    System.out.print("\t");
                    if (X[i][j] > 0) {
                        CountAboveZero++;
                    }
                }
                System.out.println();
            }
        System.out.print("Элементов массива больше ноля: " + CountAboveZero);
    }
}