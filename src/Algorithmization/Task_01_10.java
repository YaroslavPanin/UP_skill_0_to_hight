package Algorithmization;
//  https://github.com/Java0Tutor/1_Basics_of_software_code_development/blob/master/Practice%20(tasks).pdf
//  10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//  элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.Scanner;
public class Task_01_10 {
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
        for (int i = 0; i < ArrayX.length; i++) {
            ArrayX[i] = (int) (Math.random() * (MaxRandomNumber - MinRandomNumber + 1) + MinRandomNumber);              // random array
            System.out.printf("%d ", ArrayX[i]);
        }
        System.out.println();

        System.out.println("Измененный массив: ");                                                                      // changed array
        for (int i = 0; i < ArrayX.length; i++) {
            if (i % 2 != 0) {                                                                                           // check %2
                ArrayX[i]=0;
            }
            System.out.printf("%d ", ArrayX[i]);
        }
        System.out.println();
    }
}
