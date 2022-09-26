package Algorithmization;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i

import java.util.Scanner;
public class Task_01_05 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива N: ");                                                 //Message count massive

        Scanner InputVar = new Scanner(System.in);                                                                      //Init scanner
        int CountArray = InputVar.nextInt();
        System.out.println("Введите верхнюю границу отбора случайных чисел: ");
        int MaxRandomNumber = InputVar.nextInt();                                                                       //input MaxRandomNumber

        InputVar.close();

        System.out.println("Сформированный массив: ");
        int[] ArrayX = new int[CountArray];                                                                             // init new Array
        for (int i=0; i<ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random()*MaxRandomNumber);                                                          // random array
            System.out.printf("%d ",ArrayX[i]);
        }
        System.out.println();
        System.out.println("Сформированный массив где числа, для которых аi > i: ");
        for (int i=0; i<ArrayX.length; i++) {
            if (ArrayX [i] > i) {
            System.out.printf("%d ",ArrayX[i]);}
        }
    }
}