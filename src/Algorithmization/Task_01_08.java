package Algorithmization;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  8. Дана последовательность целых чисел a1 a2 .... an Образовать новую последовательность, выбросив из
//  исходной те члены, которые равны min(a1 a2 .... an)

import java.util.Scanner;
public class Task_01_08 {
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

        int Min = ArrayX[0];                                                                                            //init min = 1 element of array
        int CountMin =0;                                                                                                //init calc count of min elements

        for (int i=0; i<ArrayX.length; i++) {                                                                           //find Min
            if (Min > ArrayX[i]) {
                Min = ArrayX[i];
            }
        }
        for (int i=0; i<ArrayX.length; i++) {                                                                           // find Count of Min elements
            if (Min == ArrayX[i]) {
                CountMin++;
            }
        }
        int[] ArrayY = new int[N-CountMin];                                                                             // init new array without Min elements, count new array = count arrayX-count min

        System.out.println("\nМассив, где исключены элементы равные минимальному " +Min + ", где количество минимальных элементов " +CountMin + ": ");
        int CountSkip =0;                                                                                               // var for skip elements == Min
        for (int i=0; i<ArrayY.length; i++) {
            if (ArrayX[i+CountSkip]==Min) {                                                                             // init new array without elements == Min
                CountSkip++;
            }
            ArrayY[i] = ArrayX[i+CountSkip];
            System.out.printf("%d ",ArrayY[i]);                                                                         // Output new array
        }
    }
}
