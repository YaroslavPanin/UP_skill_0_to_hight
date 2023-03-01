package Algorithmization;
//  https://github.com/Java0Tutor/2_Algorithmization/blob/master/Practice%20(tasks).pdf
//  9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//  чисел несколько, то определить наименьшее из них.

import java.util.Scanner;
public class Task_01_09 {
    public static void main(String[] args) {

        Scanner InputVar = new Scanner(System.in);                                                                      //Init scanner
        System.out.print("Введите значение n: ");                                                                       //Message count massive
        short N = InputVar.nextShort();
        System.out.print("Введите нижнюю границу отбора случайных чисел: ");
        int MinRandomNumber = InputVar.nextInt();                                                                       //input MinRandomNumber
        System.out.print("Введите верхнюю границу отбора случайных чисел: ");
        int MaxRandomNumber = InputVar.nextInt();                                                                       //input MaxRandomNumber
        InputVar.close();

        System.out.println("Сформированный массив: ");
        int[] ArrayX = new int[N];                                                                                      // init new Array
        for (int i=0; i<ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random()*(MaxRandomNumber-MinRandomNumber+1)+MinRandomNumber);                      // random array
            System.out.printf("%d ",ArrayX[i]);
        }
        System.out.println();

        int Max = 0;
        int MaxNumber = ArrayX[0];

        for (int i=0; i<ArrayX.length; i++) {
            if (MaxNumber == ArrayX[i]) {
                Max++;
            }
        }

        for (int i=0; i<ArrayX.length; i++) {
            int CheckNumber = ArrayX[i];
            int Check = 0;
            for (int k=0; k<ArrayX.length; k++) {                                                                       // check every array elements
                if (CheckNumber == ArrayX[k]) {
                    Check++;
                }
            }
            if (Check > Max) {                                                                                          //  check elements for max repeat
                Max = Check;
                MaxNumber = CheckNumber;
            }
            if (Check == Max) {                                                                                         // find min element with max repeat
                if (MaxNumber > CheckNumber) {
                    MaxNumber = CheckNumber;
                }
            }
        } 
        System.out.print("Максимальное количество повторений ");
        System.out.println(Max);
        System.out.print("Минимальное число с максимальным количеством повторений ");
        System.out.println(MaxNumber);
    }
}
