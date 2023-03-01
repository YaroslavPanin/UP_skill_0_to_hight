package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):


import java.util.Scanner;

public class Task_02_04 {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = v.nextInt();// Вввод количества строк массива

        int[][] X = new int[n][n];

        if (n % 2 == 0) {
            System.out.println("Ввывод массива");
            for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < X[i].length; j++) {
                    if ((i + 1) % 2 != 0) {
                        X[i][j] = j + 1;
                    } else {
                        X[i][j] = n - j;
                    }
                    System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
                }
                System.out.println();
            }
        } else {
            System.out.println("Размерность матрицы нечетная");
        }
    }
}