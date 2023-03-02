package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//  на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//  пользователь с клавиатуры.

import java.util.Scanner;

public class Task_02_08 {
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

        System.out.print("Введите номер первого столбца для обмена: ");
        int FirstChange = v.nextInt();
        System.out.print("Введите номер второго столбца для обмена: ");
        int SecondChange = v.nextInt();

        int[][] Y = new int[n][m];

        if (FirstChange <= m & FirstChange > 0 & SecondChange <= m & SecondChange > 0 & FirstChange != SecondChange) {
            System.out.printf("Ввывод массива с обменами местами столбцов %d и %d: \n", FirstChange, SecondChange);
            for (int i = 0; i < Y.length; i++) {
                for (int j = 0; j < Y[i].length; j++) {
                    Y[i][j] = X[i][j];
                    if (j == FirstChange - 1) {
                        Y[i][j] = X[i][SecondChange - 1];
                    }
                    if (j == SecondChange - 1) {
                        Y[i][j] = X[i][FirstChange - 1];
                    }

                    System.out.print(Y[i][j] + "\t"); //Вывод массива сгенерированных чисел
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Невозможно обменять столбцы местами");
        }

    }
}