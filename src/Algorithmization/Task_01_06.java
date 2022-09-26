package Algorithmization;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//  являются простыми числами.

import java.util.Scanner;
public class Task_01_06 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива N: ");                                                 //Message count massive

        Scanner InputVar = new Scanner(System.in);                                                                      //Init scanner
        short CountArray = InputVar.nextShort();
        System.out.println("Введите нижнюю границу отбора случайных чисел: ");
        double MinRandomNumber = InputVar.nextInt();                                                                       //input MinRandomNumber
        System.out.println("Введите верхнюю границу отбора случайных чисел: ");
        double MaxRandomNumber = InputVar.nextInt();                                                                       //input MaxRandomNumber

        InputVar.close();

        System.out.println("Сформированный массив: ");
        int[] ArrayX = new int[CountArray];                                                                             // init new Array
        for (int i=0; i<ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random()*(MaxRandomNumber-MinRandomNumber+1)+MinRandomNumber);                                                          // random array
            System.out.printf("%d ",ArrayX[i]);
        }
        System.out.println();

        int DivN = 0;
        int SumNumber=0;
        for (int i=0; i<ArrayX.length; i++) {
            for (int k=2; k<i; k++){
                if ((i+1)%k == 0) {
                    DivN++;
                }
            }
            if (DivN == 0) {
                System.out.printf("Простой порядковый номер; %d, значение элемента массива: %d \n", i+1, ArrayX [i]);
                SumNumber += ArrayX [i];
            }
            DivN = 0;
        }
        System.out.printf("Сумма чисел, порядковые номера которых являются простыми числами: %d\n", SumNumber);
    }
}