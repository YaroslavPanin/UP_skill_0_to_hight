package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//  числом. Подсчитать количество замен.

import java.util.Scanner;
public class Task_01_02 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива: ");                                                   //Message count massive

        Scanner InputVar = new Scanner(System.in);                                                                      //Init scanner
        int CountArray = InputVar.nextInt();
        System.out.println("Введите К: ");
        int DivK = InputVar.nextInt();                                                                                  //input DivK
        System.out.println("Введите верхнюю границу отбора случайных чисел: ");
        int MaxRandomNumber = InputVar.nextInt();                                                                       //input MaxRandomNumber
        System.out.println("Введите нижнюю границу отбора случайных чисел: ");
        int MinRandomNumber = InputVar.nextInt();                                                                       //input MinRandomNumber

        InputVar.close();
        int SumDivK = 0;
        System.out.println("Сформированный массив: ");
        int[] ArrayX = new int[CountArray];                                                                             // init new Array
        for (int i=0; i<ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random()*(MaxRandomNumber-MinRandomNumber+1)+MinRandomNumber);                      // input array data random number
            System.out.printf("%d ",ArrayX[i]);                                                                         // output array
            if (ArrayX[i] % DivK ==0) {                                                                                 // check DivK
                SumDivK += ArrayX[i];                                                                                   // sum element div K
            }
        }
        System.out.println();
        System.out.printf("Сумма элементов кратных %d равна: %d \n", DivK, SumDivK);                                    // output data
    }
}
