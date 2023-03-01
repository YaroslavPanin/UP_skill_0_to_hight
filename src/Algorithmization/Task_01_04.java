package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

import java.util.Scanner;
public class Task_01_04 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива N: ");                                                 //Message count massive

        Scanner InputVar = new Scanner(System.in);                                                                      //Init scanner
        int CountArray = InputVar.nextInt();
        System.out.println("Введите верхнюю границу отбора случайных чисел: ");
        int MaxRandomNumber = InputVar.nextInt();                                                                       //input MaxRandomNumber
        System.out.println("Введите нижнюю границу отбора случайных чисел: ");
        int MinRandomNumber = InputVar.nextInt();                                                                       //input MinRandomNumber
        InputVar.close();

        System.out.println("Сформированный массив: ");
        int[] ArrayX = new int[CountArray];                                                                             // init new Array
        for (int i=0; i<ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random()*(MaxRandomNumber-MinRandomNumber+1)+MinRandomNumber);                      // random array
            System.out.printf("%d ",ArrayX[i]);
            }
        int Min = ArrayX [1];                                                                                           //init min number
        int Max = ArrayX [1];                                                                                           //init max number

        for (int arrayX : ArrayX) {
            if (Min > arrayX) {                                                                                         // cycle find Min
                Min = arrayX;
            }
            if (Max < arrayX) {                                                                                         // cycle find Max
                Max = arrayX;
            }
        }
        System.out.println();
        System.out.printf("Max: %d \n", Max);                                                                           // output data Max
        System.out.printf("Min: %d \n", Min);                                                                           // output data Min

        System.out.println("Сформированный массив c заменой: ");

        for (int z = 0; z < ArrayX.length; z++)                                                                         // Cycle exchange
        {
            if (ArrayX[z] == Min) {                                                                                     // Exchange Min / Max
                ArrayX[z] = Max;
                continue;
            }
            if (ArrayX[z] == Max) {                                                                                     // Exchange Max / Min
                ArrayX[z] = Min;
            }
        }

        for (int arrayX : ArrayX) {                                                                                     // Output result array
            System.out.printf("%d ", arrayX);
        }
    }
}