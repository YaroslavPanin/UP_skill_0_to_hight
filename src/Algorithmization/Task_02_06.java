package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):


import java.util.Scanner;

public class Task_02_06 {
    public static void main(String[] args) {

        Scanner v = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = v.nextInt();// Вввод количества строк массива

        int[][] X = new int[n][n];

        if (n % 2 == 0) {
            System.out.println("Ввывод массива");
            for (int i = 0; i < X.length; i++) {
                for (int j = 0; j < X[i].length; j++) {
                    if (i+1<=n/2 & j+1 <= n/2 & i<=j){X[i][j]=1;}
                    if (i+1>n/2 & j+1 <= n/2 & i+j+2>n){X[i][j]=1;}
                    if (i+1<=n/2 & j+1 > n/2 & i+j<n){X[i][j]=1;}
                    if (i+1>n/2 & j+1 > n/2 & j<=i){X[i][j]=1;}
                    System.out.print(X[i][j] + "\t"); //Вывод массива сгенерированных чисел
                }
                System.out.println();
            }
        } else {
            System.out.println("Размерность матрицы нечетная");
        }
    }
}