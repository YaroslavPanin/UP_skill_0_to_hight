package Algorethmization;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//  положительных и нулевых элементов.

import java.util.Scanner;
public class Task_01_03 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива N: ");                                                 //Message count massive

        Scanner InputVar = new Scanner(System.in);                                                                      //Init scanner
        int CountArray = InputVar.nextInt();
        System.out.println("Введите верхнюю границу отбора случайных чисел: ");
        int MaxRandomNumber = InputVar.nextInt();                                                                       //input MaxRandomNumber
        System.out.println("Введите нижнюю границу отбора случайных чисел: ");
        int MinRandomNumber = InputVar.nextInt();                                                                       //input MinRandomNumber
        InputVar.close();

        int SumAboveZero = 0;
        int SumLessZero = 0;
        int SumZero = 0;

        System.out.println("Сформированный массив: ");
        int ArrayX[] = new int[CountArray];                                                                             // init new Array
        for (int i=0; i<ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random()*(MaxRandomNumber-MinRandomNumber+1)+MinRandomNumber);                      // random array
            System.out.printf("%d ",ArrayX[i]);                                                                         //
            if (ArrayX [i] > 0) {                                                                                       // check Above Zero
                SumAboveZero++;
            }
            if (ArrayX [i] == 0) {                                                                                      // check = Zero
                SumZero++;
            }
            if (ArrayX [i] < 0) {                                                                                       // check less than Zero
                SumLessZero++;
            }
        }
        System.out.println();
        System.out.printf("Сумма элементов больше ноля: %d \n", SumAboveZero);                                          // output data sum Above Zero
        System.out.printf("Сумма элементов равных ноля: %d \n", SumZero);                                               // output data sum Zero
        System.out.printf("Сумма элементов меньше ноля: %d \n", SumLessZero);                                           // output data sum less than Zero

    }
}
