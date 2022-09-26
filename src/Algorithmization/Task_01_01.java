package Algorithmization;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Scanner;
public class Task_01_01 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");                                                   //Message count massive
        Scanner InputVar = new Scanner(System.in);                                                                      //Init scanner
        int CountArray = InputVar.nextInt();
        System.out.println("Введите К: ");
        int DivK = InputVar.nextInt();                                                                                  //input DivK
        System.out.println("Введите верхнюю границу отбора случайных чисел: ");
        int MaxRandomNumber = InputVar.nextInt();                                                                       //input MaxRandomNumber
        InputVar.close();
        int SumDivK = 0;
        System.out.println("Сформированный массив: ");
        int ArrayX[] = new int[CountArray];                                                                             // init new Array
        for (int i=0; i<ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random()*(MaxRandomNumber-1)+1);                                                    // input array data random number
            System.out.printf("%d ",ArrayX[i]);                                                                         // output array
            if (ArrayX[i] % DivK ==0) {                                                                                 // check DivK
                SumDivK += ArrayX[i];                                                                                   // sum element div K
            }
        }
        System.out.println();
        System.out.printf("Сумма элементов кратных %d равна: %d \n", DivK, SumDivK);                                    // output data
    }
}
